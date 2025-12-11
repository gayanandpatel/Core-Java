class myData1{
    int value;
    boolean flag = true;
    synchronized public void setValue(int v){
        while (flag != true){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        value = v;
        System.out.println("Value produced: " + v);
        flag = false;
        notifyAll();
    }
    synchronized public int getValue(){
        int x = 0;
        while (flag != false){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        x = value;
        System.out.println("Value Consumed: " + x);
        flag = true;
        notifyAll();
        return x;
    }
}
class Producer extends Thread{
    myData1 data;
    public Producer(myData1 d){
        data = d;
    }
    public void run(){
        int count = 1;
        while (true){
            data.setValue(count);
            count++;
        }
    }
}

class Consumer extends Thread{
    myData1 data;
    public Consumer(myData1 d){
        data = d;
    }
    public void run(){
        int x;
        while (true){
            x = data.getValue();
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        myData1 data = new myData1();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}