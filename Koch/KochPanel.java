
import java.awt.*;
import javax.swing.JPanel;

public class KochPanel extends JPanel
{
<<<<<<< HEAD
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private int current; //current order

=======
   private final int PANEL_WIDTH = 1900;
   private final int PANEL_HEIGHT = 900;
   private int current; 
   
>>>>>>> fd8d31838d6b3fac28a95f9b567785bd81240fbe
   public KochPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }
<<<<<<< HEAD

   public void drawFractal (int order, int x1, int y1, int x5, int y5,
                            Graphics page)
=======
   
   public void drawFractal (Graphics page, int x1, int y1, double t, int order)
>>>>>>> fd8d31838d6b3fac28a95f9b567785bd81240fbe
   {
       if(order==0){return;}
       int x2 = x1+(int)(Math.cos(Math.toRadians(t))*order*7);
       int y2 = y1+(int)(Math.sin(Math.toRadians(t))*order*7);
       page.drawLine(x1,y1,x2,y2);
       drawFractal(page,x2,y2,t-20,order-1);
       drawFractal(page,x2,y2,t+20,order-1);
       
       // Random color of the branches
       /*page.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));*/
   }

   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      page.translate(950,800);
      page.setColor (Color.magenta);
      drawFractal(page,0,100,-90,current);
   }
   public void setOrder (int order)
   {
      current = order;
   }

   public int getOrder ()
   {
      return current;
   }
}
