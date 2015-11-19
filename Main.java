
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
public class Main {
    public static void main(String[] args) { 
        String menu ;
        do{ 
            System.out.println("(p)PrimeFctory");
            System.out.println("(q)Exit");
            System.out.print("Select : ");
            

            Scanner sc = new Scanner(System.in);       
            menu = sc.nextLine();

            PrimeFactor n = new PrimeFactor();

            switch(menu){
                case "p": n.numScan();break;
                case "q": System.exit(0);break;
                default : System.out.println("Enter p or q");  
                    
            }
        }while(menu != "q");
   
    }  
}
