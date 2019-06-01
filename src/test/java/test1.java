public class test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("i = " + i + " = Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("i = " + i + " = Buzz");
            }
            else if ((i % 3 == 0) || (i % 5 !=0)) {
                System.out.println("i = " + i + " = FizzBuzz");
            }
        }
    }
}
