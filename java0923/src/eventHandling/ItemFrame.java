package eventHandling;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ItemFrame extends Frame {

	//List(아이템 목록) 와 버튼을 배치해서 List 에서  선택을 변경했을 떼
	//이벤트 처리를 해보고 버튼을 눌렀을 때 List에서 어떤 항목들을 선택했는지 확인 
	//Checkbox에서도 선택된 항목을 가져오기 
	
	List list; 
	Checkbox[] checkBoxs;
	Button btn;
	
	//List나 Choice처럼 여러 개의 항목을 출력하고 그 중에서 선택된 항목을 가져오는 
	//경우에 항목을 배열이나 java.util.List로 만들어 놓는 것이 좋습니다. 
	//List에 출력할 항목의 리스트 
	ArrayList<String> items;
	
	public ItemFrame() {
		setLayout(new FlowLayout());
		
		//목록만들기 
		items = new ArrayList<String>();
		items.add("Titlelist");
		items.add("Callaway");
		items.add("Romaro");
		items.add("Mizuno");
		items.add("TourStage");
		items.add("BridgeStone");
		items.add("Honma");
		items.add("Maruman");
		items.add("TaylorMade");
		
		//항목을 출력하는 List생성하고 데이터 추가하기  
		//6개의 항목을 보여주고 여러 개를 선택할 수 있도록  만들어 줍니다. 
		list = new List(6, true);
		for(String item : items) {
			list.add(item);
		} 
		add(list);
		
		
		checkBoxs = new Checkbox[5];
		checkBoxs[0] = new Checkbox("Oracle");
		checkBoxs[1] = new Checkbox("MySQL");
		checkBoxs[2] = new Checkbox("MSSQL");
		checkBoxs[3] = new Checkbox("MongoDB");
		checkBoxs[4] = new Checkbox("SQlite");
		for(Checkbox box : checkBoxs) {
			add(box);
		}
		
		//버튼을 생성하고 추가 
		btn = new Button("확인"); 
		add(btn); 
		
		//List에서 항목을 선택했을때 처리 
		list.addItemListener(new ItemListener(){
			
           //List에서 항목을 선택했을 때 호출되는 메소드 
			@Override
			public void itemStateChanged(ItemEvent e) {
				//선택한 항목 출력  - 선택이 해제된 아이템과 선택된 아이템의 
				//인덱스가 리턴됩니다.
				//System.out.printf("%s\n", e.getItem());
				//선택이 변경된 내용 
				//선택이 된 아이템은 1 선택이 해제된 아이템은 2가 리턴 
				//System.out.printf("d\n", e.getStateChange());
				
				//어떤 메소드의 리턴타입이 Object일 때 
				//출력하는 경우를 제외하고는 강제 형 변환해서 사용해야 합니다. 
			    if(e.getStateChange()== 1) {
			    	System.out.printf("%s가 선택되어있습니다.\n",
			    			items.get((Integer)e.getItem()));
			    } else {
			    	System.out.printf("%s가 선택 해제되었습니다..\n",
			    			items.get((Integer)e.getItem()));
			    }								
			}			
		});
		
		//버튼을 클릭했을 때 List에서 선택된 항목들을 출력 
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//List처럼 여러 	개의 항목을 출력하는 컴포넌트 들은 
				//자신의 항목 중에서 몇 번째 항목이 선택되었는지 리턴하는 메소드가
				//존재합니다. 
				//getSelectedIndex, getSelectedIndexes 
				int[] selectedIndexes = list.getSelectedIndexes();
				//선택한 인덱스를 가지고 items에서 항목을 찾아와서 출력 
				for(int i : selectedIndexes) {
					System.out.printf("%s가 선택됨\n", items.get(i));
				}
				
			}
			
		});
		
		setBounds(100, 100, 400, 400); 
		setTitle("Item Event 처리 "); 
		setVisible(true);
		
	}
	
	
	
	
	
}
