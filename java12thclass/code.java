import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Demo {
    void show(String str);
}

@FunctionalInterface
interface MathOperation {
    int Add(int i, int j);
}

public class code {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tanmay", "Ranmay", "Yanmay");
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        // List<Integer> names = Arrays.asList(1, 2, 3, 4);
        // int sum = names.stream().reduce(0, (a, b) -> a + b);
        // System.out.println(sum);

        // List<Integer> data = names.stream()
        // .map(n -> IntStream.rangeClosed(1, n)
        // .reduce(1, (a, b) -> a * b))
        // .collect(Collectors.toList());
        // System.out.println(data);

        // List<Integer> names = Arrays.asList(1, 2, 3, 4);
        // List<Integer> names1 = names.stream().map(n -> {
        // int result = 1;
        // for (int i = 1; i <= n; i++) {
        // result = result * i;
        // }
        // return result;
        // }).collect(Collectors.toList());
        // System.out.println(names1);

        // List<String> names = Arrays.asList("Tanmay", "Ranmay", "Yanmay");
        // List<Integer> data = names.stream().map(s ->
        // s.length()).collect(Collectors.toList());
        // System.out.println(data);

        // List<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // List<Integer> names1 = names.stream().map(i -> i *
        // i).collect(Collectors.toList());

        // List<String> names = Arrays.asList("Tanmay", "Rahul", "Rohit", "Rajesh",
        // "Ramesh", "Raj", "Rahul", "Rohit",
        // "Rajesh", "Ramesh", "Raj", "Rahul", "Rohit", "Rajesh", "Ramesh", "Raj",
        // "Rahul", "Rohit", "Rajesh",
        // "Ramesh", "Raj", "Rahul", "Rohit", "Rajesh", "Ramesh", "Raj", "Rahul",
        // "Rohit", "Rajesh", "Ramesh",
        // "Raj", "Rahul", "Rohit", "Rajesh", "Ramesh", "Raj", "Rahul", "Rohit",
        // "Rajesh", "Ramesh", "Raj",
        // "Rahul", "Rohit", "Rajesh", "Ramesh", "Raj", "Rahul", "Rohit", "Rajesh",
        // "Ramesh", "Raj", "Rahul",
        // "Rohit", "Rajesh", "Ramesh", "Raj");
        // List<String> names1 = names.stream().distinct().collect(Collectors.toList());
        // List<String> names2 = names.stream().filter(s ->
        // s.startsWith("Ra")).collect(Collectors.toList());
        // System.out.println(names1);
        // System.out.println(names2);

        // Demo obj = new Demo() {
        // public void show(String str) {
        // System.out.println("Hello " + str);
        // }
        // };

        // Demo obj = (str) -> System.out.println("Hello " + str); // lambda expression
        // obj.show("Tanmay");

        // MathOperation obj1 = (i, j) -> i + j;
        // System.out.println(obj1.Add(10, 20));
    }
}
