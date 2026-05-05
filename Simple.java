class Student
{
    String name;
    void display(){
        System.out.println("Name: "+ name);
    }
}
class Simple {
    public static void main(String[] args) {
        Student s= new Student();//object creation
        s.name="Yogesh";
        s.display();
    }
    
}
