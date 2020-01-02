import java.sql.Date;
public class DAOTest2
{
public static void main(String[] args)
	{
		Student s= new Student(10,"ajay",23,new Date(1990,10,12));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(s))
		System.out.println("Student record inserted");
	}
}

