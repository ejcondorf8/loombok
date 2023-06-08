package ec.edu.uce.git;

import ec.edu.uce.git.dto.Animal;
import ec.edu.uce.git.dto.Persona;
import ec.edu.uce.git.srv.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		Test test = new Test();
		Persona p = test.p;
		Animal a = test.a;
		
		p.setFirstName(a.getFirstName());
		a.setFirstName(p.getLastName());
		System.out.println(p.toString());
		System.out.println(a.toString());

	}
}
