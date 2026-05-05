 class base
 {
    public int i;
    public int j;

    public base()
    {
      System.out.println ("INside base constructor");
      this.i=0;
      this.j=0;
    }

    protected void finalize()
    {
        System.out.println ("Inside Finalize method of base");
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }
 }


 class Derived extends base
 {
   public int x;

   public Derived()
   {
    System.out.println("Inside derived constructor");
    this.x=0;
   }

   protected void finalize()
   {
     System.out.println ("Inside Finalize method of base");
   }

   public void gun()
   {
     System.out.println ("Inside Gun Of Derived");
   }
 }

 class SingleGC
 {
    public static void main(String A[] ) 
    {
        System.out.println("Inside main");

        Derived dobj = new Derived();// object create 

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.x);

        dobj.fun(); //Behavior
        dobj.gun(); //Behavio

        dobj=null;

        System.gc();//System is class and gc meanse garbage colletor

        System.out.println("End of main");
    }
}
//SingleGC.java

//Compile: javac Single.java
//Run : java Single
//Compile + Run : java Single.java

