import java.util.Scanner;

public class TriangelAreaCalculate {
    public static void main(String[] args) {
        //definition of the lengths
        double a, b, c;
        //define Scanner
        Scanner inp=new Scanner(System.in);
        //get values from user
        System.out.print("Length of First: ");
        a= inp.nextInt();
        System.out.print("Length of Second: ");
        b= inp.nextInt();
        System.out.print("Length of Third: ");
        c= inp.nextInt();

        //after entering the values of two sides, the length of side c is found using the Pythagorean expression

        double p=a+b+c;
        double u=(p/2);
        double areaS=(u*(u-a)*(u-b)*(u-c));
        double area = Math.sqrt(areaS);

        System.out.println("Area of a Triangle : " + area);


    }
}
