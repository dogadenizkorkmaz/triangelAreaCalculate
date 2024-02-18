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

        //After entering the values of the three sides, the area is found using the Triangle area formula.

        double p=a+b+c;
        double u=(p/2);
        double areaS=(u*(u-a)*(u-b)*(u-c));
        double area = Math.sqrt(areaS);

        System.out.println("Area of a Triangle : " + area);


    }
}
