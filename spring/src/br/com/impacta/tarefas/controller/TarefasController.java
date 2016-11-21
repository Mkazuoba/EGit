package br.com.impacta.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.impacta.model.Tarefa;

@Controller
	public class TarefasController {
	  @RequestMapping("novaTarefa")
	  public String form() {
	    return "formulario";
	  }
	  
  @RequestMapping("adicionaTarefa")
	  public String adiciona(Tarefa tarefa) {
	    TarefaDao dao = new TarefaDao();      
	    dao.adiciona(tarefa);
	    return "adicionada";
	  }


}


