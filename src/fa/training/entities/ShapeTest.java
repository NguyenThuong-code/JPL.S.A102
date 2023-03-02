package fa.training.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rectangle shape:");
        int n = sc.nextInt();
       List<Rectangle> rectangles=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Length:");
            int len=sc.nextInt();
            System.out.println("Enter width:");
            int wid=sc.nextInt();
           rectangles.add(new Rectangle(len,wid));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("The length rectangle:");
            System.out.println(rectangles.get(i).getLength());
            System.out.println("The width rectangle:");
            System.out.println(rectangles.get(i).getWidth());
            System.out.println("The Perimeter rectangle:");
            System.out.println(rectangles.get(i).calculatePerimeter());
            System.out.println("The area of rectangle: ");
            System.out.println(rectangles.get(i).calculateArea());
        }
        Rectangle maxAre = null;
        for (int i = 0; i < rectangles.size(); i++) {
            int maxArea= rectangles.get(0).calculateArea();
            if (rectangles.get(i).calculateArea()>maxArea){
                maxAre= rectangles.get(i);
            }
        }
        System.out.println("Rectangle has maximum area");
        System.out.println(maxAre.toString());

        Rectangle minPer=null;
        for (int i = 0; i < rectangles.size(); i++) {
            int minPerimeter= rectangles.get(0).calculatePerimeter();
            if (rectangles.get(i).calculateArea()<minPerimeter){
                minPer=rectangles.get(i);
            }
        }
        System.out.println("Rectangle has minimum perimeter");
        System.out.println(minPer.toString());
    }
}
