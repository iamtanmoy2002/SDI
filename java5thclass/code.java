
class A {
    int i = 100;
}

class B extends A {
    int i = 200;

    void show(int i) {
        System.out.println(i);// 50
        System.out.println(this.i);// 200
        System.out.println(super.i);// 100
    }
}

class Emp {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class code {
    public void BblSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int[] insertElement(int arr[], int index, int element) { // return type is array
        int n = arr.length;
        int newArr[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show(50);

        // B obj = new B();
        // System.out.println(obj.i);
        // A obj1 = new B();
        // System.out.println(obj1.i);

        // int arr[][] = new int[3][3];
        // System.out.println("Enter the elements of 2D array");
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("The elements of 2D array are");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Emp e1 = new Emp(1, "Raj");
        // Emp e2 = new Emp(2, "Ravi");
        // Emp empArr[] = new Emp[2];
        // empArr[0] = e1;
        // empArr[1] = e2;
        // for (int i = 0; i < empArr.length; i++) {
        // System.out.println(empArr[i].id + " " + empArr[i].name);
        // }

        // int arr[] = { 10, 20, 30, 40, 50, 25 };
        // code obj = new code();
        // obj.BblSort(arr);
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the key to search");
        // int key = sc.nextInt();
        // code obj = new code();
        // System.out.println(obj.linearSearch(arr, key));

        // Scanner sc = new Scanner(System.in);
        // int arr[];
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        // arr = new int[size];
        // System.out.println(String.format("Enter %s no of elements", size));
        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // for dynamic size array
        // int arr[] = new int[] { 10, 20, 30, 40, 50 };
        // for (int i : arr) {
        // System.out.println(i);
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // For Static size array
        // int[] arr;
        // arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
    }
}
