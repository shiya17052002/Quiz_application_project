package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login  extends JFrame implements ActionListener{
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		try {
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz.jpeg"));
		JLabel image= new JLabel(i1);
		image.setBounds(0,0,550,450);
		add(image);//to place content on frame
		} catch(Exception e) {
			System.out.println("Image cannot be found");
		}
	JLabel heading = new JLabel("Mind Booster");
	heading.setBounds(680,60,300,45);
	heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
	heading.setForeground(new Color(30,144,254));
	add(heading);
	
	JLabel name = new JLabel("Enter Your Name");
	name.setBounds(650,150,300,20);
	name.setFont(new Font("Mongolian Baiti",Font.BOLD,19));
	name.setForeground(new Color(30,144,254));
	add(name);
	
	tfname=new JTextField();
	tfname.setBounds(640,200,300,25);
	tfname.setFont(new Font("Times New Roman",Font.BOLD,17));
	add(tfname);
	
    rules = new JButton("Rules");
	rules.setBounds(650,290,110,25);
	rules.setBackground(new Color(30,144,254));
	rules.setForeground(Color.WHITE);
	rules.addActionListener(this);
	add(rules);
	
	 back = new JButton("Back");
	back.setBounds(850,290,110,25);
	back.setBackground(new Color(30,144,254));
	back.setForeground(Color.WHITE);
	back.addActionListener(this);
	add(back);
	
		setSize(1100,500);
		setLocation(200,150);
		
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name = tfname.getText();
			setVisible(false);
			new rules(name);
		}else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

}
