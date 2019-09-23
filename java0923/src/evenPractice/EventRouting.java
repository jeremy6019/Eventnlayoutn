package evenPractice;

import java.awt.Button;
import java.awt.Frame;

import eventHandling.EventHandler;
// 내일 강사님꼐 질문 
public class EventRouting extends Frame {

   Button blueBtn, greenBtn;
/*	
	class EventRoutingHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == blueBtn) {
				setBackground(Color.blue);
			} else if(e.getSource()== greenBtn) {
				setBackground(Color.green);
			}				
			
		}
     
		
	}
*/
	
	public EventRouting() {
		
		blueBtn = new Button("파랑");
		greenBtn = new Button("녹색");
		
		 EventHandler eventHandler = new EventHandler(); 
		 eventHandler.setFrame(this);
		 blueBtn.addActionListener(eventHandler);
		 greenBtn.addActionListener(eventHandler); 
		 
		add(blueBtn);
		add(greenBtn);
//		blueBtn.addActionListener(new EventRoutingHandler());
//		greenBtn.addActionListener(new EventRoutingHandler());
		
 /*       
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == blueBtn) {
					setBackground(Color.blue);
				} else if(e.getSource()== greenBtn) {
					setBackground(Color.green);
				}				
			}			
		};
		blueBtn.addActionListener(listener);
		greenBtn.addActionListener(listener);
*/
		
		/*
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);				
			}		
		});
		
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);				
			}		
		});
		*/
		
		
		setBounds(100, 100, 300, 300);
		setTitle("이벤트 라우팅");
		setVisible(true);
		
	}
}
