/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
public class RotLine {
   public float findAngle(float ax1, float ay1, float ax2, float ay2, float bx1, float by1, float bx2, float by2){
        float m1, m2, angle;
        double m;
        m1 = (ay2-ay1)/(ax2-ax1);
        m2 = (by2-by1)/(bx2-bx1);
        m = (m1-m2)/(1+(m1*m2));
        angle = (float) (Math.atan(m)*(180/3.14));
        return angle;
    }
    public double getRotPointX(double x1, int rad, float angle){
        double x =  (Math.cos(Math.toRadians(angle))*rad+x1);
        return x;
    }
    public double getRotPointY(double y1, int rad, float angle){
        double y =  (Math.sin(Math.toRadians(angle))*rad+y1);
        return y;
    }
    public double lineLength(int x1, int y1, int x2, int y2){
    int length;
    length = (int) Math.sqrt((x2-x1)^2+(y2-y1)^2);
    return length;
    }  
}
