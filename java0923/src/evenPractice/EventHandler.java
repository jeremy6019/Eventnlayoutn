package evenPractice;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

	Frame frame;
	
	
	/*
	public EventHandler(Frame frame) {
		this.frame = frame;
	}
	*/
	
	public void setFrame(Frame frame) {
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setBackground(Color.cyan);

	}

}
