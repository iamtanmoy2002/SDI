import java.util.function.ObjDoubleConsumer;

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