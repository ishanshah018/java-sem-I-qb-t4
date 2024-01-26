//QB 797

class parent
{
    void print()
    {
    System.out.println("This is a parent class");
    }
}
class child extends parent
{
    void print()
    {
    System.out.println("This is a child class");
    super.print(); //3
    }

    public static void main(String[] args) 
    {
        parent p = new parent();
        p.print();//1

        child c = new child();
        c.print(); //2    
    }
}
