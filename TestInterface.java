interface Calculator
{
  int sum(int x,int y);
  int product(int x,int y);
  }
  class AbcCalculator implements Calculator
  {
    public int sum(int x,int y)
	 {
	   return x+y;
	 }
	 public int product(int x,int y)
	 {
	  return x*y;
	  }
	  }
  class XyzCalculator implements Calculator
  {
    public int sum(int x,int y);
	 {
	  return x-(-y);
	  }
	  public int product(int x,int y);
	  {
	   return x*y;
	   }
	   }
 class TestInterface 
 {
   public static void main(String[] args);
   {
   Calaculator c=new AbcCalculator();
   {
   System.out.println(c.sum(20,30));
   System.out.println( c.product(12,12));
   }
   calculator s=new XyzCalculator();
   {
    System.out.println(s.sum(5,7));
	System.out.println(s.product(5,9));
   }
   }
   }
   
   
    
   
   