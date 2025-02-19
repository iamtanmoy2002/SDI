
// class employee {
//     int eid;
//     String ename;
//     double esal;

//     employee(int eid, String ename, double esal) {
//         this.eid = eid;
//         this.ename = ename;
//         this.esal = esal;
//     }

//     public String toString() {
//         return "Employee ID: " + eid + " Employee Name: " + ename + " Employee Salary: " + esal;
//     }

//     public boolean equals(Object e) {
//         if (this == e) { // check both obj are same or not
//             return true;
//         }
//         if (this.getClass() != e.getClass()) { // check both obj are same class or not
//             return false;
//         }
//         employee e1 = (employee) e; // type casting
//         return String.valueOf(this.eid).equals(String.valueOf(this.eid))
//                 && String.valueOf(this.ename).equals(String.valueOf(this.ename))
//                 && String.valueOf(this.esal).equals(String.valueOf(this.esal)); //
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(eid, ename, esal); // returns integer(hash code) for the object
//     }

// }

// class car implements Cloneable {
//     String brand;

//     car(String brand) {
//         this.brand = brand;
//     }

//     @Override
//     public object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }
// }

class Box<T, U> {
    private T value;
    private U value2;

    public void set(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T get() {
        return value;
    }

    public U get2() {
        return value2;
    }
}

public class code {

    public static void main(String[] args) {
        Box<Integer, String> b = new Box<>();
        b.set(10, "Tanmay");
        System.out.println(b.get());
        System.out.println(b.get2());

        // Integer i = 300;
        // Integer j = 300;
        // System.out.println(i == j); // false as its out of range of -128 to 127 for
        // cache memory. So it will create a new object

        // Integer i1 = 100;
        // Integer j1 = 100;
        // System.out.println(i1 == j1); // true as its in range of -128 to 127 for
        // cache memory

        // car c1 = new car("Supra");
        // car c2 = (car) c1.clone();

        // employee e1 = new employee(100, "Tanmay", 10000);
        // employee e2 = new employee(101, "Tanmay", 10000);
        // System.out.println(e1.equals(e2));
    }

}
