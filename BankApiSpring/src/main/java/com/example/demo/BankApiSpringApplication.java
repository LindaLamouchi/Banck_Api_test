package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entities.Contact;

@SpringBootApplication
public class BankApiSpringApplication implements CommandLineRunner {
    @Autowired
	private ContactRepository contactRepository; 
	public static void main(String[] args) {
		SpringApplication.run(BankApiSpringApplication.class, args);
	}
//
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Linda","LAmouchi",df.parse("11/08/1997"),"lamouchi@gmail.com",65412,"tofo.png"));
		contactRepository.save(new Contact("Lina","LAmouchi",df.parse("11/08/1994"),"lamouchilin@gmail.com",65412,"h.jpeg"));
		contactRepository.save(new Contact("Aziz","LAmouchi",df.parse("11/08/2008"),"lamouchiaziz@gmail.com",65412,"vl.png"));
		contactRepository.save(new Contact("Hana","LAmouchi",df.parse("11/08/2000"),"lamouchihana@gmail.com",65412,"h.jpg"));
	   contactRepository.findAll().forEach(c->{
		   System.out.println(c.getNom());
	   });
	}

}
