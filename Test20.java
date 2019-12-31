import java.util.TreeSet;
import java.util.Iterator;
class Test20
{
  public static void main(String[] args)
  {
   TreeSet<Employee> tset = new TreeSet<>();
   tset.add(new Employee(102,"babu",2000));
   tset.add(new Employee(101,"arun",1000));
   tset.add(new Employee(104,"dinesh",4000));
   tset.add(new Employee(103,"chandra",3000));
   for(Employee e : tset)
    e.display();
   }
 }
  