package ma.eheio.students.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.eheio.students.model.Student;
import ma.eheio.students.repository.StudentsRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentsRepository repo;
	
	
	//  CREATE
	@PostMapping("student")
	public Student create(@RequestBody Student student) throws IllegalArgumentException {
		
		List<Student> stmt = this.listAll();
		for (Student s : stmt) {
			if(student.getCin().equals(s.getCin())) {
				throw new IllegalArgumentException("CIN existe dèja");
			}
		}
		
		return repo.save(student);
	}
	
	//  READ
	@GetMapping("/student/{id}")
	public Student read(@PathVariable(value="id") Long id) {
		return repo.findById(id).get();
	}
	@GetMapping("/students/list")
	public List<Student> listAll() {
		return repo.findAll();
	}
	
	
	
	//  UPDATE
	@PutMapping("/student/{id}")
	public Student update(@PathVariable(value="id") Long id, @RequestBody Student studentDetails) throws IllegalArgumentException {
		
		List<Student> stmt = this.listAll();
		for (Student s : stmt) {
			if(studentDetails.getCin().equals(s.getCin())) {
				throw new IllegalArgumentException("CIN existe dèja");
			}
		}
		
		Student student = repo.findById(id).get();
		
		student.setCin(studentDetails.getCin());
		student.setNom(studentDetails.getNom());
		student.setPrenom(studentDetails.getPrenom());
		
		return repo.save(student);
	}
	
	//  DELETE
	@DeleteMapping("/student/{id}")
	public void delete(@RequestParam Long id){
		repo.deleteById(repo.getById(id).getId_student());
	}
}
