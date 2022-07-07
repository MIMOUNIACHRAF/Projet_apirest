package ma.eheio.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.eheio.students.model.Student;
import ma.eheio.students.repository.StudentsRepository;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner{


	@Autowired
	private StudentsRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	
	
}
