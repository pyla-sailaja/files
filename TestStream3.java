import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
class TestStream3
{
 public static void main(String[] args)
 {
  try(FileOutputStream fos = new FileOutputStream("abc.dat");
  DataOutputStream dos = new DataOutputStream(fos);
  )
  {
   int i=2147483647;
   float f=12345.67F;
   double d=9999999999.99;
   dos.writeInt(i);
   dos.writeFloat(f);
   dos.writeDouble(d);
  }
	catch(IOException ex)
	 {
	  System.out.println(ex);
	}
	 }
	 }