//QB 791
class subject {
    void display() {
        System.out.println("This is a parent class.");
    }

}

class java extends subject{
    void displaymarks() {
        System.out.println("This is a child class");
    }

    public static void main(String[] args) 
    {
        java m1 = new java();
        m1.displaymarks();
        m1.display();   
    }
}
