interface Circle
{
    //Characteristics
    float PI = 3.14f; //Public , final , static

    //Behaviors -bye default abstract,Public
    float Area(float Radius); //bye default abstract,public
    float Circumfarance(float Radius);

}

class Marvellous implements Circle
{
  //Error due to missing body of Area and circumfarance
}

class DemoInterfaceMethod
{
    public static void main(String[] args) 
    {
        Marvellous mobj=new Marvellous();
    }
}

//DemoInterfaceMethod.java