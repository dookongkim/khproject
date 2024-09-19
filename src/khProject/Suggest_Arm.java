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

public class Suggest_Arm {
	public Suggest_Arm() {
		
		
		Frame f=new Frame();

		f.setLayout(null);

		f.setBounds(400, 200, 1000, 600);

		Font font_l=new Font("",Font.BOLD,30);
		Label l=new Label("Arm Exercise");
		l.setFont(font_l);
		l.setBounds(350, 50, 300, 35);
		f.add(l);
		
		

		ImageIcon img_BarbellCurl=new ImageIcon("img_arm/BarbellCurl.jpg");
		JButton b_BarbellCurl=new JButton(img_BarbellCurl);
		b_BarbellCurl.setBounds(80,100,250,150);
		f.add(b_BarbellCurl);
		
		Checkbox ch_BarbellCurl_Success=new Checkbox("성공");
		ch_BarbellCurl_Success.setBounds(150, 260, 50, 30);
		f.add(ch_BarbellCurl_Success);
		
		Checkbox ch_BarbellCurl_Fail=new Checkbox("실패");
		ch_BarbellCurl_Fail.setBounds(220, 260, 50, 30);
		f.add(ch_BarbellCurl_Fail);
		
		b_BarbellCurl.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////
		
		ImageIcon img_DumbelCurl=new ImageIcon("img_arm/DumbelCurl.jpg");
		JButton b_DumbelCurl=new JButton(img_DumbelCurl);
		b_DumbelCurl.setBounds(380,100,250,150);
		f.add(b_DumbelCurl);
		
		Checkbox ch_DumbelCurl_Success=new Checkbox("성공");
		ch_DumbelCurl_Success.setBounds(450, 260, 50, 30);
		f.add(ch_DumbelCurl_Success);
		
		Checkbox ch_DumbelCurl_Fail=new Checkbox("실패");
		ch_DumbelCurl_Fail.setBounds(520, 260, 50, 30);
		f.add(ch_DumbelCurl_Fail);
		
		b_DumbelCurl.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////
		
		ImageIcon img_PreacherCurl=new ImageIcon("img_arm/PreacherCurl.jpg");
		JButton b_PreacherCurl=new JButton(img_PreacherCurl);
		b_PreacherCurl.setBounds(680,100,250,150);
		f.add(b_PreacherCurl);
		
		Checkbox ch_PreacherCurl_Success=new Checkbox("성공");
		ch_PreacherCurl_Success.setBounds(750, 260, 50, 30);
		f.add(ch_PreacherCurl_Success);
		
		Checkbox ch_PreacherCurl_Fail=new Checkbox("실패");
		ch_PreacherCurl_Fail.setBounds(820, 260, 50, 30);
		f.add(ch_PreacherCurl_Fail);
		
		b_PreacherCurl.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_CablePushDown=new ImageIcon("img_arm/CablePushDown.jpg");
		JButton b_CablePushDown=new JButton(img_CablePushDown);
		b_CablePushDown.setBounds(80,350,250,150);
		f.add(b_CablePushDown);
		
		Checkbox ch_CablePushDown_Success=new Checkbox("성공");
		ch_CablePushDown_Success.setBounds(150, 510, 50, 30);
		f.add(ch_CablePushDown_Success);
		
		Checkbox ch_CablePushDown_Fail=new Checkbox("실패");
		ch_CablePushDown_Fail.setBounds(220, 510, 50, 30);
		f.add(ch_CablePushDown_Fail);
		
		b_CablePushDown.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_CloseBench=new ImageIcon("img_arm/CloseBench.jpg");
		JButton b_CloseBench=new JButton(img_CloseBench);
		b_CloseBench.setBounds(380,350,250,150);
		f.add(b_CloseBench);
		
		Checkbox ch_CloseBench_Success=new Checkbox("성공");
		ch_CloseBench_Success.setBounds(450, 510, 50, 30);
		f.add(ch_CloseBench_Success);
		
		Checkbox ch_CloseBench_Fail=new Checkbox("실패");
		ch_CloseBench_Fail.setBounds(520, 510, 50, 30);
		f.add(ch_CloseBench_Fail);
		
		b_CloseBench.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		////////////////////////////////////////////////

		ImageIcon img_Dips=new ImageIcon("img_arm/Dips.jpg");
		JButton b_Dips=new JButton(img_Dips);
		b_Dips.setBounds(680,350,250,150);
		f.add(b_Dips);
		
		Checkbox ch_Dips_Success=new Checkbox("성공");
		ch_Dips_Success.setBounds(750, 510, 50, 30);
		f.add(ch_Dips_Success);
		
		Checkbox ch_Dips_Fail=new Checkbox("실패");
		ch_Dips_Fail.setBounds(820, 510, 50, 30);
		f.add(ch_Dips_Fail);
		
		b_Dips.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		
		////////////////////////////////////////////////


		//뒤로가기 버튼
		JButton back=new JButton("뒤로가기");
		//back.setbounds
		


		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		f.setVisible(true);
	}

}

