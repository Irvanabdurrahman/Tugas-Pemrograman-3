import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrameAction extends JFrame implements ActionListener{
	JButton bOk;
	public FrameAction(){
	super("Copyright by Irvan Abdurrahman | 4510210003");
		bOk = new JButton("Click Me..!");
		this.setSize(400,400);
		this.setLocation(300,200);
		
		bOk.addActionListener(this);
		Container kontainer = this.getContentPane();
		SpringLayout layout = new SpringLayout();
		kontainer.setLayout(layout);
		kontainer.add(bOk);
		
		layout.putConstraint(SpringLayout.WEST, bOk,150,SpringLayout.WEST, kontainer);
		layout.putConstraint(SpringLayout.NORTH, bOk,150,SpringLayout.NORTH, kontainer);
		
	
	}


public void actionPerformed(ActionEvent event){
	if(event.getSource() == bOk){
		JOptionPane.showMessageDialog(this,
		"You Like me guys..!!", "message",
		JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
public static void main(String[] args){
	new FrameAction().setVisible(true);
	}
}