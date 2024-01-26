//QB 794

class member {
    String name;
    int age;
    long ph;
    String add;
    int salary;

    void printsalary() {
        System.out.println("Salary is " + salary);
    }
}

class employee extends member {
    String specialization;
}

class manager extends member {
    String department;

    public static void main(String[] args) {
        // making object for employee
        employee e = new employee();
        e.name = ("Ishan");
        e.age = 18;
        e.ph = 9106550238l;
        e.add = "LJIET";
        e.salary = 153000;
        e.specialization = "CST";

        // making object for manager
        manager m = new manager();
        m.name = ("Raj");
        m.age = 33;
        m.ph = 7878468648l;
        m.add = "SG.HIGHWAY";
        m.salary = 2500000;
        m.department = "FY3";

        System.out.println("Employee details");

        System.out.println("Name is " + e.name);
        System.out.println("Age is " + e.age);
        System.out.println("Phone is " + e.ph);
        System.out.println("Address is " + e.add);
        System.out.println("Salary is " + e.salary);
        System.out.println("Specialization is " + e.specialization);
        System.out.println();

        System.out.println("Manager details");

        System.out.println("Name is " + m.name);
        System.out.println("Age is " + m.age);
        System.out.println("Phone is " + m.ph);
        System.out.println("Address is " + m.add);
        System.out.println("Salary is " + m.salary);
        System.out.println("Department is " + m.department);

    }
}
