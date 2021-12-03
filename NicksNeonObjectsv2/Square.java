
/**
Square SubClass
Rodney Breslin
CIS 261
 * SQUARE UML DIAGRAM
 * ----------------------
 * -tubeLength:double
 * -bracket:int
 * -height:double
 * ----------------
 * +Square()
 * +Square( height:double)
 * +Square(height:double, color:string, filled:boolean)
 * +getHeight():double
 * +setHeight(height:double)
 * +getArea():double
 * +getTubeLength():double
 * +getNumBrackets():int
 */
public class Square extends GeometricObject
{
    
    private double height;
     private double tubeLength;
    private int bracket;
    public Square(){
    }

    public Square(double height){
        
        this.height = height;
    }

    public Square(double height, String color, boolean filled){
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

  

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return height * height;
    }
    @Override
    public double getTubeLength(){
        return 2 * (height + height);
    }
    @Override
    public int getNumBrackets(){
    bracket = 0;
    tubeLength = 2 * (height + height);
    if(tubeLength < 20){
       bracket = 4;
    }
    
    for(int i = 20; i <= tubeLength; i+=5){
    bracket+=4;
    
    }
    return bracket;
    }
}
