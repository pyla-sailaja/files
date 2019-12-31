import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class TestSerialization2
	   {
	    public static void main(String[] args)
		{
		 Employee e=null;
		 try(FileInputStream fis = new FileInputStream("emp.dat");
		 ObjectInputStream ois = new ObjectInputStream(fis);)
		 {
		  e=(employee)ois.readObject();
		  System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getsalary());
		  }
		   catch(IOException ex | ClassNotFoundException ex)
		   {
		     System.out.println(ex);
			 }
			 }
	        }
			
	   
	
   