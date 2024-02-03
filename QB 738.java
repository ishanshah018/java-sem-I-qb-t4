//QB 738

class Ex1 {
    static int roll;
    static String name;

    static {
        roll = 232;
        name = "Ishan";
    }

    static {
        roll = 233;
        name = "Raj";
    }

    public static void main(String[] args) {
        System.out.println("Roll is " + roll);
        System.out.println("Name is " + name);
    }
}
