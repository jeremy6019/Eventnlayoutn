package layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridFrame1 extends Frame {

	//버튼모임 
	Button[] btn;
	public GridFrame1() {
		btn = new Button[12];
        // 현재프레임의 레이아웃을 설정 
		this.setLayout(new GridLayout(3,4));
		//좌석번호의 앞부분을 출력할 변수 
		char ch = 'A'; 
		//좌석번호의 뒷부분을 출력할 변수 
		int idx = 1; 
		
		//버튼 생성 
		for(int i = 0; i < 12 ; i += 1) {
			//줄은 몫 
			ch = (char)('A' + (i/4)); 
			//칸은 나머지
			idx = 1 + (i%4); 
			
			String btnName = String.format("%c%d", ch,idx);
			btn[i] = new Button(btnName);
			//현재 프레임에 버튼을 추가 
			this.add(btn[i]);		
		}
		btn[12].setEnabled(false);
		
		//크기와 보여주기 설정은 필수 
		setTitle("Grid Layout"); 
		setLocation(300, 300); 
		setSize(300, 300); 
		setVisible(true);
	}
	
}
