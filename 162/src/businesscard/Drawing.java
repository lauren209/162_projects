package businesscard;


	import javax.imageio.ImageIO;

/**
	 * Write a description of class Drawing here.
	 *
	 * @author (your name)
	 * @version (a version number or a date)
	 */


	import javax.swing.*; 
	import java.awt.*;
	import java.awt.image.*;
import java.io.File;
import java.io.IOException;
	public class Drawing extends JPanel{
		public static void main(String[] a) {

			JFrame f = new JFrame();
			f.setContentPane(new Drawing()); 
			f.setSize(1000, 1000); 
			f.setVisible(true);



		} 
		public void paintComponent(Graphics g)
		{ // this statement required super.paintComponent(g);
			setBackground(Color.WHITE);
			//White Backround 
			g.setColor(Color.decode("#41f4d0")); 
			g.fillRect(500, 300, 350, 200); 
			//Used hex color to create base of card.
			g.setColor(Color.BLACK);
			g.drawRect(500, 300, 350, 200);
			//boarder of the card
			g.setColor(Color.WHITE);
			Font companyName = new Font("Impact", Font.BOLD, 20);
			g.setFont(companyName);
			g.drawString("C's Securities", 620, 380);
			//all white writing, large font size with Bold Impact font for Company name.  
			Font contactInfo = new Font("Times New Roman", Font.BOLD, 15);
			g.setFont(contactInfo);
			g.drawString("Owner: Chene Golaszewski", 620, 400);
			g.drawString("Office: 231-794-9191", 620, 440);
			g.drawString("Email: golaszec@mail.gvsu.edu", 620, 420);

			//all writing for contact info and name used white with in times new roman with smaller font size.
			//g.setColor(Color.BLUE); 
			//g.drawLi ne(190, 50, 190, 150); 
			//g.drawLine(210, 50, 210, 150); 
			//g.drawLine(230, 50, 230, 150);


			BufferedImage photo = null; 
			try {
				File file = new File("its me copy.jpeg");
				photo = ImageIO.read(file);
			} 
			catch (IOException e){
				g.drawString("Problem reading the file", 100, 100);
			}
			g.drawImage(photo, 10, 10, 150, 225, null);

		}
	}




