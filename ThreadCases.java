class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("aman Gupta");
     }
    }
    public void run(int i)
    {
      System.out.println(i);
    }
   public void start()
   {
      super.start();
    System.out.println("this is start method");
   }
}

public class ThreadCases {
    public static void main(String[] args) {
        A t = new A();
        // case::1 if we can t.start() what the output and Thread Start or not
        t.start(); // one Thread is created and run method call the thread exceute five time aman
                   // Gupta
        /*
         * this is output
         * aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         */
        // case::2 if we can t.run() method thread start or not and what the output
        //t.run();
        /*
         * thread is not created without calling start method we can not create a thread
         * excute run method like normally method out five time aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         * aman Gupta
         */
        // case::3 if we can overloding run method thread start or not and what is
        // output
         // t.start();
        // Thread start and no argument run method excute no overloading method excute
          // same outour five time execute my name
    // case::4 if we can Override start method
      //  t.start();
    /*Our start method is execute no thread created just like normal method */
    // case::5 if we can ovverride start method and inside method we can write super.start(); what is output
/* when we can do this main thread is call the our start method and inside our call method thread class start calling 
  and super.start() call and thread create and thread call the run method 
          
*/ 
  // t.start(); 
  //i we can start method calling two times what the output
  // there is occur the exception because once one thread is created and complete this thread then thread go to dead cylce
  // after we can not call this thread
  // t.start();
   //t.start();
   // thread life cycle        t.start()          run method execute         full excute run method
   // born state(A t= new A())---------->(start/ready)------------->(runnable state)-------------------->dead state 
 }
}
