import java.awt.*;
import javax.swing.*;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
public class PractiseGFrame extends JFrame {
    public PractiseGFrame() {
        super("Translucent Window: Aviral");
        setBackground(new Color(255,255,255,0));
        setSize(new Dimension(300,200));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel() {
                protected void paintComponent(Graphics g) {
                    final int R = 250;
                    final int G = 250;
                    final int B = 250;

                    Paint p = new GradientPaint(105, 60, new Color(0, 0, 0, 0), 105, 0, new Color(255, 0, 50, 255), true);
                    Graphics2D g2d = (Graphics2D)g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
        };
        setContentPane(panel);
        setLayout(new GridBagLayout());
        add(new JButton("Hello World"));
    }

    public static void main(String[] args) {
        // Determine what the GraphicsDevice can support.
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported = gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);

        //If translucent windows aren't supported, exit.
        if (!isPerPixelTranslucencySupported) {
            System.out.println(
                "Per-pixel translucency is not supported");
                System.exit(0);
        }
        
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create the GUI on the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
  PractiseGFrame var = new PractiseGFrame();
               // Display the window.
                var.setVisible(true);
  
            }
        });
    }
}
