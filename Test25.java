import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test25
{
 public static void main(String[] args)
  {
   TreeMap<String,String> map = new TreeMap<>();
	map.put("bbc@rediff.com","redbbc");
	map.put("xyz@yahoo.com","xyz@321");
	map.put("abc@gmail.com","abc@123");
	map.put("someuser@xyz.com","somexyz");
	Set<Entry<String,String>>set = map.entrySet();
	for(Entry<String,String> s : set)
	System.out.println(s.getKey()+"   "+s.getValue());
	}
	}