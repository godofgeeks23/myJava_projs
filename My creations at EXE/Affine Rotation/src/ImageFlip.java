import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImageFlip extends JPanel {

    Image castle;
    BufferedImage bufferedImage;

    public ImageFlip() {
        castle = new ImageIcon("src/Picture1.png").getImage();
        bufferedImage =  new BufferedImage(castle.getWidth(null),
                 castle.getHeight(null), BufferedImage.TYPE_INT_RGB);
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        Graphics gb = bufferedImage.getGraphics();
        gb.drawImage(castle, 0, 0, null);
        gb.dispose();

        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        
        tx.translate(-castle.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        bufferedImage = op.filter(bufferedImage, null);

        g2d.drawImage(castle, 10, 10, null);
        g2d.drawImage(bufferedImage, null, 290, 10);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Flip image");
        frame.add(new ImageFlip());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(570, 230);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
