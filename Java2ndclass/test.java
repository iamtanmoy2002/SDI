import java.util.Scanner;

class test {
    public static void main(String[] arg) {
        // byte a = 10;
        // byte b = 20;
        // byte c = a + b; // Error
        // byte c = (byte) (a + b);// solution type conversion(explisit type conversion)

        // int i = 10;
        // float f = i;
        // System.out.println(f);

        // int i = 20;
        // String bin = Integer.toBinaryString(i);// convert decimal to binary
        // System.out.println(bin);

        // example of wrapper class
        // System.out.println(Byte.MAX_VALUE);
        // System.out.println(Byte.MIN_VALUE);
        // System.out.println(Byte.SIZE);
        // System.out.println(Byte.BYTES);

        // byte a = 10;
        // short b= 20;
        // int c = 30;
        // long d = 40;
        // float e = 50.0f;
        // double f = 60.0;
        // char g = 'A';
        // boolean h = true;

        // short s = 300; // 2 bytes
        // byte a = (byte) s;
        // System.out.println(a);

        // float f = 20.05f;
        // int i = Float.floatToIntBits(f);
        // String bin = Integer.toBinaryString(i);
        // System.out.println(bin);

        // control flow
        // if (100 > 50) {
        // System.out.println("100 is greater than 50");
        // }

        // input taking from user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        // System.out.println("Even number");
        // } else {
        // System.out.println("Odd number");
        // }

        // for (int i = 50; i >= 1; i -= 5) {
        // System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("you are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
}