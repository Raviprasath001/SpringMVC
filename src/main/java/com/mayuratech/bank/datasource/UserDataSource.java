package com.mayuratech.bank.datasource;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.stereotype.Component;

@Component("dataSource")
public class UserDataSource {

	public java.sql.Connection getSQLConnection() throws SQLException, ClassNotFoundException, NamingException {
		java.sql.Connection connection = null;
		try {
			Context ctx = new InitialContext();
			javax.sql.DataSource dataSource = (javax.sql.DataSource) ctx
					.lookup("java:jboss/datasources/samplejdbcSQLDS");
			connection = dataSource.getConnection();
			DatabaseMetaData dmd = connection.getMetaData();

			if (connection != null) {
				System.out.println("Connected to db!");
			}
			return connection;
		} catch (SQLException ex) {
			return null;
		}

	}
}
