import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyButton extends JButton{
	static int count=0;
	int index;
	
	public MyButton(String s) {
		super(s);
		index=count++;
	}
}

public class Puzzle extends JFrame implements ActionListener{
	MyButton[] buttons;
	MyButton reset;
	
	public Puzzle() {
		super("puzzle");
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(0,3,2,2));
		buttons=new MyButton[9];
		for(int i=0;i<8;i++) {
			buttons[i]=new MyButton(" "+(i+1));
		}
		buttons[8]=new MyButton(" ");
		for(int i=0;i<9;i++) {
			panel.add(buttons[i]);
		}
		for(int i=0;i<9;i++) {
			buttons[i].addActionListener(this);
		}
		this.add(panel,BorderLayout.CENTER);
		
		reset=new MyButton("reset");
		reset.setBackground(Color.blue);
		reset.setForeground(Color.green);
		
		this.add(reset, BorderLayout.SOUTH);
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		MyButton button=(MyButton)e.getSource();
		if(button.getText().equals(" ")==true) return;
		if(button.index==0) {
			if(buttons[1].getText().equals(" "));
			{buttons[1].setText(button.getText()); button.setText(" ");}
			if(buttons[3].getText().equals(" "));
			{buttons[3].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==1) {
			if(buttons[0].getText().equals(" "))
			{buttons[0].setText(button.getText()); button.setText(" ");}
			if(buttons[2].getText().equals(" "))
			{buttons[2].setText(button.getText()); button.setText(" ");}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==2) {
			if(buttons[1].getText().equals(" "));
			{buttons[1].setText(button.getText()); button.setText(" ");}
			if(buttons[5].getText().equals(" "));
			{buttons[5].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==3) {
			if(buttons[0].getText().equals(" "))
			{buttons[0].setText(button.getText()); button.setText(" ");}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(button.getText()); button.setText(" ");}
			if(buttons[6].getText().equals(" "))
			{buttons[6].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==4) {
			if(buttons[1].getText().equals(" "));
			{buttons[1].setText(button.getText()); button.setText(" ");}
			if(buttons[3].getText().equals(" "));
			{buttons[3].setText(button.getText()); button.setText(" ");}
			if(buttons[5].getText().equals(" "));
			{buttons[5].setText(button.getText()); button.setText(" ");}
			if(buttons[7].getText().equals(" "));
			{buttons[7].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==5) {
			if(buttons[2].getText().equals(" "))
			{buttons[2].setText(button.getText()); button.setText(" ");}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(button.getText()); button.setText(" ");}
			if(buttons[8].getText().equals(" "))
			{buttons[8].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==6) {
			if(buttons[3].getText().equals(" "));
			{buttons[3].setText(button.getText()); button.setText(" ");}
			if(buttons[7].getText().equals(" "));
			{buttons[7].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==7) {
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(button.getText()); button.setText(" ");}
			if(buttons[6].getText().equals(" "))
			{buttons[6].setText(button.getText()); button.setText(" ");}
			if(buttons[8].getText().equals(" "))
			{buttons[8].setText(button.getText()); button.setText(" ");}
		}
		
		if(button.index==8) {
			if(buttons[5].getText().equals(" "));
			{buttons[5].setText(button.getText()); button.setText(" ");}
			if(buttons[7].getText().equals(" "));
			{buttons[7].setText(button.getText()); button.setText(" ");}
		}
	}

	public static void main(String[] args) {
		new Puzzle();
	}

}
