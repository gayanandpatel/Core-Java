class runnableDemo implements Runnable{
    public void run(){
        int i = 1;
        while (true){
            System.out.println( i + "Hello");
            i++;
        }
    }
}
public class ThreadRunnableDemo {
    public static void main(String[] args){
        runnableDemo r = new runnableDemo();
        Thread t = new Thread(r);
        t.start();
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
    
}
