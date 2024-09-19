package khProject;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Suggest_Leg {
	public Suggest_Leg() {
		Frame f=new Frame();

		f.setLayout(null);

		f.setBounds(400, 200, 1000, 600);
		
		Font font_l=new Font("",Font.BOLD,30);
		Label l=new Label("Leg Exercise");
		l.setFont(font_l);
		l.setBounds(350, 50, 300, 35);
		f.add(l);
		

		ImageIcon img_DeadLift=new ImageIcon("img_leg/deadlift.jpg");
		JButton b_DeadLift=new JButton(img_DeadLift);
		b_DeadLift.setBounds(80,100,250,150);
		f.add(b_DeadLift);
		
		Checkbox ch_DeadLift_Success=new Checkbox("성공");
		ch_DeadLift_Success.setBounds(150, 260, 50, 30);
		f.add(ch_DeadLift_Success);

		Checkbox ch_DeadLift_Fail=new Checkbox("실패");
		ch_DeadLift_Fail.setBounds(220, 260, 50, 30);
		f.add(ch_DeadLift_Fail);

		b_DeadLift.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_LegPress=new ImageIcon("img_leg/legpress.jpg");
		JButton b_LegPress=new JButton(img_LegPress);
		b_LegPress.setBounds(380,100,250,150);
		f.add(b_LegPress);
		
		Checkbox ch_LegPress_Success=new Checkbox("성공");
		ch_LegPress_Success.setBounds(450, 260, 50, 30);
		f.add(ch_LegPress_Success);
		
		Checkbox ch_LegPress_Fail=new Checkbox("실패");
		ch_LegPress_Fail.setBounds(520, 260, 50, 30);
		f.add(ch_LegPress_Fail);
		
		b_LegPress.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_LegExtension=new ImageIcon("img_leg/legExtension.jpg");
		JButton b_LegExtension=new JButton(img_LegExtension);
		b_LegExtension.setBounds(680,100,250,150);
		f.add(b_LegExtension);
		
		Checkbox ch_LegExtension_Success=new Checkbox("성공");
		ch_LegExtension_Success.setBounds(750, 260, 50, 30);
		f.add(ch_LegExtension_Success);
		
		Checkbox ch_LegExtension_Fail=new Checkbox("실패");
		ch_LegExtension_Fail.setBounds(820, 260, 50, 30);
		f.add(ch_LegExtension_Fail);
		
		b_LegExtension.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_LegCurl=new ImageIcon("img_leg/legCurl.jpg");
		JButton b_LegCurl=new JButton(img_LegCurl);
		b_LegCurl.setBounds(80,350,250,150);
		f.add(b_LegCurl);
		
		Checkbox ch_LegCurl_Success=new Checkbox("성공");
		ch_LegCurl_Success.setBounds(150, 510, 50, 30);
		f.add(ch_LegCurl_Success);
		
		Checkbox ch_LegCurl_Fail=new Checkbox("실패");
		ch_LegCurl_Fail.setBounds(220, 510, 50, 30);
		f.add(ch_LegCurl_Fail);
		
		b_LegCurl.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_Lunge=new ImageIcon("img_leg/runge.jpg");
		JButton b_Lunge=new JButton(img_Lunge);
		b_Lunge.setBounds(380,350,250,150);
		f.add(b_Lunge);
		
		Checkbox ch_Lunge_Success=new Checkbox("성공");
		ch_Lunge_Success.setBounds(450, 510, 50, 30);
		f.add(ch_Lunge_Success);
		
		Checkbox ch_Lunge_Fail=new Checkbox("실패");
		ch_Lunge_Fail.setBounds(520, 510, 50, 30);
		f.add(ch_Lunge_Fail);
		
		b_Lunge.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		////////////////////////////////////////////////

		ImageIcon img_Squat=new ImageIcon("img_leg/squat.jpg");
		JButton b_Squat=new JButton(img_Squat);
		b_Squat.setBounds(680,350,250,150);
		f.add(b_Squat);
		
		Checkbox ch_Squat_Success=new Checkbox("성공");
		ch_Squat_Success.setBounds(750, 510, 50, 30);
		f.add(ch_Squat_Success);
		
		Checkbox ch_Squat_Fail=new Checkbox("실패");
		ch_Squat_Fail.setBounds(820, 510, 50, 30);
		f.add(ch_Squat_Fail);
		
		b_Squat.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		
		////////////////////////////////////////////////






		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		f.setVisible(true);
	}
}
