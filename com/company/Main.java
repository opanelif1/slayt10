package com.company;
class myThread extends Thread{

    @Override
    public void run() {
        //yapılacak kodlar
    }
}
public class Main {

    public static void main(String[] args) {
	// thread kullanımı
        myThread t=new myThread();

        t.start();
    }
}
