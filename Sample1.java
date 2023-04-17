class classA extends Thread{
    public void run(){

        for(int i =0;i<5;i++){
        int a=10,b=48;
       int c=a+b;
       System.out.println("add is :"+c );

       try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
}
class classB extends Thread{
    public void run(){
for(int i=0;i<5;i++){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int a=100,b=48;
       int c=a-b;
       System.out.println("sub is :"+c );
    }
}
}
public class Sample1 {
    public static void main(String[] args) {
        classA ob1=new classA();

        classB ob2=new classB();

        ob1.start();
        try {
            ob1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        ob2.start();

    }
}
