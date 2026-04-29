import java.util.*;

class DivisionException
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no1 =0 , no2 =0, Ans = 0;

        System.out.println("Enter first number :");
        no1 = sobj.nextInt();

        System.out.println("Enter second number :");
        no2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
             Ans = no1/no2; //This is exception prone code 
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch block");
            System.out.println("Exception occured :"+aobj);
        }

        System.out.println("Devision is : "+Ans);
    }
}

//DivisionException.java