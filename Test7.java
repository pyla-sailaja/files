class Student
{
 private int Rno,M1,M2,M3;
 private String Name;
public Student(){}
 public student(int Rno,Sring name,int M1,int M2,int M3)
  {
    this.Rno=Rno;
    this.name=name;
    this.M1=M1;
    this.M2=M2;
    this.M3=M3;
   }
  public int getTotalMarks() { return M1+M2+M3; }
  public int getAverage(){ return(M1+M2+M3)/3; }
  public string getResults()
  {
    if(M1>=40 && M2>=40 && M3>=40)
    return "passed";
     return "failed";
   }  
    public String getDivision()
    {
     if(M1>=40 && M2>=40 && M3>=40)
{
  int avg=getAverage();
  if(avg>=70)
    return FIRST;
  else if(avg>=50)
 return SECOND;
 else
  return THIRD;
  }
  else 
   return NULL;
}
public int getRno(){ return Rno; }
public String getName(){ return name; }
}
 class Test7
   {
    public static void main(String[] args)
    {
      Student[] s={ new Student(101,"john",50,60,70),new student(102,"ajay",55,65,75),new student(103,"babu",70,60,65); }
	  for(int i=0;i<s.length;i++)
	  {
      System.out.println(s[i].getRno());
      System.out.println(s[i].getName());
      System.out.println(s[i].getTotalMarks());
      System.out.println(s[i].getAverage());
      System.out.println(s[i].getResults());
      System.out.println(s[i].getDivision());
    }
	}
	}
	