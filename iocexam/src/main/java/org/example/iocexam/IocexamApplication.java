package org.example.iocexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IocexamApplication {


	public static void main(String[] args) {

		SpringApplication.run(IocexamApplication.class, args);

	}
//	@Autowired
	private Book book;

	@Bean
	public CommandLineRunner run(Book book){
		return args -> {
			book.setTitle("모두의 자바");
			System.out.println(book.getTitle());
		};
	}

}
