//QB 841

class vehicle {
    int maxSpeed = 120;

}

class car extends vehicle {
    int maxSpeed = 100;

    void display() {
        System.out.println("Max speed of car is " + maxSpeed);
        System.out.println("Max speed of vehicle is " + super.maxSpeed);
    }

    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}
