package com.dutch.module.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.dutch.module.exception.GlobalException;
import com.dutch.utils.SPUtils;

@Repository
public class LoginDao {
	private  final Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	public DataSource ds;
	
	
	public LoginResult login(String email,String password,int roll) {
		long startTime=System.currentTimeMillis();
		LoginResult login=null;
		try {
		Map<String,Integer> outputparam=SPUtils.getEmptyOutputParams();
		MapSqlParameterSource inputparam=SPUtils.spInputParameters()
				.addValue("email", email).addValue("password", password).addValue("roll",roll);
		
		Map<String,RowMapper<?>> loginMapper=new HashMap<String,RowMapper<?>>(); 
		loginMapper.put("#reselt-set1", new RowMapper<LoginBean>() {

			@Override
			public LoginBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				LoginBean linfo=new LoginBean();
				linfo.setEmail(rs.getString("email"));
				linfo.setFirst_name(rs.getString("first_name"));
				linfo.setId(rs.getInt("id"));
				System.out.println(linfo);
				return linfo;
			}
			
		});
		login=new LoginResult();

		Map<String,Object> m=SPUtils.executeMultiple(ds, null, SPUtils.CHECK_LOGIN_AUTHONTICATION, inputparam, outputparam, loginMapper);
		ArrayList user=(ArrayList) m.get("#reselt-set1");
		System.out.println("user: "+user);
		login.setBean((LoginBean) user.get(0));
		 log.debug("SP call to Login took " + (System.currentTimeMillis() - startTime) + " milli seconds.");
		
		}
		catch (Exception e) {
			e.printStackTrace();
			log.debug("An error occurred while checking login data. Please Contact Support team.");
		throw	new GlobalException("An error occurred while checking login data. Please Contact Support team.");
		}
		return login;
		
	}
	
	

}
