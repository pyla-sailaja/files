class Employee implements java.io.Serializable
  {
   int empid;
    String ename;
   double salary;
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
	   }
	   class TestSerialization
	   {
	    public static void main(String[] args)
		{
		 Employee e=new Employee(786,"john miller",25000.00);
		 try(FileOutputStream fos = new FileOutputStream("emp.dat");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);)
		 {
		  oos.writeObject(e);
		  }
		   catch(IOException ex)
		   {
		     System.out.println(ex);
			 }
			 }
	        }
			
	   
	
   