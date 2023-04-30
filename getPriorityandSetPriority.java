class ThreadDemo implements Runnable
{
  public void run()
  {
  String name=Thread.currentThread().getName();
  int n= Thread.currentThread().getPriority();
    for(int i=0;i<2;i++)
    {
    System.out.println("Name:: "+name+ "\npriortiy:::"+n);
    }
  }
}
public class getPriorityandSetPriority {
  public static void main(String[] args) {
    ThreadDemo r1= new ThreadDemo();
    ThreadDemo r2= new ThreadDemo();
    ThreadDemo r3= new ThreadDemo();

    Thread t1= new Thread(r1);
    Thread t2= new Thread(r2);
    Thread t3= new Thread(r3);
      
    t1.start();
    t2.start();
    t3.start();
    
    
    t2.setPriority(2);
    t1.setPriority(7);
    t3.setPriority(4);
       
     
    
  }   
}
