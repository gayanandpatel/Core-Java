import java.io.*;

public class FileInputStreamDemo {

    public static void main(String[] args) throws Exception
    {
        
        try(FileInputStream fis=new FileInputStream("21. Java IO Streams/Test.txt");)
        {
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}