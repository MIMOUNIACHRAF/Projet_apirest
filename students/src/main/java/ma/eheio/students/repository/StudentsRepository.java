package ma.eheio.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.eheio.students.model.Student;


@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {

}
