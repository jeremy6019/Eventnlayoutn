package evenPractice;

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

    List list;
    Checkbox[] checkBoxs;
    Button btn;   
    ArrayList<String> fcs;
    
    public ItemFrame() {    	
    	setLayout(new FlowLayout());
    	fcs = new ArrayList<String>(); 
    	fcs.add("FC Barcelona");
    	fcs.add("Real Madrid");
    	fcs.add("ManCity FC");
    	fcs.add("LiverPool FC ");
    	fcs.add("FC PSG ");
    	fcs.add("Olympique Lyon");
    	fcs.add("Bayern Munchen");
    	fcs.add("FC DortMund");
    	fcs.add("AC Milan");
    	fcs.add("Ubentus turin");
    	
    	list = new List(6, true);
    	for(String fc : fcs) {
    		list.add(fc);
    	}
    	add(list);
    	
    	checkBoxs = new Checkbox[5];
    	checkBoxs[0] = new Checkbox("호날두");
    	checkBoxs[1] = new Checkbox("메시");
    	checkBoxs[2] = new Checkbox("스털링");
    	checkBoxs[3] = new Checkbox("손흥민");
    	checkBoxs[4] = new Checkbox("네이마르");
    	for(Checkbox box : checkBoxs) {
    		add(box);
    	}
    	
    	btn = new Button("확인");
    	add(btn);
    	
    	list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					System.out.printf("%s가 선택되었습니다.\n",
							fcs.get((Integer)e.getItem()));
				} else {
					System.out.printf("%s가 선택 해제되었습니다.\n",
							fcs.get((Integer)e.getItem()));
				}				
			} 		
    	});
    	
    	btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    int[] selectedIndexes = list.getSelectedIndexes();
			    for(int i : selectedIndexes) {
			    	System.out.printf("%s가 선택됨\n", fcs.get(i));
			    }			
			}   		
    	});
    	
    	setBounds(100, 100, 400, 400);
    	setTitle("Item event 처리"); 
    	setVisible(true);
    }
		
}
