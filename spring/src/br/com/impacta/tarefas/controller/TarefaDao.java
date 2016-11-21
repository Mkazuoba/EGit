package br.com.impacta.tarefas.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.impacta.model.Tarefa;

public class TarefaDao {

	  private Connection connection;
	  
	  public TarefaDao() {
		     this.connection = new ConnectionFactory().getConnection();
		   }
	
	  public void adiciona(Tarefa tarefa) {
	       String sql = "insert into t " +
	               "(descricao )" + " values (?)";
	   
	       try {
	           // prepared statement para inserção
	           PreparedStatement stmt = connection.prepareStatement(sql);
	   
	           // seta os valores
	           stmt.setString(1,tarefa.getDescricao());
	          
	           // executa
	           stmt.execute();
	           stmt.close();
	       } catch (SQLException e) {
	           throw new RuntimeException(e);
	       }
	   }
	  
	
}


