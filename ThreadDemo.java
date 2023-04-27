/*We can not guess the output of multithreading because 
  Thread schuduler whose algorithm follow 
*/
class Aman extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        // this is run by child thread
        // start method internally call the run methed
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error:: " + e.getMessage());
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Aman t = new Aman();
        t.start();// first Thread Start
        Aman t1 = new Aman();
        t1.start();// second thread start
        // this is run by main thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
