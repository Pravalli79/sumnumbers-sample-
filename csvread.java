import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class csvread {

public static void main(String[] args) throws IOException
{
File f = new File("/Users/phanijayasreeirrinki/my_prediction.csv");
FileWriter fr = new FileWriter(f,true);
BufferedWriter br =  new BufferedWriter(fr);
for(int i= 1; i<10;i++)
{
    br.write("My name is pravalli");
}
System.out.println("success ");
br.close();

}
}
