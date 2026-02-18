class Table {
    // TODO: synchronized method void printTable(int n)
    // Loop from 1 to 5 (as per sample) or 10
    // Print n * i + " "
    // Handle InterruptedException (try-catch Thread.sleep(400))
    public void printTable(int n){
        for(int i=1; i<=5; i++){
            System.out.print(n*i);
            if(i!=5) System.out.print(" ");
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        // Create Table object
        Table tb = new Table();
        // Create MyThread1 and MyThread2 objects passing the table object
        MyThread1 m1 = new MyThread1(tb);
        MyThread2 m2 = new MyThread2(tb);
        // TODO: Start both threads
        m1.run();
        System.out.print("\n");
        m2.run();
    }
}
