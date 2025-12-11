class myThread extends Thread{
    public void run(){
        int i = 1;
        while (true){
            System.out.println( i + "Hello");
            i++;
        }
    }
}


public class ThreadDemo {
    public static void main(String[] args){
        myThread m = new myThread();
        m.start();
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
    
}