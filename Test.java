class Employee
  {
  private int empid;
   private string ename;
   double salary;
    public Employee(){}
   public Employee(int empid,string ename,double salary)
  {
    this.empid=empid;
	this.ename=ename;
	this.salary=salary;
	}
	public String toString()
	   {
	   return "Empid is "+empid+"\nEname is "+ename+"\nsalary is +salary;
	   }
	   }
	   class Test
	   {
	    public static void main (string[] args)
		 {
		   Employee e=new Employee(101,"ajay",25000);
		   System.out.println(e);
		   }
		}
		   
	
   