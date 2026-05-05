 class base
 {
    public int i;

    public base(int no)
    {
      System.out.println ("INside base constructor");
      this.i=no;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
 }


 class Derived extends base
 {
   public int i;

   public Derived()
   {
    System.out.println("Inside derived constructor");
    this.i=21;
   }


   public void gun()
   {
     System.out.println ("Inside Gun Of Derived");
     System.out.println("Value of i: "+i);
     System.out.println("Value of i from based : "+super.i);
   }
 }

 class SuperDemo
 {
    public static void main(String A[] ) 
    {
        Derived dobj =new Derived(); //Error
        dobj.gun();
    }
}

//SuperDemo.java
