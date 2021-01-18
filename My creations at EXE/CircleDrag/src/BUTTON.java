import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class BUTTON extends JPanel {
static JFrame frame;
private boolean dragging = false;
private Point last;
private int x, y, width, height;
private MouseDrag mouseDrag;
private final class MouseDrag extends MouseAdapter {
public void mousePressed(MouseEvent m) {
last = m.getPoint();
dragging = isInsideEllipse(last);
if (!dragging) {
x = last.x;
y = last.y;
width = 0;
height = 0;
}
repaint();
}
public void mouseReleased(MouseEvent m) {
last = null;
dragging = false;
repaint();
}
public void mouseDragged(MouseEvent m) {
int dx = m.getX() - last.x;
int dy = m.getY() - last.y;
if (dragging) {
x += dx;
y += dy;
} else {
width += dx;
height += dy;
}
last = m.getPoint();
repaint();
}
}
public BUTTON() {
setBackground(Color.WHITE);
mouseDrag = new MouseDrag();
addMouseListener(mouseDrag);
addMouseMotionListener(mouseDrag);
}
public boolean isInsideEllipse(Point point) {
return new Ellipse2D.Float(x, y, width, height).contains(point);
}
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawOval(x, y, width, height);
}
public static void main(String s[]) {
BUTTON panel = new BUTTON();
frame = new JFrame("Button Example");
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0);}
});
frame.getContentPane().add("Center", panel);
frame.pack();
frame.setVisible(true);
frame.setSize(400 ,400);
}
}