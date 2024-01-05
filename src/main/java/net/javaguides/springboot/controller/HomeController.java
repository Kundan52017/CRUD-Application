package net.javaguides.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.Students;
import net.javaguides.springboot.repository.StudentsRepository;

@RestController
public class HomeController {
	@Autowired
	private StudentsRepository studentsRepository;
	
	@GetMapping("/")
	public String index()
	{
		return"Welcome  to spring boot crud application!";
	}
	// Handler for create new record in DataBase
	@PostMapping("/saveStudents")
	public Students saveData(@RequestBody Students students)
	{
		studentsRepository.save(students);
		return students;
	}
	// Handler for fatch a  single Record from Data
	@GetMapping("/getStudents/{rollNo}")
	public Students getStudentsData(@PathVariable int rollNo) {
	   java.util.Optional<Students> students = studentsRepository.findById(rollNo);
	    Students students1 = students.get();
	    return students1;
	}

	// Handler for fatch all  data from DB
	@GetMapping("/getAllStudents")
	public List<Students> getAll(){
		List<Students>studentsList= studentsRepository.findAll();
		
		return studentsList;

	}
	// Handler for  delete a particular record from  DB
	@DeleteMapping("/deleteStudents/{rollNo}")
	public  String deleteStudents(@PathVariable int rollNo)
	{
	 Students students=studentsRepository.findById(rollNo).get();	
	if(students!=null)
		studentsRepository.delete(students);
	 return "Deleted Sucessfully! !";	
	}
	// Handler for update particular record  from DB
	@PutMapping("/updateData")
	public Students updateStudentsData(@RequestBody Students students)
	{
		studentsRepository.save(students);
		return students;
	}
	
}