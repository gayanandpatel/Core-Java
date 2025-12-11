class ATM{
    public void checkBalance(String name){
        System.out.print(name + " is checking");
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println(" " + "his Balance");
    }
    
    public void withdrawAmount(String name, int amount){
        System.out.print(name + " is withdrawing " + amount);
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println(" "+  "from his account");
    }
}

class Customerss extends Thread{
    ATM atm;
    String name;
    int amount;
    Customerss(ATM atm, String name, int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }
    public void run(){
        synchronized(atm){
            atm.checkBalance(name);
            atm.withdrawAmount(name, amount);
        }
    }
}
public class ATMStudentChallenge {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customerss c1 = new Customerss(atm, "Alice", 1000);
        Customerss c2 = new Customerss(atm, "Bob", 2000);
        c1.start();
        c2.start();
    }
    
}






// class ATM
// {
    
//     synchronized public void checkBalance(String name)
//     {
//        System.out.print(name + " Checking ");
       
//        try{Thread.sleep(1000);}catch(Exception e){}
       
//        System.out.println("Balance");
//     }
    
//     synchronized public void withdraw(String name,int amount)
//     {
//         System.out.print(name + " withdrawing "); 
        
//         try{Thread.sleep(1000);}catch(Exception e){}
        
//         System.out.println(amount);
        
//     }
// }

// class Customer extends Thread
// {
//     String name;
//     int amount;
//     ATM atm;
    
//     Customer(String n,ATM a,int amt)
//     {
//         name=n;
//         atm=a;
//         amount=amt;
//     }
//     public void useATM()
//     { 
//         atm.checkBalance(name);
//         atm.withdraw(name, amount);
//     }
//     public void run()
//     {
//         useATM();
//     }
// }

// public class ATMStudentChallenge
// {
//     public static void main(String[] args) 
//     {
//         ATM atm=new ATM();
//         Customer c1=new Customer("Smith",atm,100);
//         Customer c2=new Customer("John",atm,200);
//         c1.start();
//         c2.start();
        
        
//     }   
// }