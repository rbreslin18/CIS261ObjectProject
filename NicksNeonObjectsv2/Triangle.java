
/**
 * Rodney Breslin
 * TRIANGLE CLASS UML
 * -------------------
 * -side1:double
 * -side2:double
 * -side3:double
 * -tubeLength:double
 * -bracket:int
 * ---------------
 * +Triangle():
 * +Triangle(side1:double,side2:double,side3:double)
 * +getSide1():double
 * +getSide2():double
 * +getSide3():double
 * +setSide1(side1:double):
 * +setSide2(side2:double):
 * +setSide3(side3:double):
 * +getTubeLength():double
 * +getNumBrackets():int;
 * 
 */
public class Triangle extends GeometricObject
{
    // instance variables - replace the example below with your own
    private double side1;
    private double side2;
    private double side3;
    private double tubeLength;
    private int bracket;
    /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {

    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }
    
    public void setSide1(double side1){
    
    }
     public double getSide2(){
        return side2;
    }
    
    public void setSide2(double side2){
    
    }
     public double getSide3(){
        return side3;
    }
    
    public void setSide3(double side3){
    
    }
    @Override
    public double getTubeLength(){
    return side1 + side2 + side3;
    }
     @Override
    public int getNumBrackets(){
    
    tubeLength = side1 + side2 + side3;
     bracket = 0;
    
    if(tubeLength < 20){
       bracket = 3;
    }
    
    for(int i = 20; i <= tubeLength; i+=5){
    bracket+=3;
    
    }
    return bracket;
    }
}
