package rentingbike;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.TileObserver;
import java.io.IOException;
import java.util.ArrayList;

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

import com.oms.bean.Bike;

import api.EcoBikeApi;

public class RentingBike extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTextField inputCodeField;//ma xe
	private JButton codeButton;//nut nhan de tim kiem xe
	private JTextField nameField;//ten xe
	private JTextField typeField;//loai xe
	private JTextField weightField;//trong luong
	private JTextField licenseField;// bien so xe
	private JTextField dateField;//ngay san xuat
	private JTextField costField;//gia thanh
	private JButton rentingButton;//an nut de thue xe
	private JLabel notificationLabel;//hien thi thong bao
	
	public RentingBike() {
		setResizable(false);
		setTitle("Thue xe");
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
		
		JLabel title = new JLabel("Cho thue xe");
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(title);	
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setFont(new Font("Verdana", Font.BOLD, 50));
		
		rentingBikePanel.add(titlePanel);
		titlePanel.setBounds(140,5,610,120);
		titlePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlePanel.setLayout(new BorderLayout());
		titlePanel.add(title);
		
		JLabel notificationLabel = new JLabel("Con caccccccccccccccccccccccc!!!!");
		titlePanel.add(notificationLabel,BorderLayout.SOUTH);
		notificationLabel.setHorizontalAlignment(JLabel.RIGHT);
//		notificationLabel.setOpaque(true);
//		notificationLabel.setBackground(Color.black);
		
		JPanel upcontentPanel = new JPanel();
		rentingBikePanel.add(upcontentPanel);
		upcontentPanel.setBounds(5,130,750,50);
//		upcontentPanel.setBackground(Color.BLACK);
		upcontentPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		JLabel inputCodeLabel = new JLabel("Nhap ma xe");
		upcontentPanel.add(inputCodeLabel);
		inputCodeLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		inputCodeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		inputCodeField = new JTextField();
		inputCodeField.setPreferredSize( new Dimension( 200, 30 ) );
		upcontentPanel.add(inputCodeField);
		
		codeButton = new JButton("Tim kiem xe");
		codeButton.setPreferredSize( new Dimension( 150, 30 ) );
		upcontentPanel.add(codeButton);
		
		JPanel downContentPanel = new JPanel(null);
		rentingBikePanel.add(downContentPanel);
		downContentPanel.setBounds(5,190,750,250);
		downContentPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		
		JLabel nameLabel = new JLabel("Ten xe");
		nameField = new JTextField();
		downContentPanel.add(nameLabel);
		downContentPanel.add(nameField);
		nameLabel.setBounds(200,5,100,40);
		nameField.setBounds(300,5,200,30);
		
		
		JLabel typeLabel = new JLabel("Loai xe");
		typeField = new JTextField();
		downContentPanel.add(typeLabel);
		downContentPanel.add(typeField);
		typeLabel.setBounds(200,45,100,40);
		typeField.setBounds(300,45,200,30);
		

		
		JLabel weightLabel = new JLabel("Trong luong");
		weightField = new JTextField();
		downContentPanel.add(weightLabel);
		downContentPanel.add(weightField);
		weightLabel.setBounds(200,85,100,40);
		weightField.setBounds(300,85,200,30);
		

		
		JLabel licenseLabel = new JLabel("Bien so xe");
		licenseField = new JTextField();
		downContentPanel.add(licenseLabel);
		downContentPanel.add(licenseField);
		licenseLabel.setBounds(200,125,100,40);
		licenseField.setBounds(300,125,200,30);
		
		
		JLabel dateLabel = new JLabel("Ngay san xuat");
		dateField = new JTextField();
		downContentPanel.add(dateLabel);
		downContentPanel.add(dateField);
		dateLabel.setBounds(200,165,100,40);
		dateField.setBounds(300,165,200,30);
		
		JLabel costLabel = new JLabel("Gia thanh");
		costField = new JTextField();
		downContentPanel.add(costLabel);
		downContentPanel.add(costField);
		costLabel.setBounds(200,205,100,40);
		costField.setBounds(300,205,200,30);
		rentingButton = new JButton("Thue xe");
		rentingButton.setBounds(505,205,150,30);
		downContentPanel.add(rentingButton);	
		rentingButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				EcoBikeApi api = new EcoBikeApi();
//				ArrayList<Bike> bikes = api.getBikes();
				notificationLabel.setText("Thong bao thue xe");
			}
		});
		
		
	}
	public static void main(String[] args) {
		RentingBike scr=  new RentingBike();
		scr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		scr.setVisible(true);
	}
}
