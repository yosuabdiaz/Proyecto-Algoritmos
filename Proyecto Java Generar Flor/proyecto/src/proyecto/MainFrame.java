package proyecto;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MainFrame {

	private JFrame frmSelectAreaIn;
	private JPanel selectedAreaPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmSelectAreaIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainFrame() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frmSelectAreaIn = new JFrame();
		frmSelectAreaIn.setTitle("Select Area In Image");
		frmSelectAreaIn.setBounds(100, 100, 708, 370);
		frmSelectAreaIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectAreaIn.getContentPane().setLayout(null);
		
		// Image Panel display selected area of the image
		selectedAreaPanel = new JPanel();
		selectedAreaPanel.setBounds(869, 36, 221, 289);
		frmSelectAreaIn.getContentPane().add(selectedAreaPanel);
		
		// Image Panel display image with graphics
		JPanel mainPanel = new ImagePanel("foto3.jpg", this);
		mainPanel.setBounds(10, 11, 849, 614);
		frmSelectAreaIn.getContentPane().add(mainPanel);
		
		JLabel lblSelectedArea = new JLabel("Selected Area");
		lblSelectedArea.setBounds(469, 11, 221, 14);
		frmSelectAreaIn.getContentPane().add(lblSelectedArea);
	}

	// function to update selected region of the image
	public void updateSelectedRegion(BufferedImage bufferedImage) {
		Graphics g = selectedAreaPanel.getGraphics();
		g.clearRect(0, 0, 221, 289);
    	g.drawImage(bufferedImage, 0, 0, null);
	}
}