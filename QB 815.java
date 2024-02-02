//QB 815

class vegetable {
    public String color; // instatnce color accesible to all classes (public)
}

class potato extends vegetable {
    public String toString() {
        color = "Yellow";
        return "potato " + color;
    }
}

class brinjal extends vegetable {
    public String toString() {
        color = "Violet";
        return "brinjal " + color;
    }
}

class tomato extends vegetable {
    public String toString() {
        color = "Red";
        return "tomato " + color;
    }
}

class vegies {
    public static void main(String[] args) {
        potato p = new potato();
        brinjal b = new brinjal();
        tomato t = new tomato();

        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }

}
