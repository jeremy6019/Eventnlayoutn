package eventHandling;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

	Frame frame;

	/* 
	//생성자를 이용해서 가져오기  !! 중요 
	public EventHandler(Frame frame) {
		this.frame =frame;
	}
*/
	
	//frame의 setter메소드 
	public void setFrame(Frame frame) {
		this.frame =frame; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Frame에서 가져와서 사용해야함 
		frame.setBackground(Color.blue);  
       
		
	}

}
