//User defined package import
import PPA.Marvellous;
import PPA.Infisystems;
import PPA.LB.Pune;

public class Client {
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();
        Infisystems iobj = new Infisystems();
        Pune pobj = new Pune();

        System.out.println("Inside main of client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
    
}
