import java.io.*;
import java.io.IOException;

public class csvfile {

public static void main(String[] args) throws IOException
{
File f = new File("C:\Users\Jayasree Irrinki\Downloads\used-payloads\examples\employee.csv");
FileWriter fr = new FileWriter(f,true);
BufferWriter br =  new BufferWriter(fr);
for(int i= 1; i<10;i++) 
{
    br.write("my name is Pravalli");
}
System.out.println(" success ");
br.close();

}

}
