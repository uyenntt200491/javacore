package study.java.object;

import java.io.Serializable;
import java.util.Date;

public class Employee extends Object implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	Name => String
//	Age => int, Integer
//	Salary => int, Integer
//	birthDate => Date

	String name;
	Integer age;
	private Integer salary;
	private Date birthDate;

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
