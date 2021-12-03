
/**
Rodney Breslin
CIS 261
Nicks Neon Objects V2
2/16/2020

 */
import java.util.Scanner;
import java.util.ArrayList;
public class NicksNeonObjectsV2
{
    public static void main(String args[]){
        //Create boolean to determine if the program should continue
        boolean continueProgram = true;
        //Create seperate array lists for each object
        ArrayList<Circle> circ = new ArrayList<>();
        ArrayList<Square> sq = new ArrayList<>();
        ArrayList<Rectangle> re = new ArrayList<>();
        ArrayList<Triangle> tri = new ArrayList<>();
        //add a while loop for the program 
        while(continueProgram){
            //Import a scanner used for strings
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter R, S, C, T, or Q");
            // Scanner sc takes string input
            String decision = sc.next();
            // Scanner input takes in double inputs
            Scanner input = new Scanner(System.in);
            // Declare all the variables for the objects created in if statements 
            double rad;
            double height;
            double width;
            double side1;
            double side2;
            double side3;
            //Check the user input 
            if(decision.equals("C")){
                //Create a Circle object and add it to an arrayList
                System.out.println("Enter a diameter");
                rad = input.nextDouble();
                Circle circle = new Circle();
                circle.setDiameter(rad);

                circ.add(circle);

            }
            else if(decision.equals("R")){
                //Create a Rectangle object and add it to an array list
                System.out.println("Enter a Height and Width of Rectangle: ");
                height = input.nextDouble();
                width = input.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);

                re.add(rectangle);
            }
            else if(decision.equals("S")){
                //Create a Square object and add it to an array list
                System.out.println("Enter a height of the square: ");
                height = input.nextDouble();
                Square square = new Square(height);

                sq.add(square);
            }
            else if(decision.equals("T")){
                //Create a Triangle object and add it to an array list
                System.out.println("Enter the 3 sides of the triangle:  ");
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);

                tri.add(triangle);
            }
            else if(decision.equals("Q")){
                //End the while loop once the user presses q
                continueProgram = false;

            }

        }
        
        System.out.println("Shapes Needed");
         System.out.println("------------------------");
        //Create a new double to represent final sum of all objects
        double sum = 0;
        int triangleCounter = 0;
        int circleCounter = 0;
        int squareCounter = 0;
        int rectangleCounter = 0;
        //Check if all the ArrayLists are filled
        if(circ.size() != 0){
            //Print array contents if filled
            int test = circ.size();
            for(int  i = 0; i < circ.size(); i++){
                System.out.printf("%.1f",circ.get(i).getTubeLength());
                System.out.println("cm - " + "circle, " + " diameter " + circ.get(i).getDiameter() + "cm");
                System.out.println("You need " + circ.get(i).getNumBrackets() + " brackets");
                System.out.println("------------------------");
                 if(circ.get(i) instanceof GeometricObject){
                    circleCounter++;
                
                }
                sum += circ.get(i).getTubeLength();
                
            }
        }
        if(re.size() != 0){
            int test1 = re.size();

            for(int  i = 0; i < re.size(); i++){
                System.out.println(re.get(i).getTubeLength() + "cm - " + "rectangle, " + re.get(i).getHeight() + "cm x " + re.get(i).getWidth() + "cm");
                System.out.println("You need " + re.get(i).getNumBrackets() + " brackets");
                System.out.println("------------------------");
                 if(re.get(i) instanceof GeometricObject){
                    rectangleCounter++;
                
                }
                sum += re.get(i).getTubeLength();

            }
        }
        if(sq.size() != 0){
            int test2 = sq.size();
            for(int  i = 0; i < sq.size(); i++){
                System.out.println(sq.get(i).getTubeLength() + "cm - " + "square, " + sq.get(i).getHeight() + "cm");
                System.out.println("You need " + sq.get(i).getNumBrackets() + " brackets");
                System.out.println("------------------------");
                if(sq.get(i) instanceof GeometricObject){
                    squareCounter++;
                
                }
                sum += sq.get(i).getTubeLength();
            }
        }
        if(tri.size() != 0){
            int test3 = tri.size();
            for(int  i = 0; i < tri.size(); i++){
                System.out.println(tri.get(i).getTubeLength() + "cm - " + "triangle, " + tri.get(i).getSide1() + "cm" + " + " + tri.get(i).getSide2()+ "cm" + " + " + tri.get(i).getSide3() + "cm");
                System.out.println("You need " + tri.get(i).getNumBrackets() + " brackets");
                System.out.println("------------------------");
                if(tri.get(i) instanceof GeometricObject){
                    triangleCounter++;
                
                }
                sum += tri.get(i).getTubeLength();
            }
        }
        System.out.println("------------------------");
        System.out.printf("%.1f",sum);
        System.out.print("cm Total Length \n");
        System.out.println("------------------------");
        System.out.println("Number of shapes: ");
        System.out.println("Triangles: " +triangleCounter);
        System.out.println("Squares: " +squareCounter);
        System.out.println("Rectangles: " +rectangleCounter);
        System.out.println("Circles: " +circleCounter);
        System.out.println("------------------------");
    }
}

