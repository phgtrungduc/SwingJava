package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.TileObserver;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class RentingBike extends JDialog {
	private final JPanel contentPanel = new JPanel();
	public RentingBike() {
		setResizable(false);
		setTitle("Thuê xe");
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel rentingBikePanel = new JPanel();
		rentingBikePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rentingBikePanel.setBounds(10, 11, 760, 440);
		contentPanel.add(rentingBikePanel);
		rentingBikePanel.setLayout(null);
		
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(this.getClass().getResource("../img/bike.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		{
			JPanel imgPanel = new JPanel();
			imgPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
			imgPanel.setBounds(10, 25, 125, 88);
			rentingBikePanel.add(imgPanel);
			imgPanel.setLayout(null);
			{
				JLabel imgLabel = new JLabel("");
				imgLabel.setBounds(10, 11, 106, 66);
				Image dimg = myPicture.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),
				        Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				imgLabel.setIcon(imageIcon);	
				imgPanel.add(imgLabel);
			}
		}
		JLabel title = new JLabel("Cho thuê xe");
		rentingBikePanel.add(title);
		title.setBounds(0,0,50,50);
		JPanel titlePanel = new JPanel(null);
		titlePanel.add(title);
		contentPanel.add(titlePanel);
		titlePanel.setBounds(135,0,500,200);
		titlePanel.setBackground(Color.BLUE);
		
	}
	public static void main(String[] args) {
		RentingBikeScreen scr=  new RentingBikeScreen();
		scr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		scr.setVisible(true);
	}
}
