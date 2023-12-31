package gui;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane and JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.DARK_GRAY);
		cp.setLayout(new FlowLayout());
		
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		
		setSize(720,360);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
