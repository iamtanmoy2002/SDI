class Emp {
    int eid;

    Emp(int eid) {
        this.eid = eid;
    }

    Emp(Emp e) {
        this.eid = e.eid;
    }
}

class Pclass {
    public void show() {
        System.out.println("Parent class");
    }
}

class Cclass extends Pclass {
    public void show() {
        System.out.println("Child class");
    }
}

class code {
    public static void main(String[] args) {
        Emp e1 = new Emp(101);
        Emp e2 = new Emp(e1);
        Pclass p = new Cclass();
        p.show();

        Pclass p1 = new Pclass();
        p1.show();

    }
}