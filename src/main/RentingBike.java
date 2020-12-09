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
import javax.swing.JTextField;
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
		rentingBikePanel.setBounds(10, 10, 760, 440);
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
			imgPanel.setBounds(5, 5, 130, 120);
			rentingBikePanel.add(imgPanel);
			imgPanel.setLayout(new BorderLayout());
			{
				JLabel imgLabel = new JLabel("");
				imgLabel.setBounds(10, 11, 106, 66);
				Image dimg = myPicture.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),
				        Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				imgLabel.setIcon(imageIcon);	
				imgLabel.setVerticalAlignment(JLabel.CENTER);
				imgLabel.setHorizontalAlignment(JLabel.CENTER);
				imgPanel.add(imgLabel);
			}
		}
		
		JLabel title = new JLabel("Cho thuê xe");
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(title);	
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.BOTTOM);
		title.setFont(new Font("Verdana", Font.BOLD, 50));
		
		rentingBikePanel.add(titlePanel);
		titlePanel.setBounds(140,5,610,120);
		titlePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlePanel.setLayout(new BorderLayout());
		titlePanel.add(title);
		
		JPanel upcontentPanel = new JPanel();
		rentingBikePanel.add(upcontentPanel);
		upcontentPanel.setBounds(5,130,750,50);
//		upcontentPanel.setBackground(Color.BLACK);
		upcontentPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		JLabel inputCodeLabel = new JLabel("Nhập mã xe");
		upcontentPanel.add(inputCodeLabel);
		inputCodeLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		inputCodeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JTextField inputCodeField = new JTextField();
		inputCodeField.setPreferredSize( new Dimension( 150, 30 ) );
		upcontentPanel.add(inputCodeField);
		
		JButton codeButton = new JButton("Tìm kiếm xe");
		upcontentPanel.add(codeButton);
		
		JPanel downContentPanel = new JPanel(null);
		rentingBikePanel.add(downContentPanel);
		downContentPanel.setBounds(5,190,750,250);
		downContentPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		
//		downContentPanel.add(nameLabel);
//		downContentPanel.add(nameField);
//		nameLabel.setBounds(300,0,50,50);
//		nameField.setBounds(360,5,150,30);
//		nameField.setPreferredSize( new Dimension( 150, 30 ) );
//		
//		
//		JLabel typeLabel = new JLabel("Tên xe");
//		
//		
//		JTextField typeField = new JTextField();
//		typeField.setPreferredSize( new Dimension( 150, 30 ) );
//		downContentPanel.add(typeLabel);
//		downContentPanel.add(typeField);
		
		JPanel namePanel = new JPanel();
		downContentPanel.add(namePanel);
		namePanel.setBounds(5,5,740,40);
		
		JLabel nameLabel = new JLabel("Tên xe");
		JTextField nameField = new JTextField();
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		nameField.setPreferredSize( new Dimension( 150, 30 ) );
		
		
		JPanel typePanel = new JPanel();
		downContentPanel.add(typePanel);
		typePanel.setBounds(5,45,740,40);
		
		JLabel typeLabel = new JLabel("Loại xe");
		JTextField typeField = new JTextField();
		typeLabel.setHorizontalAlignment(JLabel.CENTER);
		typePanel.add(typeLabel);
		typePanel.add(typeField);
		typeField.setPreferredSize( new Dimension( 150, 30 ) );
		
		
		JPanel weightPanel = new JPanel();
		downContentPanel.add(weightPanel);
		weightPanel.setBounds(5,90,740,40);
		
		JLabel weightLabel = new JLabel("Trọng lượng");
		JTextField weightField = new JTextField();
		weightLabel.setHorizontalAlignment(JLabel.CENTER);
		weightPanel.add(weightLabel);
		weightPanel.add(weightField);
		weightField.setPreferredSize( new Dimension( 150, 30 ) );
		
		JPanel licensePanel = new JPanel();
		downContentPanel.add(licensePanel);
		licensePanel.setBounds(5,140,740,40);
		
		JLabel licenseLabel = new JLabel("Biển số xe");
		JTextField licenseField = new JTextField();
		licenseLabel.setHorizontalAlignment(JLabel.CENTER);
		licensePanel.add(licenseLabel);
		licensePanel.add(licenseField);
		licenseField.setPreferredSize( new Dimension( 150, 30 ) );
		
		JPanel datePanel = new JPanel();
		downContentPanel.add(datePanel);
		datePanel.setBounds(5,190,740,40);
		
		JLabel dateLabel = new JLabel("Ngày sản xuất");
		JTextField dateField = new JTextField();
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		datePanel.add(dateLabel);
		datePanel.add(dateField);
		dateField.setPreferredSize( new Dimension( 150, 30 ) );
		JButton rentingButton = new JButton("Thuê xe");
		datePanel.add(rentingButton);
//		JLabel licenseLabel = new JLabel("Tên xe");
//		JTextField licenseField = new JTextField();
//		licenseField.setPreferredSize( new Dimension( 150, 30 ) );
//		downContentPanel.add(licenseLabel);
//		downContentPanel.add(licenseField);
//		
	}
	public static void main(String[] args) {
		RentingBike scr=  new RentingBike();
		scr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		scr.setVisible(true);
	}
}
