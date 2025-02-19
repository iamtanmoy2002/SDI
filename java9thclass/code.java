import java.util.*;

class Student implements Comparable<Student> {
    String name;
    Integer marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.name + " " + this.marks;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }
}

public class code {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // Map<String, Integer> map = new HashMap<>();
        // map.put("sun", 0);
        // map.put("tan", 1);
        // System.out.println(map.get("tan"));

        // Hashtable<String, Integer> ht = new Hashtable<>();
        // ht.put("sun", 0);
        // ht.put("tan", 1);
        // System.out.println(ht);

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(10);
        // pq.add(20);
        // pq.add(30);
        // pq.add(5);
        // System.out.println(pq.poll());

        // TreeSet<Integer> ts = new TreeSet<Integer>();
        // ts.add(10);
        // ts.add(20);
        // ts.add(30);
        // ts.add(30);
        // System.out.println(ts);

        // List<Student> students = new ArrayList<>();
        // Student s1 = new Student("John", 90);
        // Student s2 = new Student("Jane", 80);
        // Student s3 = new Student("Jack", 70);
        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        // Collections.sort(students);
        // students.forEach(it -> System.out.println(it));

        // Student s1 = new Student("John", 90);
        // Student s2 = new Student("Jane", 80);
        // Student s3 = new Student("Jack", 70);
        // System.out.println(s1.name);
        // System.out.println(s2.marks.toString());

        // Map<String, Integer> map = new HashMap<>();
        // map.put("sun", 0);
        // map.put("tan", 1);
        // System.out.println(map.get("tan"));

        // Set<String> set = new HashSet<>();
        // set.add("Java");
        // set.add("Python");
        // set.add("Java"); // Duplicate, will not be added
        // System.out.println(set);

        // List<String> list = new ArrayList<>();
        // list.add("Java");
        // list.add("Python");
        // list.add("C++");
        // System.out.println(list);
        // System.out.println(list.get(1));

        // Iterator i = list.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());
        // }
        // list.forEach(item -> System.out.println(item));

    }
}
