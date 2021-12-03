
/**
 * 
 * Rectangle SubClass
 * Rodney Breslin
 * CIS 261
 * RECTANGLE UML DIAGRAM
 * ----------------------
 * -width:double
 * -height:double
 * -tubeLength:double
 * -bracket:int
 * ----------------
 * +Rectangle()
 * +Rectangle(with:double, height:double)
 * +Rectangle(width:double, color:string, filled:boolean)
 * +getWidth():double
 * +setWidth(double width)
 * +getHeight():double
 * +setHeight(width:double)
 * +getArea():double
 * +getTubeLength():double
 * +getNumBrackets():int;
 */
public class Rectangle extends GeometricObject
{
    private double width;
    private double height;
    private double tubeLength;
    private int bracket;
    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    @Override
    public double getTubeLength(){
        
        return 2 * (width + height);
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
