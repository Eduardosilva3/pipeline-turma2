package com.teste.RodandaoPipeline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RodandaoPipelineApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(RodandaoPipelineApplication.class, args);
		System.out.println("Digite o seu CPF: ");
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String cpf = scan.readLine();
		
		System.out.println("O CPF digitado é: " + (ValidadorCpf.validar(cpf) ? "Verdadeiro " : "falso"));
	}

}
