/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hernandez_3_primes;

/**
 *
 * @author ahernandez2248
 */
public class Hernandez_3_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w = 0;
       for(int i= 0; i < 100; i ++) {
           if(i % 2 == 0){
               w = w + 1;
               System.out.println("There are "+ w + " evens.");  
               System.out.println(isEven(i));
               System.out.println(isOdd(i));
               if(isPrime(1)){
                }
               
               
           }
           // What is a method?
           // A method is a function!
           // It is like a little program, e.g. using a method to find the square root of a number.
         // Something you use again and again.
     
           //A return value is the type of 
           //value you are giving back to the program
          
      
       }
        
    }
     static boolean isEven(int number){
           return(number % 2 == 0);
       }
     static boolean isOdd(int somenumber){
         return(somenumber % 2 != 0); 
     }
     static boolean isPrime(int number){
         boolean prime = true;
         //int divisors = 0; 
         for (int i =2; i <number/2; i++){
         if(number % 1 == 0){
             prime= false;
         }
     }
         return prime;
     }
     
     


}
