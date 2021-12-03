
/**

 */
import java.util.Scanner;
import java.util.ArrayList;
public class SwitchTest
{
    public static void main(String args[]){
        ArrayList<Circle> circ = new ArrayList<>();
        ArrayList<Square> sq = new ArrayList<>();
        ArrayList<Rectangle> re = new ArrayList<>();
        ArrayList<Triangle> tri = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        double rad;
        double height;
        double width;
        double side1;
        double side2;
        double side3;
        boolean continueProgram = true;
        while(continueProgram){
            System.out.println("Enter a letter" );
            String user = input.next();
            switch(user){

                case "C":
                //Create a Circle object and add it to an arrayList
                System.out.println("Enter a diameter");
                rad = input.nextDouble();
                Circle circle = new Circle();
                circle.setDiameter(rad);

                circ.add(circle);
                break;
                case "R":
                //Create a Rectangle object and add it to an array list
                System.out.println("Enter a Height and Width of Rectangle: ");
                height = input.nextDouble();
                width = input.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);

                re.add(rectangle);
                break;
                case "T":
                    //Create a Triangle object and add it to an array list
                System.out.println("Enter the 3 sides of the triangle:  ");
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);

                tri.add(triangle);
                break;
                
                case "S":
                     //Create a Square object and add it to an array list
                System.out.println("Enter a height of the square: ");
                height = input.nextDouble();
                Square square = new Square(height);

                sq.add(square);
                break;
                case "Q":
                continueProgram = false;
                break;
                
                default:
                System.out.println("No match");
            }
           
        }
         System.out.println("Shapes Needed");
            //Create a new double to represent final sum of all objects
            double sum = 0;
            
            //Check if all the ArrayLists are filled
            if(circ.size() != 0){
                //Print array contents if filled
                int test = circ.size();
                for(int  i = 0; i < circ.size(); i++){
                    System.out.println(circ.get(i).getCircumference()+ " - " + "circle, " + " diameter " + circ.get(i).getDiameter());
                    sum += circ.get(i).getCircumference();

                }
            }
            if(re.size() != 0){
                int test1 = re.size();

                for(int  i = 0; i < re.size(); i++){
                    System.out.println(re.get(i).getPerimeter() + " - " + "rectangle, " + re.get(i).getHeight() + " x " + re.get(i).getWidth());
                    sum += re.get(i).getPerimeter();

                }
            }
            System.out.println("------------------------");

            System.out.println(sum + " Total Length");
    }
}