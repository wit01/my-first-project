package Game_Domino;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Wit
 */
public class Screen extends JFrame{
ImageIcon a_Screen = new ImageIcon(getClass().getResource("folder\\Screen.png"));    
JLabel t0 = new JLabel(a_Screen);

ImageIcon domi0 = new ImageIcon(getClass().getResource("folder\\0.png"));    
JLabel pe0 = new JLabel(domi0);

ImageIcon domi1 = new ImageIcon(getClass().getResource("folder\\1.png"));    
JLabel pe1 = new JLabel(domi1);

ImageIcon domi2 = new ImageIcon(getClass().getResource("folder\\2.png"));    
JLabel pe2 = new JLabel(domi2);

ImageIcon domi3 = new ImageIcon(getClass().getResource("folder\\3.png"));    
JLabel pe3 = new JLabel(domi3);

ImageIcon domi4 = new ImageIcon(getClass().getResource("folder\\4.png"));    
JLabel pe4 = new JLabel(domi4);

ImageIcon domi5 = new ImageIcon(getClass().getResource("folder\\5.png"));    
JLabel pe5 = new JLabel(domi5);

ImageIcon domi6 = new ImageIcon(getClass().getResource("folder\\6.png"));    
JLabel pe6 = new JLabel(domi6);


    public Screen() {
    setTitle("Domino Advanced criador elton diogo");
    setSize(1070,803);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false); 
    setVisible(true); 
    //l7.setSize(600,600);
    //add(l7);
    }

@Override    
public void paint (Graphics g)          
  {
     Graphics2D g0 = (Graphics2D) g;
     Image imgScreen = a_Screen.getImage();
      
     AffineTransform at0 = AffineTransform.getTranslateInstance(0,0);
     at0.rotate(Math.toRadians(0));
     g0.drawImage(imgScreen, at0, t0); 
     
  }
  
}