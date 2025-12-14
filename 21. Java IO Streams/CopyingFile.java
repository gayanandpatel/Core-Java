import  java.io.*;
public class CopyingFile {
    public  static void main(String[] args)
    {
        try(
            FileInputStream fis  = new FileInputStream("21. Java IO Streams/source1.txt");
            FileOutputStream fos = new FileOutputStream("21. Java IO Streams/dest1.txt");
        ){
            //For  Reading data from source1.txt
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);

            //For Writing data to dest1.txt
            String data = str.toLowerCase();
            byte[] b1 = data.getBytes();
            fos.write(b1);
            System.out.println("File Copied Successfully");


        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
