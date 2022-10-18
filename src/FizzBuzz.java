public class FizzBuzz {


    public static void main(String[] args) {



        for (int x = 1; x <= 100; x++) {
            if ((x % 3 == 0) & (x % 5 == 0)) {
                System.out.println("FIZZBUZZ");
            } else if (x % 3 == 0) {
                System.out.println("FIZZ");
            } else if (x % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(x);
            }
        }
    }
}

//System.out.println(x);

//System.out.println("BUZZ");
//System.out.println("FIZZBUZZ");

