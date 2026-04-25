class First
{
    public static void main(String A[]) 
    {

        System.out.println("Inside main");

        Arithmatic aobj =new Arithmatic(11,10);

        int result =0;

        result =aobj.Addition();

        System.out.println("Addition is : "+result);

        result =aobj.Substraction();

        System.out.println("Substraction is : "+result);


    }
}

class Arithmatic
{
    public int no1,no2;
    
    public Arithmatic()
    {
        this.no1=0;
        this.no2=0;
    }
    public Arithmatic(int value1,int value2)
    {
        this.no1=value1;
        this.no2=value2;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.no1 +this.no2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = this.no1 - this.no2;
        return Ans;
    }
}


//First.java