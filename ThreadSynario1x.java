
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}

class ThreadSynario1x
{
    public static void main(String A[]) 
    {   
        System.out.println("Main thread is running....");

        Demo dobj= new Demo();

        Thread tobj = new Thread (dobj);

        tobj.start();
    }    
}

//ThreadSynario1x.java
