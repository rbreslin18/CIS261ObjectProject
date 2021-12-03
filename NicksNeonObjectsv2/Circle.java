
/**
 * 
 * Circle subclass
 * Rodney Breslin 
 * CIS 261
 * CIRCLE CLASS UML
 * -----------------
 * -radius: double
 * -diameter: double
 * -tubeLength:double
 * -bracket:int
 * ---------------------
 * +Circle()
 * +Circle(diameter:double)
 * +getRadius():double
 * +setRadius(radius:double)
 * +getArea():double
 * +getDiameter():double
 * +setDiameter(diameter:double)
 * +getTubeLength():double
 * +printCircle():String
 * +getNumBrackets():int
 * 
 * -------------------------
 */
public class Circle extends GeometricObject
{
    private double radius;
    private double diameter;
    private double tubeLength;
    private int bracket;
    public Circle(){
    }

    public Circle(double diameter){
        this.diameter = diameter;

    }

    public double getRadius(){
        radius = diameter / 2;
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;

    }

    public double getArea(){
        return diameter * Math.PI;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    @Override
    public double getTubeLength(){
        
        return diameter * Math.PI;

    }
    @Override 
    public int getNumBrackets(){
    tubeLength = diameter * Math.PI;
      if(tubeLength < 20){
       bracket = 2;
    }
    
    for(int i = 20; i <= tubeLength; i+=5){
    bracket+=2;
    
    }
    return bracket;
    
    }
    public void printCircle(){
        System.out.println("circle");

    }
}

