package khProject;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ExFrame extends JFrame {
	
	private boolean result=true;
	
	public  ExFrame() {
		setLayout(null);
		setBounds(400, 200, 1000, 600); 

		Button finbut = new Button("수행 완료");
		Button dontbut = new Button("수행 실패");

		finbut.setBounds(50, 490, 130, 50);      //성공 버튼 위치
		dontbut.setBounds(230, 490, 130, 50);   //실패 버튼 위치

		
		finbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("good");
				result = true;  // 성공 시 result를 true로 설정
				dispose();
				
				
			}

		});

		dontbut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("one more time");
				result = false;  // 실패 시 result를 false로 설정
				dispose();
			}
		});



		add(finbut);   //완료 버튼 추가
		add(dontbut);   //실패 버튼 추가

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}

		} );
		System.out.println("result:" +result);

		setVisible(true);


	}

	public void title(String t) {   //제목 Label 
		Font font1 = new Font("", Font.BOLD,40);
		Label title = new Label(t);
		title.setFont(font1);
		title.setBounds(50, 50, 450, 50);
		add(title);
	}

	public void sub1(String s) {   //운동 상세 내용 첫째줄 Label
		Font font2 = new Font("", Font.PLAIN, 20);
		Label sub1 = new Label(s);
		sub1.setFont(font2);
		sub1.setBounds(50, 150, 500, 40);
		add(sub1);
	}

	public void sub2(String s) {   //운동 상세 내용 둘째줄 Label
		Font font2 = new Font("", Font.PLAIN, 20);
		Label sub2 = new Label(s);
		sub2.setFont(font2);
		sub2.setBounds(50, 190, 500, 40);
		add(sub2);
	}

	public void weight(String w) {   //중량 알림
		Font font3 = new Font("", Font.ITALIC, 35);
		Label weight = new Label("중량 : " + w);
		weight.setFont(font3);
		weight.setBounds(80, 240, 200, 100);
		add(weight);
	}
	public boolean result() {
	    System.out.println(result);
	    return result;
	}
	public void close() {

		this.dispose();
	}


}