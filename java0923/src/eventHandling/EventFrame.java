package eventHandling;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EventFrame extends Frame {
    
	Button btn;
	//인스턴스 변수 
	int x = 30; 

	/*	
	//2)내부 클래스를 이용한 이벤트 처리 
	//인스턴스 변수 사용이 가능하고 상위클래스의 메소드 사용이 가능 
	class EventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(Color.yellow);
		    x= 30;
		}	
	}	
*/	

	public EventFrame() {
		
		// 지역변수 
		int y = 30;
		//final변수 - 상수 
		final int z = 30; 
		
		//Frame의 기본 레이아웃이 BorderLayout이라서 변경 
		setLayout(new FlowLayout());
		//버튼 생성 
		btn = new Button("확인");
		
		// 3) 외부에 만든 ActionListener인터페이스를 구현한 클래스의 
		// 객체를 생성해서 이벤트를 처리 
		// 생성자를 이용해서 데이터 넘기기 
	    // this가 Frame으로부터 상속을 받았기 때문에 Frame객체 
	    // btn.addActionListener(new EventHandler(this));
       
		//setter를 이용해서 Frame 넘겨주기 
	    EventHandler eventHandler = new EventHandler(); 
	    eventHandler.setFrame(this);
	    btn.addActionListener(eventHandler);
		
		//2) 내부에 만든 ActionListener 인터페이스를 구현한 클래스의 
		//객체를 생성해서 이벤트를 처리 
//		btn.addActionListener(new EventHandler());
		
		
		//버튼을 클릭했을때 처리를 위한 코드 구현 
		//1) anonymous를 이용하는 반법 
		//인스턴스 변수와 final은 사용이 가능하지만 이코드가 구현된 메소드에서
		//생성된 지역변수는 사용을 못합니다. 
		
/*		// 이벤트 처리부분 
       btn.addActionListener(new ActionListener() {
			
            //버튼을 누르거나 입력 도구에서 Enter를 누를 때 호출되는 메소드 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//프레임의 배경색 변경 
				setBackground(Color.pink);
				//인스턴스 변수는 사용이 가능 
//			    x = 20;
			    //지역변수는 사용할 수 없습니다. 
//			    y = 30;
			    //final변수 사용 가능 
//			   System.out.printf("%d", z);
			}
			
		});
*/		
		
	    add(btn);
	    
	    setBounds(100, 100, 300, 300);
	    setTitle("이벤트 처리 연습");
	    setVisible(true);
	    
	    
		
	}



	}
	

	
	

