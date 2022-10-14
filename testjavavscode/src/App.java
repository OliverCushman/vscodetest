public class App {
    public static void main(String[] args) throws Exception {
        double j;
        double k;
        
        for (int i = 1; i <= 100; i++) {
            j = (double) i / 3; // stores i / 3 as a double in j
            k = (double) i / 5; // stores i / 5 as a double in k
            
            if (j == (int) j && k == (int) k) { // checks if j and k are divisible by 3 and 5
                System.out.println("FizzBuzz");
            } else if (j == (int) j) { // checks if j is divisible by 3
                System.out.println("Fizz");
            } else if (k == (int) k) { // checks if k is divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}