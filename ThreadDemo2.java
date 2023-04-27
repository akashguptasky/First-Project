/*This is second part of MultiThreading By implementing Runnable interface 
 * we can not guess the output of MultiThreading because 
 * i can't guesss Thread Schedular whose algorithm follow 
 * Java is a multithreded programming language
*/
class A implements Runnable {
    // this is a public + abstract method in runnable
    // Runnable is a interface not a class and extends Thread class

    public void run() {
        try {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                System.out.println("Name::" + name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error:: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unreported exception::: " + e.getMessage());
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        A r = new A();
        Thread t = new Thread(r);
        t.start();
        A r1 = new A();
        Thread t1 = new Thread(r1);
        t1.start();
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Name::" + name);
            Thread.sleep(1000);
        }
    }
}
