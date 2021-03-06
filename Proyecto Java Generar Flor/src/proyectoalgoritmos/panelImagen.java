package proyectoalgoritmos;


import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class panelImagen extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
    private Shape shape = null;
    Point startDrag, endDrag;

	public panelImagen( String inputImage, ventanaSeleccion mf1) throws IOException {
		final ventanaSeleccion mf = mf1;
		image = ImageIO.read(new File(inputImage));
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				startDrag = new Point(e.getX(), e.getY());
				endDrag = startDrag;
				repaint();
			}

			public void mouseReleased(MouseEvent e) {
				if(endDrag!=null && startDrag!=null) {
					try {
						/*shape = makeRectangle(startDrag.x, startDrag.y, e.getX(),e.getY());*/
                                                shape = makeRectangle(startDrag.x, startDrag.y, e.getX(),e.getY());        
                                                
						mf.updateSelectedRegion(image.getSubimage(startDrag.x, startDrag.y, e.getX()-startDrag.x, e.getY()-startDrag.y));	
						startDrag = null;
						endDrag = null;
						repaint();
					} catch (Exception e1) {
						e1.printStackTrace();
					}	
				}
			}
		});//6 + 34
                   //3 + 34 
		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				endDrag = new Point(e.getX(), e.getY());
				repaint();
			}	
		});
	}

	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(image, 0, 0, null);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setStroke(new BasicStroke(2));
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				0.50f));

		if (shape != null) {
			g2.setPaint(Color.BLACK);
			g2.draw(shape);
			g2.setPaint(Color.WHITE);
			g2.fill(shape);
		}
		
		if (startDrag != null && endDrag != null) {
			g2.setPaint(Color.LIGHT_GRAY);
			Shape r = makeRectangle(startDrag.x, startDrag.y, endDrag.x,
					endDrag.y);
			g2.draw(r);
		}
		
	}

	private Rectangle2D.Float makeRectangle(int x1, int y1, int x2, int y2) {
		return new Rectangle2D.Float(Math.min(x1, x2), Math.min(y1, y2),
				Math.abs(x1 - x2), Math.abs(y1 - y2));
	}
	
}