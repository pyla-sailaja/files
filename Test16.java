import java.util.HashSet;
import java.util.*;
class Employee
{
 int empid;
 String name;
 double salary;
 public Employee() { }
 public Employee(int empid,String ename,double salary)
  {
   this.empid=empid; this.enmae=ename; this.salary=salary;
   }
   public void display()
   {
    System.out.println(empid+"  "+ename+"  "+salary);
	}
	}
	class Test16
	{
	 public static void main(String[] args)
	  {
	   HashSet<Employee> hs= new HashSet<Employee>();
	  hs.add(new Employee(101,"Ajay",1000.00));
	  hs.add(new Employee(102,"babu",2000.00));
	  hs.add(new Employee(101,"chandhu",3000.00));
	  hs.add(new Employee(101,"Ajay",1000.00));
	  for(Employee e: hs)
	  e.display();
	  }
	  }