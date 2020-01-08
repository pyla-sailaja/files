package com.deloitte.firstmnv.hibfirst.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.deloitte.firstmnv.hibfirst.entity.Employee;
public class EmployeeDAO 
{
   SessionFactory factory = null;
   public EmployeeDAO(SessionFactory factory)
   {
	    this.factory = factory;
   }
   public boolean insertEmployee(Employee e)
   {
	   Session session = factory.openSession();
	   Transaction trans = session.beginTransaction();
	   session.save(e);
	   trans.commit();
	   session.close();
	   return true;
   }
   public Employee getEmployee(int empid)
   {
	   Session session = factory.openSession();
	   Employee e = session.get(Employee.class,empid);
	   return e;
   }
   public boolean modifyEmployee(Employee e)
   {
	   Session session = factory.openSession();
	   Transaction trans = session.beginTransaction();
	   session.update(e);
	   trans.commit();
	   session.close();
	   return true;
   }
   public Employee deleteEmployee(int empid)
   {
	   Session session = factory.openSession();
	   Employee e = new Employee();
	   e.setEmpid(empid);
	   Transaction trans = session.beginTransaction();
	   session.delete(e);
	   trans.commit();
	   session.close();
	   return e;
   }
 }
