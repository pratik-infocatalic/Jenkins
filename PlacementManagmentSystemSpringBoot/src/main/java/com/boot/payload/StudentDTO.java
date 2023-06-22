package com.boot.payload;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.serializer.Serializer;

import com.boot.repository.StudentRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class StudentDTO
{
	private Integer studentId;
	  
    private String studentName;

    private String studentEmail;

    private Integer studentAge;

    private String studentPassword;

    private String studentClass;
    
    private String studentCGPA;
    
    
   


	



	



	@JsonIgnore
    private List<ApplyJobDTO> studentList=new ArrayList<>();
	
	
	
	public void setStudentList(List<ApplyJobDTO> studentList) {
		this.studentList=studentList;
	}
	
	

}
