import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class Test23
{
 public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc@gmail.com","abc@123");
	map.put("xyz@yahoo.com","xyz@321");
	map.put("bbc@rediff.com","redbbc");
	map.put("someuser@xyz.com","somexyz");
	Set<String> Keys = map.KeySet();
	for(String K : Keys)
	 System.out.println(K+" "+map.get(K));
	  Collection<String> values = map.values();
	  for(String v : values)
	  System.out.println(v);
	}
}