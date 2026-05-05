class Base 
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside base fun");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }

    public void sun()
    {
        System.out.println("Inside base sun");
    }
}
class Derived extends Base
{
    public int x,y;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
    }

    public void run()
    {
        System.out.println("Inside derived run");
    }
}
class RMD
{
    public static void main(String[] args) 
    {
       // Base bobj= new Base();//No casting

        Base bobj = new Derived();//upcasting 

       // Derived dobj = new Derived(); //No casting

       Derived dobj = new Base(); //Downcasting
        
    }
}

//RMD.java