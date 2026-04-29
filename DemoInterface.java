interface Circle
{
    //Characteristics
    float PI = 3.14f; //Public , final , static

}


class DemoInterface
{
    public static void main(String[] args) 
    {
        System.out.println(Circle.PI);
        Circle.PI = 7.12f; // error: cannot assign a value to static final variable PI
    }
}
//DemoInterface.java