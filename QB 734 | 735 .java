//QB 734 

class Ex1 {
    static int count = 0;

    public static void main(String[] args) {
        Ex1 o1 = new Ex1();
        add();
        Ex1 o2 = new Ex1();
        add();
        Ex1 o3 = new Ex1();
        add();

        System.out.println("Total objects created are: "+count);
    }

    static void add() {
        count++;
    }
}
