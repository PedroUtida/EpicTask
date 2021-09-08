package br.com.fiap.EpicTask.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.EpicTask.model.Task;
import br.com.fiap.EpicTask.repository.TaskRepository;

@Controller
public class TaskController {
	
	@Autowired
	private TaskRepository repository;

	@RequestMapping("/home")
	public String index() {
		return "login";
	}

	@GetMapping("/mostrar")
	public ModelAndView listagem() {
		ModelAndView modelAndView = new ModelAndView("list");
		List<Task> list = repository.findAll();
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
	@PostMapping("/mostrar")
	public String save(@Valid Task task, BindingResult result) {
		if(result.hasErrors()) {
			return "cadastro";
		}
		repository.save(task);
		return "login";
	}

	@RequestMapping("/cadastro")
	public String register(Task task) {
		return "cadastro";
	}

}