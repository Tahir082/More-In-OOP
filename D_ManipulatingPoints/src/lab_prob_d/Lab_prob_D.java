
package lab_prob_d;
import java.util.Scanner;
import javafx.geometry.Point2D;

class Line{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    Line(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        
    }
    
    public double findSlope(){
        double slope;
        slope= (this.y2-this.y1)/(this.x2-this.x1);
        return slope;
    }
    
    public String toString(){
        String str="The line has points: ("+this.x1+","+this.y1+") and ("+this.x2+","+this.y2+") ";
        return str;
    }
    
    public static boolean isIntersecting(Line L1, Line L2){
        double slope_L1= L1.findSlope();
        double slope_L2= L2.findSlope();
        if(slope_L1!=slope_L2){
            return true;
        }
        else{
            return false;
        }
        
    }
}
public class Lab_prob_D {
  
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Line line[]= new Line[4];
        double x1, y1, x2, y2;
        for(int i=0; i<4; i++){
            System.out.println("Input Line "+ (i+1));
            System.out.println("Value of x1:");
            x1= in.nextDouble();
            System.out.println("Value of y1:");
            y1=in.nextDouble();
            System.out.println("Value of x2:");
            x2=in.nextDouble();
            System.out.println("Value of y2:");
            y2=in.nextDouble();
            line[i]= new Line(x1,x2,y1,y2);
        
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==j){
                    continue;
                }
                else{
                    boolean intersect= Line.isIntersecting(line[i], line[j]);
                    if(intersect==true){
                        System.out.println("Line "+ (i+1) +" and "+ (j+1)+ " are intersecting");
                    }
                    else{
                        System.out.println("Line "+ (i+1) +" and "+ (j+1)+ " are NOT intersecting");
                    }
                    
                }
                
            }
        }
        
        
    }
}
    

