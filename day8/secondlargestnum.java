import java.util.*;
 public class secondlargestnum{
    public static void main(String[] args) {
        System.out.println("enter numbers");
        int num1,num2,num3;
        Scanner sc =new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1>num2 && num1>num3){//num1 is lar
            if(num2<num1 && num2>num3){
                System.out.println("the second largest num is "+num2);
            }
            else{
                System.out.println("the second largest num is "+num3);
            }

        }
        else if(num2>num1 && num2 >num3){//num2 is lar
              if(num1<num2 && num1>num3){
                System.out.println("the second largest num is "+num1);
              }
              else{
                System.out.println("the second largest num is "+num3);
              }
        }
        else{
            if(num1<num3 && num1>num2){
                System.out.println("the second largest num is "+num1);
            }
            else{
                System.out.println("the second largest num is "+num2);
            }
        }
        
    }
 }