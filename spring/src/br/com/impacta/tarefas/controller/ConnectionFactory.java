package br.com.impacta.tarefas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3303/impacta","root","impacta");
			System.out.println("Conectado!");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
