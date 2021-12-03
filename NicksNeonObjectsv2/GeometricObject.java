    
/**
 * Rodney Breslin
 * CIS 261
 * Geometric Object Superclass UML DIAGRAM
 * ------------------------------
 * -color: string
 * -filled: boolean
 * -dateCreated: string
 * ------------------------------
 * +GeometricObject()
 * +GeometricObject(color: string, filled: boolean)
 * +getColor(): string
 * +setColor(color: string)
 * +isFilled(): boolean
 * +setFilled(filled: boolean)
 * +getDateCreated(): string
 * +toString(): string
 * +getTubeLength():double
 * +getNumBrackets():int
* 
 */
import java.util.Date;
public abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();

    }

    public GeometricObject(String color, boolean filled){

    }

    public String getColor(){
        return color;

    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;

    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color +
        "and filled: " + filled;

    }
    public abstract double getTubeLength();
    public abstract int getNumBrackets();
}

