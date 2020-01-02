package com.deloitte.java.entity2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.deloitte.java.entity.Person;
public class Student extends Person 
{
 int rno;
 int m1;
 int m2;
 public Student() { }
 public Student(int rno,int m1,int m2)
 {
	 this.rno=rno;
	 this.m1=m1;
	 this.m2=m2;
 }
 public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public static void main(String[] args) throws Exception
{
	Student stu=null;
	try(FileInputStream fis=new FileInputStream("dektop:sailaja:stu.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);)
	{
		stu=(Student)ois.readObject();
		System.out.println(stu.getSsn()+" "+stu.getName()+" "+stu.getAge()+" "+stu.getRno()+" "+stu.getTotalmarks()+" "+stu.getAverage()+" "+stu.getresults()+" "+stu.getdivision());
	}
	catch(IOexception | ClassNotFoundException ex)
	{
		System.out.println(ex);
		}
	}
}

