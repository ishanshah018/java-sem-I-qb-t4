//QB 717

class Ex1 {
    int a, b, c;

    public static void main(String[] args) {
        Ex1 ab = new Ex1(10, 30, 20);
        ab.findMax();
        
    }

    Ex1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void findMax() {
        if (a > b) {
            if (a > c) {
                System.out.println("A is max");
            } else {
                System.out.println("C is max");
            }
        } else {
            if (b > c) {
                System.out.println("B is max");
            } else {
                System.out.println("C is max");
            }
        }
    }


}
