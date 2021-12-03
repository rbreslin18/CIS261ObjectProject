
/**
 * Write a description of class TestArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TestArrayList
{
    public static void main(String args[]){
        boolean continuePlaying = true;
        ArrayList<Circle> circ = new ArrayList<>();
        
        while(continuePlaying){
           
            double rad;
            Scanner sc = new Scanner(System.in);
            String decision = sc.next();
            Scanner input = new Scanner(System.in);
            
            if(decision.equals("C")){
                
                
                    System.out.println("Enter a radius");
                    rad = input.nextDouble();
                    Circle circle = new Circle();
                    circle.setRadius(rad);
                    circ.add(circle);

                
                
            }
            
            else if(decision.equals("Q")){

                continuePlaying = false;
            }
            
        }
        int test = circ.size();
        for(int  i = 0; i < test; i++){
            System.out.println(circ.get(i).getRadius()+" - " + circ.get(i).getDiameter());
        }
    }
}
