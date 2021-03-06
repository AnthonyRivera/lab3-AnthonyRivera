import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.cyan);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        //Draw second border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 +3, y1 +3, width-6, height-6);
                      //Draw an oval
                      g.setColor(Color.LIGHT_GRAY);
                      g.drawOval(x2/2, y2/2, 55, 55);
                        
                       Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                      p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.drawPolygon(p);
                      //Draw red rectangle
                		g.setColor(Color.RED);
                		g.fillRect(x1, y1, width + 1, height + 1);
                		//Draw white rectangle
                		g.setColor(Color.WHITE);
                		g.fillRect(x1, y1 + 40, width, height / 5);
                		//Draw white rectangle 2
                		g.setColor(Color.WHITE);
                		g.fillRect(x1, y1 + 120, width, height / 5);
                		//Draw blue triangle
                		Polygon p = new Polygon();
                		p.addPoint(x1 + 150, y1 + 100);
                		p.addPoint(x1, y1);
                		p.addPoint(x1, y2);
                		g.setColor(Color.BLUE);
                		g.fillPolygon(p);
                		//Draw a star
                		Polygon p2 = new Polygon();
                		p2.addPoint(x1 + 25, y1 + 73);
                		p2.addPoint(x1 + 41, y1 + 73);
                		p2.addPoint(x1 + 47, y1 + 58);
                		p2.addPoint(x1 + 53, y1 + 73);
                		p2.addPoint(x1 + 69, y1 + 73);
                		p2.addPoint(x1 + 56, y1 + 83);
                		p2.addPoint(x1 + 61, y1 + 98);
                		p2.addPoint(x1 + 47, y1 + 88);
                		p2.addPoint(x1 + 34, y1 + 98);
                		p2.addPoint(x1 + 38, y1 + 83);
                		g.setColor(Color.WHITE);
                		g.fillPolygon(p2);

                	}


                        
            }
