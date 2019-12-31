class Employee
{
  private int empid;
  private String ename;
  private double salary;
  public Employee(){}
  public Employee(int empid,string ename,double salary)
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
		 class Department
		 {
		   private int deptno;
		   private String deptname;
		   employee[] e;
		   public Department(){}
		   public Department(int deptno,String deptname,Employee[] e)
		   {
		     this.deptno=deptno; this.deptname=deptname; this.e=e;
			 }
			 public void setDeptno(int deptno) { this.deptno=deptno; }
			 public void setDeptname(String deptname) { this.deptname=deptname; }
			 public void setEmployee(Employee[] e) { this.e=e; }
			 public int getDeptno() { return deptno; }
			 public String getDeptname() { return deptname; }
			 public Employee[] getEmployee() { return e; }
			 }
			 class Test5
			 {
			 public static void main(String[] args)
			 {
			  Employee[] e1={new Employee(101,"ajay",1000),new Employee(102,"babu",2000),new Employee(103,"chandhu",3000)};
			  Department d=new Department(10,"sales",e1);
			  System.out.println("Deptno is "+d.getDeptno());
			  System.out.println("Deptname is "+d.getdeptname());
			  system.out.println("Employee details");
			  Employee[] e2=d.getEmployee();
			  for(int i=0;i<e2.length;i++)
			  {
			  System.out.println("Empid is "+e2[i].getempid());
			  System.out.println("Ename is "+e2[i].getEname());
			  System.out.println("Salary is "+e2[i].getSalary());
			  System.out.println();
			  }
			  }
			  
			 
			 