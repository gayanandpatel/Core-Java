public class ThreadDemo2 extends Thread{
    public void run(){
        int i = 1;
        while (true){
            System.out.println( i + "Hello");
            i++;
        }
    }

    public static void main(String[] args){
        ThreadDemo2 m = new ThreadDemo2();
        m.start();
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
    
}
