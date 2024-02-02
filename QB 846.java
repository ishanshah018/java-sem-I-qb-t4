//QB 846

class animal {
    static final int NUM_LEGS = 4;
    static final int NUM_EARS = 2;
    static final int NUM_EYES = 2;
    static final int HAS_TAIL = 1;

    final void displayCharacteristics() {
        System.out.println(NUM_LEGS);
        System.out.println(NUM_EARS);
        System.out.println(NUM_EYES);
        System.out.println(HAS_TAIL);
    }
}

class cow extends animal {
    void displayAdditionalCharacteristics() {
        System.out.println("Hi cow additional charecteristics");
    }

    public static void main(String[] args) {
        cow c = new cow();
        c.displayCharacteristics();
        c.displayAdditionalCharacteristics();
    }
}
