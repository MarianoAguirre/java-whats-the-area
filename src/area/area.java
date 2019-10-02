


package area;

import java.util.Scanner;

//Mariano Aguirre
//period 2

public class area
{
private static Scanner in = new Scanner(System.in);
public static void main(String[] args)
{
int surfaceArea = 0;
surfaceArea += triangle();
surfaceArea += triangle();

surfaceArea += circle();
surfaceArea += circle();
surfaceArea += circle();

surfaceArea += bigSquare();
surfaceArea -= bigSquare();

surfaceArea += parallelogram();


//TODO: add calls to other methods for each of the shapes needed

System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
}
public static int triangle()
{
System.out.println("\nThe area of a triangle is: 1/2 * base * height");
System.out.print("base > ");
int base = in.nextInt();
System.out.print("height > ");
int height = in.nextInt();
int area = (int)(0.5 * base * height);
System.out.println("The area of this shape is: " + area);
return area;
}

public static int circle()
{
System.out.println("\nThe area of a circle is pi * r^2");
System.out.print("radius > ");
int radius = in.nextInt();
int area = (int)(Math.PI * Math.pow(radius, 2));
System.out.println("The area of this shape is: " + area);
return area;
}

public static int bigSquare(){
    System.out.println("\nThe area of a square is a^2");
    System.out.print("length of a side > ");
    int side = in.nextInt();
    int sqArea = (int) (Math.pow(side, 2));
    System.out.println("The area of the big square is: " + sqArea);
    return sqArea;
}

public static int parallelogram(){
    System.out.println("\nThe area of a parallelogram is base * height");
    System.out.print("base > ");
    int base = in.nextInt();
    System.out.print("height > ");
    int height = in.nextInt();
    int pArea = (int) (base * height);
    System.out.println("The area of the big square is: " + pArea);
    return pArea;
}



//TODO: write methods for each of the different shapes

}