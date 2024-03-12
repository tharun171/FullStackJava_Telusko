package com.Telusko.JavaConcepts.Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class School
{
	private int schlid;
	private String schlName;
	private List<Employee> employee;
	public int getSchlid() {
		return schlid;
	}
	public void setSchlid(int schlid) {
		this.schlid = schlid;
	}
	public String getSchlName() {
		return schlName;
	}
	public void setSchlName(String schlName) {
		this.schlName = schlName;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public School(int schlid, String schlName, List<Employee> employee) {
		super();
		this.schlid = schlid;
		this.schlName = schlName;
		this.employee = employee;
	}
	public School() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "School [schlid=" + schlid + ", schlName=" + schlName + ", employee=" + employee + "]";
	}
	
	
	
}

class Employee {
    private int id;
    private String name;
    private String role;

    // Constructor and other methods
    

    public int getId() {
        return id;
    }

    public Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
    
    

    // Other methods, getters, setters, etc.
}



public class SortObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> employeeList = new ArrayList<>();
		 employeeList.add(new Employee(10,"tarun","developer"));
		 employeeList.add(new Employee(13,"revi","developer"));
		 employeeList.add(new Employee(6,"varun","developer"));
		 List<Employee> employeeList1 = new ArrayList<>();
		 employeeList1.add(new Employee(54,"keiran","developer"));
		employeeList1.add(new Employee(45,"run","developer"));
		 
		 
		 List<School> schoolList = new ArrayList<>();
		schoolList.add(new School(1,"rony",employeeList));
		schoolList.add(new School(2,"fnwero",employeeList1));
		
		 


		//this returns
		//employees sorted by id in school
	      List<School> list =  schoolList.stream()
	    		  .map(school -> {
	    			  List<Employee> sortedEmployees = school.getEmployee()
	                            .stream()
	                            .sorted(Comparator.comparing(Employee::getId))
	                            .collect(Collectors.toList());
	                    school.setEmployee(sortedEmployees);
	                    return school;
	    		  }).collect(Collectors.toList());
	      
	      for(School sc:list)
	      {
	    	  System.out.println(sc.toString());
	    	  for(Employee em:sc.getEmployee())
	    	  {
	    		  //System.out.println(em);
	    	  }
	    	  System.out.println("-------------");
	      }
	        				
	        		// Print the sorted list
	        //System.out.println("Sorted by role (ascending):");
	        //employeeList.forEach(employee -> System.out.println(employee.getId() + ": " + employee.getName()));
	        //System.out.println(sortedByRole.toString());
	}

}
