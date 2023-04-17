class method1 extends Thread {
   public void run() {

        try {

            for (int i = 0; i < 5; i++) {
                
                System.out.println("kiran");
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class method2 extends Thread {
   public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("sala");
              Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        method1 ob1 = new method1();

        method2 ob2 = new method2();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();

        t2.start();

    }
}
