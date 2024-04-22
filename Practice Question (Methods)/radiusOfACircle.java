// Q2. Write a method that takes the radius of a circle as an argument and returns its area.
package PracticeQuestion;

class CircleArea{
    double res;
    double calculateArea(double r) {
        res = 3.141592*r*r;
        return res;
    }
}

public class radiusOfACircle {
    public static void main(String[] args) {
        CircleArea ca = new CircleArea();
        double r = 6.9;
        double area = ca.calculateArea(r);
        System.out.println(area);
    }
}
