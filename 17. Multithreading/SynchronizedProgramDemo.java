

class MyData
{
    synchronized public void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                 try{Thread.sleep(100);}catch(Exception e){}
            }
        
    }
}

class MyThread5 extends Thread
{
    MyData d;
    public MyThread5(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread6 extends Thread
{
    MyData d;
    public MyThread6(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Welcome All");
    }
            
    
}

public class SynchronizedProgramDemo
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        MyThread5 t1=new MyThread5(data);
        MyThread6 t2=new MyThread6(data);
        
        t1.start();
        t2.start();
        
        
    
    }    
}