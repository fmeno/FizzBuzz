// FizzBuzz
//    This program counts from 1 to 100, printing Fizz for all multiples of 3, Buzz for multiples of 5, 
//    and FizzBuzz for multiples of 15.
// Francesca Meno

public class FizzBuzz {

   private static void FizzBuzz() {
      int fizzbuzz = 15;
      int fizz = 3;
      int buzz = 5;
      
      for (int i = 1; i < 100; i++) {
         if (i % fizzbuzz == 0) 
            System.out.println("FizzBuzz");
         else if (i % fizz == 0)
            System.out.println("Fizz");
         else if (i % buzz == 0)
            System.out.println("Buzz");
         else
            System.out.println(i);
      }
   }
      
   public static void main(String args[]) {
      FizzBuzz();
   }
}
