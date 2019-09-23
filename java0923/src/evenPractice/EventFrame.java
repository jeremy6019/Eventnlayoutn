package evenPractice;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EventFrame extends Frame {

	Button btn;
	//지역변수
/*
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(Color.cyan);		
		}
		
	}
*/	
	public EventFrame() {
		setLayout(new FlowLayout());
		btn = new Button("확인");
        EventHandler eventHandler = new EventHandler();
        eventHandler.setFrame(this);
        btn.addActionListener(eventHandler);
		
//    btn.addActionListener(new EventHandler(this));
		
//     btn.addActionListener(new EventHandler());
/*		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.cyan);				
			}			
		});
*/
		add(btn);
		
		setBounds(100, 100, 300, 300);
		setTitle("이벤트 처리 연습");
		setVisible(true);
		
	}
	 
	
}
