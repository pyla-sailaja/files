import java.sql.Date;
import java.util.ArrayList;
import com.del.dao.EmployeeDAO;
import com.del.entity.Employee;
public class DAOTest 
{
public static void main(String[] args)
	{
		EmployeeDAO edao = new EmployeeDAO();
		Employee e = new Employee(101,"ajay varma",2200,new Date(1990,10,12));
		if(edao.modifyEmployee(e))
			System.out.println("Employee Record Modified");
			else
		System.out.println(" Modification Failed");
		if(edao.removeEmployee(101))
		System.out.println("Employee Deleted Successfully");
		else
			System.out.println("Employee with id 101 does not exist");
		}
}

