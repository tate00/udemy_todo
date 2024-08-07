package com.example.todo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.todo.repository.task")
public class TodoApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);
	}

}
