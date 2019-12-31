class Employee implements comparable<Employee>
{
  private int empid;
  private String ename;
  private double salary;
  public Employee(){}
  public Employee(int empid,String ename,double salary)
  {
    this.empid=empid;
	this.ename=ename;
	this.salary=salary;
	}
	 public void setEmpid(int empid)
	 {
	   this.empid=empid;
	   }
	   public void setEname(String ename)
	   {
	     this.ename=ename;
		 }
		 public void setSalary(double salary)
		 {
		  this.salary=salary;
		  }
		  public int getEmpid() { return empid; }
		  public String getEname() { return ename; }
		  public double getSalary() { return salary; }
		  public boolean equals(Object obj)
		  {
		   Employee e=(Employee)obj;
		   return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
		   }
		   public int compareTo(Employee e)
		   {
		     return empid=e.empid;
			 }
			 class Test21
			 {
			 public static void main(String[] args)
			 {
			  TreeSet<Employee> tset=new TreeSet<>();
			  tset.add(new Employee(102,"babu",2000));
   tset.add(new Employee(101,"arun",1000));
   tset.add(new Employee(104,"dinesh",4000));
   tset.add(new Employee(103,"chandra",3000));
   for(Employee e : tset)
    e.display();
   }
} 
}
			  
			 
			 