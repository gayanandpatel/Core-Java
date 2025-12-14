// import java.io.*;

// class Student
// {
//     int rollno;
//     String name;
//     String dept;
// }

// public class PrintStreamDemo 
// {
//     public static void main(String[] args) throws Exception
//     {
//         FileOutputStream fos=new FileOutputStream("Student1.txt");
//         PrintStream ps=new PrintStream(fos);
        
        
//         Student s=new Student();
//         s.rollno=10;
//         s.name="John";
//         s.dept="CSE";
        
//         ps.println(s.rollno);
//         ps.println(s.name);
//         ps.println(s.dept);
        
//         ps.close();
//         fos.close();
        
//     }    
// }

import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis)); {

        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Department: " + s.dept);

        br.close();
        fis.close();
        } 
    }    
}