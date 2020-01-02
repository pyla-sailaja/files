import java.sql.*;
public class DBTest 
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con=null;
		CallableStatement st=null;
        try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  con= DriverManager.getConnection(url,"scott","tiger");
		    st=con.prepareCall("call insertMaster(?,?,?)");
		    st.setInt(1, 107); st.setString(2, "ram"); st.setDouble(3, 12345.67);
		    st.executeUpdate();
		}
		 catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		try	
		{ 
		if(st!=null) st.close();
		if(con!=null) con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		}
	}
}
		
		


