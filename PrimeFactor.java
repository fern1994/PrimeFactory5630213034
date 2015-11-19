
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PrimeFactor {
    
    public static List<Integer> primeFactors(int number) {  
        int n = number;  
        List<Integer> primeFactors = new ArrayList<Integer>();  
       
        for (int i = 2; i <= n; i++) {  
            while (n % i == 0) {  
                primeFactors.add(i);  
                n /= i;  
            }  
        }  
         return primeFactors;  
    }  
   
   public void numScan(){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("******************************");
        System.out.printf("My Number is 30 : "+"%s" ,primeFactors(30));
        System.out.println();
        System.out.println("******************************");
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
      
        System.out.printf("%s" ,primeFactors(scanner.nextInt()));
        System.out.println();
        System.out.println("******************************");
   }
    
}
