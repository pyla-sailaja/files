import java.util.ArrayList;
	class Student 
	{
	 private int stdid;
	 private String stdname;
	 private int stdage;
	 public Student{}()
	 public Student{int stdid,String stdname,int stdage}
	 {
	   this.stdid=stdid;
	   this.stdname=stdname;
	   this.stdage=stdage;
	   }
	   public void setstdid(int stdid)
	   {
	     this.stdid=stdid;
		 }
		 public void setstdname(String stdname)
		 {
		   this.stdname=stdname;
		   }
		   public void setstdage(int stdage)
		   {
		    this.stdage=stdage;
			}
		   public int getstdid() { return stdid; }
		   public String getstdname() { return stdname; }
		   public int getstdage() { return stdage; }
		   {
		   class Training
		   {
		   private int tid;
		   private String tname;
		   Student s;
		   public Training{}()
		   public Training(int tid,String tname,Student s}
		   {
		    this.tid=tid;
			this.tname=tname;
			}
			public void settid(int tid)
			 {
			    this.tid=tid;
				}
				public void settname(String tname)
				{
				 this.tname=tname;
				 }
				 public void setStudent(Student s)
				 {
				 this.s=s;
				 }
				 public int gettid() { return tid; }
				 public String gettname() { return tname; }
				 public Student getStudent() { return s; }
				 ArrayList<Student> listofStudents= new ArrayList<>();
				  class Test27
				   {
				    public static void main(String[] args)
					{
					 Student s[]= new student(101,"arun",23);
				  Training t= new Training(102,"java");
				 System.out.println(stdid is +stdid,stdname is "+stdname+",stdage is +stdage);
				  System.out.println(tid is +tid,tname is "+tname+");
				  }
				  }
				  
				 
				 
				 }
		   
		 