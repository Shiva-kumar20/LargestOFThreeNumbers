import java.util.Scanner;

public class NestedIf {
 public static void main(String[] args) {
    System.out.println("enter the three number =");
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
     int num2=sc.nextInt();
     int num3=sc.nextInt();
     if(num1>num2){
        if(num1>num3){
                System.out.println(num1 +"is greater");
            
        }
     }if(num2>num1){
        if(num2>num3){
                System.out.println(num2 +"is greater");
            
        }
     }if(num3>num1){
        if(num3>num2){
                System.out.println(num3 +"is greater");
            
        }
     }
     sc.close(); 
 }  
}
