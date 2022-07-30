package com.github.fabiosilva458.todo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.github.fabiosilva458.todo.model.Todo;
import com.github.fabiosilva458.todo.repository.TodoRepository;

@SpringBootApplication
@RestController
public class TodoApplication {
	@Autowired
	private TodoRepository todoRepository;
	@Bean
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
		
				Todo todo = new Todo();
				
				todo.setDescription("Estuda Java");
				todo.setCreatDate(LocalDateTime.now());
				todoRepository.save(todo);
				
				
				
			}
		};
		
	}
	
	
    
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		
		
	}

}
