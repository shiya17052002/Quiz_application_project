package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rules  extends JFrame implements ActionListener{

	String name;
	JButton back,start;
	rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome "+name+" t0 Mind Booster");
		heading.setBounds(50,20,650,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(30,100,750,390);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(
				"<html>"+  
		"1. In this quiz, there will be multiple-choice questions."+ "<br><br>"+
		"2. For each question, there will be four options, and one of them is correct."+"<br><br>"+
		"3. You can only choose one option from them. "+"<br><br>"+
		"4. For attempting each question, you will have 20 seconds. After that, you will get the next question automatically, and you cannot go back to the previous question."+"<br><br>"+
		"5. Think before you choose any option because after selecting the next button, you cannot come back to the question and choose another one."+"<br><br>"+
		"6. For each correct question, you will get 10 points, and for a wrong question, you will not get any points."+"<br><br>"+
		"7. You will have access to one lifeline called \"50-50,\" which, upon activation, will eliminate two incorrect answer options."+"<br><br>"+
		"           "+" Good Luck!!!"+"<br><br>"+
		"<html>"
				);
		add(rules);
		
		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);

	    start = new JButton("Start");
	    start.setBounds(400,500,100,30);
	    start.setBackground(new Color(30,144,254));
	    start.setForeground(Color.WHITE);
	    start.addActionListener(this);
		add(start);
		
		 
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
			setVisible(false);
	new Quiz(name);
		}else {
			setVisible(false);
			new Login();
		}
	}
		
	public static void main(String[] args) {
		new rules("User");

	}

}
