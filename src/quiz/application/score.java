package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class score extends JFrame implements ActionListener {
	
	JLabel heading,lblscore;
	score(String name,int score)  {
		
		setBounds(350,150,840,550);
		getContentPane().setBackground(Color.WHITE);
	
		setLayout(null);
		try {
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("score.jpeg"));
			Image i2= i1.getImage().getScaledInstance(500,750,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image= new JLabel(i3);
			image.setBounds(30,180,480,250);
			add(image);//to place content on frame
			} catch(Exception e) {
				System.out.println("Image cannot be found");
			}
		
		heading= new JLabel("Thankyou "+name+" for playing Simple Minds");
		heading.setBounds(50,30,790,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,32));
		add(heading);
		

		lblscore= new JLabel("Your score is"+ score);
		lblscore.setBounds(270,100,800,30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,32));
		add(lblscore);

	 JButton   Playagain= new JButton("Play Again");
	 Playagain.setBounds(600,250,190,40);
	 Playagain.setFont(new Font("Tahoma",Font.PLAIN,22));
	 Playagain.setBackground(new Color(30,144,255));
	 Playagain.setForeground(Color.WHITE);
	 Playagain.addActionListener(this);
     add(Playagain);

	setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new score("user",0);

	}

}
