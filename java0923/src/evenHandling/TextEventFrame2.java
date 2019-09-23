package evenHandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventFrame2 extends Frame {
	
    TextField tf;
    Button btn;
    
    public TextEventFrame2() {
    	setLayout(new FlowLayout());
    	
    	tf = new TextField(20);
    	add(tf);
    	
    	tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				String k = tf.getText();
				if(k.charAt(k.length()-1)==' ') {
					String x ="";
					for(int i=0; i<k.length()-1; i+=1) {
						x += k.charAt(i);
					}
					tf.setText(x);
				}
				
				int dae=0;
				int so=0;
				int su=0;
				int etc=0;
				
				String input = tf.getText();
				int len = input.length();
				for(int i=0; i<len; i+=1) {
					char ch = input.charAt(i);
					if(ch>='A' && ch<='Z') {
						dae += 1;
					} else if(ch>='a' && ch<='z') {
						so += 1;
					} else if(ch>='0' && ch<='9') {
						su +=1;
					} else {
						etc += 1;
					}
				}
				
				if(dae>0 && so>0 && su>0 && etc>0) {
					setBackground(Color.green);
				} else {
					setBackground(Color.red);
				}
			}   		
    	});
    	
    	btn = new Button("확인");
    	add(btn);
    	
    	btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				String result = input.trim().toUpperCase();
				System.out.printf("%s\n", result);				
			} 		
    	});
    	
    	setBounds(100, 100, 300, 300);
    	setTitle("텍스트 이벤트 처리");
        setVisible(true);
    }
	
}

