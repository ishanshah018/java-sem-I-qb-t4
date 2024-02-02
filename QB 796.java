//QB 796

class rectangle {
    int length;
    int breadth;

    void area() {
        System.out.println("Area of rectangle is " + length * breadth);
    }

    void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (length + breadth));
    }

    rectangle(int x, int y) {
        length = x;
        breadth = y;
    }

}

class square extends rectangle {
    int temp;

    square(int side) {
        super(side, side);
        temp = side;
    }

    void sq() {
        System.out.println("Area of square is: " + temp * temp);
        System.out.println("Perimeter of square is: " + 4 * temp);
    }

    public static void main(String[] args) {
        square s = new square(10);
        s.sq();
        s.area();
        s.perimeter();
    }
}
