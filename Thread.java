class MyThread extends Thread {
    public void run() {
        System.out.println("this is the thread");
    }
    public void start(){
        System.out.println("this is the start thread");
    }
}

public class Thread{
    public static void main(String[] args){
        MyThread mythread=new MyThread();
        mythread.run();
        System.out.println("this is the thread");

    }
}