import java.util.Scanner;

public class IT24101991Lab3Q1B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("enter 1kg of rice = Rs.");
        int ipno= scn.nextInt();

        System.out.print("how much you want >.<  ?   ");
        int howmuch = scn.nextInt();

        int result =  ipno * howmuch;

        int discntprcntg = 10; // discount precentage represent here

        int discnt = result * discntprcntg / 100;
	System.out.print(" we giving 10% discount & you gained RS."+ discnt);
         System.out.println(" from it ");

        int finalresult = result - discnt;
        System.out.println("you have to pay Rs."+finalresult);

        }

    }