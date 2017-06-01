package GUI_package;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Character_package.Hero;

public class Control_Window extends Panel implements ActionListener{
	
	JButton bnt1 = new JButton("보병");
	JButton bnt2 = new JButton("기병");
	JButton bnt3 = new JButton("용");

	public Control_Window(int weight, int height){
		
		
		this.setLocation(0, 350);
		this.setSize(weight,height);
		this.setBackground(Color.black);
		this.add(bnt1);
		bnt1.addActionListener(this);
		this.add(bnt2);
		bnt2.addActionListener(this);
		this.add(bnt3);
		bnt3.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bnt1){
			Hero c = new Hero(1);
			Game_Window.hero_list.add(c);
			
		}	
		else if(e.getSource()==bnt2){
			Hero c = new Hero(2);
			Game_Window.hero_list.add(c);
		}
		
		else if(e.getSource()==bnt3){
			Hero c = new Hero(3);
			Game_Window.hero_list.add(c);
		}
	}
}