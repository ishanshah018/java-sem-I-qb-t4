//QB 845

class circle {
final double CIRCLE_PI = 3.14;
double r = 5;
double ar;

void area() {

ar = CIRCLE_PI * r * r;

}

public static void main(String[] args) {
circle c = new circle();
c.area();
System.out.println("Area of Circle is " + c.ar);
}
}
