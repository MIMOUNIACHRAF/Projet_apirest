package ma.eheio.students.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student  {
	
	/**
	 * 
	 
	private static final long serialVersionUID = 1L;*/





	@Override
	public String toString() {
		return "[  " + id_student + "  |  " + cin + "  |  " + nom + "  |  " + prenom + "  ]";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_student;
	
	private String cin;
	private String nom;
	private String prenom;
	
	
	


	public Student() {
		super();
	}
	public Student( String cin, String nom, String prenom) {
		super();
		
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Long getId_student() {
		return id_student;
	}
	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
