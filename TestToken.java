import java.util.stringTokenizer;
class TestToken
{
 public static void main(String[] args)
 {
  String s = "Something to be,written and shown,to the participants";
  StringTokenizer st=new StringTokenizer(s,",");
  System.out.println(st.countTokens());
  String[] s1= s.split(",");
  while(st.hasMoreTokens())
  System.out.println(s1.nextToken());
  }
  }