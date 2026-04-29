import java.util.*;

class ArrayIndex
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] ={11,21,51,101,111};

        System.out.println("Enter the index of array : ");
        int index = sobj.nextInt();
        
        try
        {
            System.out.println("Inside Try block");
            System.out.println("Element at that index is : "+Arr[index]);
        }

    catch(ArrayIndexOutOfBoundsException aobj)
    {
        System.out.println("Exception occured: "+aobj);
    }
        

        System.out.println("End of application");
    }
}
//ArrayIndexException.java