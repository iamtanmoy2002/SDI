class Dog {
    void says() {
        System.out.println("Dog says Bow Bow");
    }
}

class Cat {
    void says() {
        System.out.println("Cat says Meow Meow");
    }
}

class Pclass {

    public void home() {
        System.out.println("Home is in Pclass");
    }
}

class Cclass extends Pclass {
    public void home() {
        System.out.println("Home is in Cclass");
    }
}

abstract class Animal {
    abstract void says();
}

class Dog extends Animal {
    void says() {
        System.out.println("Dog says Bow Bow");
    }
}

abstract class shape {
    abstract void draw();
}

class rectangle extends shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class circle extends shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

interface agenda1 {
    void agenda1();
}

interface agenda2 {
    void agenda2();
}

class meeting implements agenda1, agenda2 {
    public void task1() {
        System.out.println("Task 1");
    }

    public void task2() {
        System.out.println("Task 2");
    }
}

class code {
    public static void main(String[] args) {
        shape s = new rectangle();
        s1.draw();

        shape s1 = new circle();
        s1.draw();

        // Pclass c = new Cclass();
        // c.home();
        // System.out.println(c.i);

        // Dog d = new Dog();
        // Cat c = new Cat();
        // d.says();
        // c.says();
    }
}