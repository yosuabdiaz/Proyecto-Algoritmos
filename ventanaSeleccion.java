

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class ventanaSeleccion {
        int tipo=0;
	JFrame frmSelectAreaIn;
	private JPanel selectedAreaPanel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public ventanaSeleccion(String foto,int ptipo) throws IOException {
            tipo = ptipo;
            initialize(foto);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize(String foto) throws IOException {
		frmSelectAreaIn = new JFrame();
                frmSelectAreaIn.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmSelectAreaIn.setTitle("Select Area In Image");
		frmSelectAreaIn.setBounds(100, 100, 708, 370);
		//frmSelectAreaIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectAreaIn.getContentPane().setLayout(null);
		
		// Image Panel display selected area of the image
		selectedAreaPanel = new JPanel();
		selectedAreaPanel.setBounds(869, 36, 221, 289);
		frmSelectAreaIn.getContentPane().add(selectedAreaPanel);
		
		// Image Panel display image with graphics
		JPanel mainPanel = new panelImagen(foto, this);
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
                Variables golbal = new Variables();
                //Arma la matriz de RGBs
                int width = bufferedImage.getWidth();
                int height = bufferedImage.getHeight();
                int[][] result = new int[height][width];
                for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				result[row][col] = bufferedImage.getRGB(col, row);
			}
                    }
                if (tipo==1){
                    System.out.println("petalo");
                    petalo Petalo = new petalo();
                    Petalo.setMat(result);
                    Petalo.mostrar();
                    golbal.agregarPetalo(Petalo);
                }
                if(tipo==2){
                    System.out.println("centro");
                    centro Centro = new centro();
                    Centro.setMat(result);
                    Centro.mostrar();
                    golbal.agregarCentro(Centro);
                }
                
    	g.drawImage(bufferedImage, 0, 0, null);
	}
}
