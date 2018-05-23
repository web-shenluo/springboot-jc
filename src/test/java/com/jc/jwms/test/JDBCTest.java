package com.jc.jwms.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jc.jwms.pojo.Juser;


/**
 * 测试连接数据库
 * @author: shenluo
 * @date: 2018年5月22日 下午2:43:38 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest
public class JDBCTest {
	
	@Autowired
	private  JdbcTemplate  jdbcTemplate;
	
	@Test  
	public void findUser(){
		List<Juser> list = jdbcTemplate.query("select * from juser", new UserRowMapper());
		System.out.println(list.get(0).getName()+"--"+list.get(0).getSex());
	}

}

class UserRowMapper implements RowMapper<Juser> {  
	  
    @Override  
    public Juser mapRow(ResultSet rs, int rowNum) throws SQLException {  
    	Juser user = new Juser();  
        user.setId(rs.getInt("id"));  
        user.setName(rs.getString("name"));  
        user.setSex(rs.getString("sex"));  
        return user;  
    }
} 
