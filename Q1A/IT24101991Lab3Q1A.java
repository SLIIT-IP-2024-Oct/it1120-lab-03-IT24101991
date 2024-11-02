import java.util.Scanner;

public class IT24101991Lab3Q1A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("enter 1kg of rice = Rs.");
        int ipno= scn.nextInt();

        System.out.print("how much you want >.<  ?   ");
        int howmuch = scn.nextInt();

        int result =  ipno * howmuch;
        System.out.println(" you have to pay rs."+result);
        }

    }