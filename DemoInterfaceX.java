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
  public float Area(float Radius) //bye default abstract,public
  {
    return Circle.PI *Radius *Radius;
  }
    public float Circumfarance(float Radius)
    {
        return 2 * Circle.PI*Radius;
    }
}

class DemoInterfaceX
{
    public static void main(String[] args) 
    {
        //Circle cobj = new Circle() ;// error: Circle is abstract; cannot be instantiated
        Marvellous mobj=new Marvellous();
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("area is : "+Ret);

        Ret = mobj.Circumfarance(10.5f);
        System.out.println("Circumfarance is : "+Ret);
    }
}
//DemoInterfaceX.java