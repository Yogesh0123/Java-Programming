interface Remote
{
    void on();
    void off();
}

class TV implements Remote
{
    public void on()
        {
            System.out.println("T.V. Is on ");
        }

        public void off()
        {
            System.out.println("T.V. Is off ");
        }
}
class InterfacePratice1
{
    public static void main(String[] args) 
    {
        TV obj = new TV();

        obj.on();
        obj.off();
    }
}
//InterfacePratice1.java