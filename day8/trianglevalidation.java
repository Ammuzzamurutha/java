import java.util.*;
public class trianglevalidation {
    public static void main(String[] args) {
        System.out.println("Enter 3 sides of a triangle");
        Scanner sc=new Scanner(System.in);
        int sidea,sideb,sidec;
        sidea=sc.nextInt();
        sideb=sc.nextInt();
        sidec=sc.nextInt();
        if((sidea+sideb)>sidec && (sideb+sidec) > sidea && (sidec+sidea)>sideb){
            System.out.println("they can form a valid triangle");
        }
        else{
            System.out.println("We cannot form a triangle");
        }

    }
}
