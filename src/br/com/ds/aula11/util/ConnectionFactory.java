package br.com.ds.aula11.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;


public class ConnectionFactory{
	
	public static Connection getConnection() {
	
	String strUrlCon = "jdbc:mysql://localhost/" + "DB_AULA?useTimezone=true&serverTimezone=UTC";
	String strTxtUser = "root";
	String strTxtPwd = "123456Root*";
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection(strUrlCon, strTxtUser, strTxtPwd);
	}
	
	catch (SQLException ex) {
		
		Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		throw new RuntimeErrorException(null, "Erro SQLException ao abrir a conexão em ConnectFactory");
	}
	
	catch (ClassNotFoundException ex) {
		Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		throw new RuntimeErrorException(null, "Erro ClassNotFoundException em ConnectionFactory");
	}

	}
}

