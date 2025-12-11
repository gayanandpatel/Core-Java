public class ThreadRunnableDemo2 implements Runnable{
    public void run(){
        int i = 1;
        while (true){
            System.out.println( i + "Hello");
            i++;
        }
    }
    public static void main(String[] args){
        ThreadRunnableDemo2 r = new ThreadRunnableDemo2();
        Thread t = new Thread(r);
        t.start();
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
    
}
