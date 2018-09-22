package study.java;

import java.util.Date;

import study.java.object.Employee;

public class Main {
	public static void main(String[] args) {
		System.out.println("Xin chao");
		//1. create employee
		
		Employee employee1 = new Employee(); // => instance
		//System.out.println(employee1.name);
		
		employee1.setName("Kien");
		String name = employee1.getName();
		
		System.out.println("Name cua employee1: " + name);
		
		employee1.setAge(25);
		Integer age = employee1.getAge();
		
		System.out.println("Age cua employee1: " + age);
		
		employee1.setBirthDate(new Date());
		Date brithdate = employee1.getBirthDate();
		
		System.out.println("BrithDate cua employee1: " + brithdate);
		
		employee1.setSalary(20);
		Integer salary = employee1.getSalary();
		
		System.out.println("Salary cua employee1: " + salary);
		 
		
		Employee employee2 = new Employee(); 
		employee2.setName("Huy");
	}
	
	
	
}
