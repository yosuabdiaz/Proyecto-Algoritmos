package proyecto;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
public class leerArchivo{

	public int[][] abrirArchivo(String nombre)  throws IOException{
		
		InputStream input = new FileInputStream(nombre);
		ImageInputStream imageInput = ImageIO.createImageInputStream(input);
		BufferedImage hugeImage = ImageIO.read(imageInput);
	    int width = hugeImage.getWidth();
		int height = hugeImage.getHeight();
		int[][] result = new int[height][width]; 
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				result[row][col] = hugeImage.getRGB(col, row);
			}
		}
	    return result;
	}

}
