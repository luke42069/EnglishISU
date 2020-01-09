
import java.awt.Color;
import org.newdawn.slick.geom.Rectangle;

public class Bar {
    
    private int width, height, xloc, yloc;
    private Color colour;
    Rectangle r;
    
    public Bar(int value, Color c, int x){
        height=value;
        colour = c;
        xloc=x;
        yloc=200;
        width=75;
        r = new Rectangle(xloc,yloc,width,height);
    }
    
    public void draw(){
        
    }
    
}
