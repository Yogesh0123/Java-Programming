abstract class Demo
{
    public int i, j;

    public int Add(int a, int b) //Concrete method
    {
        return a+b;
    }
}

class Abstract_Demo 
{
    public static void main(String A[] ) 
    {
        Demo dobj = new Demo();// cannot be instantiated
    }
}

//Abstract_Demo.java
