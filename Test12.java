import java.util.HashSet;
import java.util.Iterator;
class Test12
{
 public static void main(String[] args)
  {
     HashSet<String> hs = new HashSet<String>();
     hs.add("Welcome");
	 hs.add("Hello");
	 hs.add("Bye Bye");
	 hs.add("Farewel");
     System.out.println(hs.add("welcome"));
	 System.out.println(hs.size());
	 for(String s : hs)
	 System.out.println(s);
	 System.out.println(hs.contains("hello"));
	}
	}

