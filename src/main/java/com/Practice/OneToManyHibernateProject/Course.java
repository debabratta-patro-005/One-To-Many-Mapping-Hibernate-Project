package com.Practice.OneToManyHibernateProject;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String nameString;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String nameString, Student student) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.student = student;
	}

	public Course(String nameString, Student student) {
		super();
		this.nameString = nameString;
		this.student = student;
	}

	public Course(String nameString) {
		super();
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", nameString=" + nameString + ", student=" + student + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nameString, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return id == other.id && Objects.equals(nameString, other.nameString) && Objects.equals(student, other.student);
	}
	
	

}
