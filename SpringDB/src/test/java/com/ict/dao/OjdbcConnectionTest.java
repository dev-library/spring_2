package com.ict.dao;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class OjdbcConnectionTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		//18버전 설치자는
		//jdbc:oracle:thin:@localhost:1521/XEPDB1
		//으로 아래 jdbcUrl의 value를 고쳐주세요.
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"mytest",
				"mytest")){
			log.info(con);
			log.info("정상적으로 연결되었습니다.");
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	
	
}
