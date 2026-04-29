import java.util.*;

class DivisionExceptionFinally
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
        catch(ArithmeticException aobj)//specific catch
        {
            System.out.println("Inside catch block");
            System.out.println("Exception occured :"+aobj);
        }
        catch(Exception eobj)//generic catch
        {
            System.out.println("Inside Generic Catch : "+eobj);
        }
        finally
        {
            System.out.println("Inside finally block");
            sobj = null;// Resource deallocation
        }

        System.out.println("Devision is : "+Ans);
    }
}

//DivisionExceptionFinally.java