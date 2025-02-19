class Calc {
    int Add(int i, int j) {
        int r = i + j;
        return r;
    }

    float Add(float i, float j) {
        float r = i + j;
        return r;
    }
}

class Employee {
    int eid;
    String name;

    Employee(int i, String n) {
        eid = i;
        name = n;
    }

}

class volume {
    int max = 100;
    int min = 0;
}

class Names {
    String show(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

public class codes {
    public static void main(String[] args) {
        Names n = new Names();
        String result = n.show("Tanmay", "Biswas");
        System.out.println(result);
    }

    // public static void main(String[] args) {
    // Calc c = new Calc();
    // int result = c.Add(2, 3);
    // System.out.println(result);
    // Calc c1 = new Calc();
    // float result1 = c1.Add(2.3f, 3.2f);
    // System.out.println(result1);
    // }

    // public static void main(String[] arg) {
    // Employee e1 = new Employee();
    // Employee e2 = new Employee();
    // e2.eid = 200;

    // System.out.println(e1.eid);
    // System.out.println(e2.eid);
    // }

    // public static void main(String[] arg) {
    // volume v1 = new volume();
    // v1.max = 200; // error
    // System.out.println(v1.max);// 100
    // }

    // public static void main(String[] arg) {
    // Employee e1 = new Employee();
    // e1.eid = 100;
    // e1.ename = "Tanmay";

    // Employee e2 = new Employee();
    // e2.eid = 101;
    // e2.ename = "Rahul";
    // System.out.println(e1.eid + " " + e1.ename + " " + Employee.company);

    // }

    // public static void main(String[] arg) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number");
    // int n = sc.nextInt();
    // System.out.println(n);
    // }
}
