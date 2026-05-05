 class base
 {
    public int i;
    public int j;

    public base()
    {
      System.out.println ("INside base constructor");
      this.i=11;
      this.j=21;
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
    this.x=51;
   }


   public void gun()
   {
     System.out.println ("Inside Gun Of Derived");
     System.out.println("Value of i: "+super.i);
     System.out.println("Value of j: "+super.j);
     System.out.println("Value of x: "+this.x);
   }
 }

 class ThisSuper
 {
    public static void main(String A[] ) 
    {
        Derived dobj =new Derived();
        dobj.gun();
    }
}
//ThisSuper.java
