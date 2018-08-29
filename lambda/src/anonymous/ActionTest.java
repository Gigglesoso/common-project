package anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionTest {
	public static void main(String[] args) {
		//1.8之前
		JButton show = new JButton("show");
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Before java8");
			}});
		
		//1.8之后
		show.addActionListener((e)->System.out.println("After java8"));
	}
}
