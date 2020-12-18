class thread1 implements Runnable
{
    Thread t;
    thread1()
    {
        t = new Thread(this,"thread1");
        t.start();
    }

    public void run()
    {  
	 for(;;)
	{
         try
         {
            System.out.println("BMS College Of Engineering");
            Thread.sleep(10000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}

class thread2 implements Runnable
{
    Thread t2;
    thread2()
    {
        t2 = new Thread(this,"thread2");
        t2.start();

    }

    public void run()
    {   for(;;)
	{
         try
         {
            System.out.println("CSE");
            Thread.sleep(2000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}

class threadmain
{
    public static void main(String args[])
    {
       System.out.println("Enter CONTROL+C to stop");
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

    }
}