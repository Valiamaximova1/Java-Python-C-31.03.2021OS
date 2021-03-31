import test05.Main;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = Integer.parseInt(scan.nextLine());
        System.out.println("Enter height:");
        double h = Integer.parseInt(scan.nextLine());

        if (r <= 0) {
            throw new Error("Numbers can't be negative");
        }
        System.out.println(String.format("S = %.2f",s(r)));
        System.out.println(String.format("Volume = %.2f",volume(r, h)));

    }

    public static double s(double r) {
        //S=пrr
        return  Math.PI*r*r;
    }
    public static double volume(double r, double h) {
        //S=2пrrh
        return  Math.PI*r*r*h;
    }
}
