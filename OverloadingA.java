 class Demo
 {
 public int addition(int a , int b)//addition@2ii
 {
    return a+b;
 }

 public double addition(double a , double b)//addition@2dd
 {
    return a+b;
 }

 public float addition(float a , float b, float c) //addition@3fff
 {
    return a+b+c;
 }

 }
 class OverloadingA 
 {
 
    public static void main(String[] args) 
    {
        Demo dobj=new Demo();
        System.out.println(dobj.addition(10, 11));
        System.out.println(dobj.addition(10.89, 20.45));
        System.out.println(dobj.addition(10.3f, 11.4f,30.2f));
    }
}
//OverloadingA.java