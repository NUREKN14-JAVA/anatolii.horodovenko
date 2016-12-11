package com.nixsolutions.usermanagment.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryImpl implements ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public ConnectionFactoryImpl(String driver, String url, String user,
			String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	@Override
	public Connection createConnection() throws DatabaseException {
		String url ="jdbc:hsqldb:file:db/usermanage";
		String user ="sa";
		String password ="";
		String driver = "org.hsqldb.jdbcDriver";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		// TODO Auto-generated method stub
		try {
			return DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DatabaseException(e);
		}
	}

}
