/**
 * 
 */
package com.fitweber.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
/**
 *2012-9-2 DataBase.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public class DataBase {
	private String uri;
	private String driver;
	private String username;
	private String password;
	private Connection con;
	private Statement statement;
	private PreparedStatement prepareStatement;
	private String sql;
	private ResultSet rs;	
	
	public void init(String basePath){
		try {
			String cfguri = basePath+"\\config\\dbconfig.ini";
			cfguri = cfguri.replace("\\", "/");
			File dbconfig = new File(cfguri);
			FileReader in = new FileReader(dbconfig);
			BufferedReader reader = new BufferedReader(in);
			String str =null;
			str = reader.readLine();
			driver = str.trim().substring(str.trim().indexOf("=")+1);
			str = reader.readLine();
			uri = str.trim().substring(str.trim().indexOf("=")+1);
			str = reader.readLine();
			username = str.trim().substring(str.trim().indexOf("=")+1);
			str = reader.readLine();
			password = str.trim().substring(str.trim().indexOf("=")+1);
			reader.close();
			in.close();
			Class.forName(driver);
			con = DriverManager.getConnection(uri, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet QueryWithStatement(String sql){
		try {
			statement =con.createStatement();
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet QueryWithPreparedStatement(String sql){
		try {
			String flag = sql.substring(0,6);
			//System.out.println(flag);
			if("SELECT".equals(flag)){
				prepareStatement =con.prepareStatement(sql);
				rs = prepareStatement.executeQuery();
			}
			else{
				prepareStatement =con.prepareStatement(sql);
				prepareStatement.executeUpdate(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void close(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test(){
		DataBase db = new DataBase();
		db.init("");
		db.QueryWithStatement(sql);
		try {
			ResultSet rs =db.getRs();
			while(rs.next())
			System.out.println(db.getRs().getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.close();
	}
	
	
	/**getter and setter**/
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public PreparedStatement getPrepareStatement() {
		return prepareStatement;
	}

	public void setPrepareStatement(PreparedStatement prepareStatement) {
		this.prepareStatement = prepareStatement;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}
