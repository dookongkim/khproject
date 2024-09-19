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

public class Suggest_Backwork {

	Exercise ex=new Exercise();
	public Suggest_Backwork() {

		Frame f=new Frame();

		f.setLayout(null);

		f.setBounds(400, 200, 1000, 600);

		Font font_l=new Font("",Font.BOLD,30);
		Label l=new Label("Back Exercise");
		l.setFont(font_l);
		l.setBounds(350, 50, 300, 35);
		f.add(l);


		ImageIcon img_pull=new ImageIcon("img_back/Latpull.jpg");
		JButton b_latPull=new JButton(img_pull);
		b_latPull.setBounds(80,100,250,150);
		f.add(b_latPull);

		Checkbox ch_latPull_Success=new Checkbox("성공");
		ch_latPull_Success.setBounds(150, 260, 50, 30);
		//ch_latPull_Success.setEnabled(false);
		f.add(ch_latPull_Success);

		Checkbox ch_latPull_Fail=new Checkbox("실패");
		ch_latPull_Fail.setBounds(220, 260, 50, 30);
		//ch_latPull_Fail.setEnabled(false);
		f.add(ch_latPull_Fail);

		b_latPull.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				ex.back(1,"");
				ExFrame ef=new ExFrame();
				ef.close();

				if(ef.result()) {
					System.out.println("성공 체크박스 설정");
					
					ch_latPull_Success.setState(true);
				}
				else {
					System.out.println("실패 체크박스 설정");
					
					ch_latPull_Fail.setState(true);
				}
				ch_latPull_Success.setEnabled(false);
				ch_latPull_Fail.setEnabled(false);
				f.setVisible(true);	
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_pullUp=new ImageIcon("img_back/pullup.jpg");
		JButton b_pullUp=new JButton(img_pullUp);
		b_pullUp.setBounds(380,100,250,150);
		f.add(b_pullUp);

		Checkbox ch_pullUp_Success=new Checkbox("성공");
		ch_pullUp_Success.setBounds(450, 260, 50, 30);
		f.add(ch_pullUp_Success);

		Checkbox ch_pullUp_Fail=new Checkbox("실패");
		ch_pullUp_Fail.setBounds(520, 260, 50, 30);
		f.add(ch_pullUp_Fail);

		b_pullUp.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ex.back(2, null);
				f.dispose();
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_high=new ImageIcon("img_back/OneArmHighLow.jpg");
		JButton b_highLow=new JButton(img_high);
		b_highLow.setBounds(680,100,250,150);
		f.add(b_highLow);

		Checkbox ch_highLow_Success=new Checkbox("성공");
		ch_highLow_Success.setBounds(750, 260, 50, 30);
		f.add(ch_highLow_Success);

		Checkbox ch_highLow_Fail=new Checkbox("실패");
		ch_highLow_Fail.setBounds(820, 260, 50, 30);
		f.add(ch_highLow_Fail);

		b_highLow.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ex.back(3, null);
				f.dispose();
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_seated=new ImageIcon("img_back/seatedLow.jpg");
		JButton b_seatedRow=new JButton(img_seated);
		b_seatedRow.setBounds(80,350,250,150);
		f.add(b_seatedRow);

		Checkbox ch_seatedRow_Success=new Checkbox("성공");
		ch_seatedRow_Success.setBounds(150, 510, 50, 30);
		f.add(ch_seatedRow_Success);

		Checkbox ch_seatedRow_Fail=new Checkbox("실패");
		ch_seatedRow_Fail.setBounds(220, 510, 50, 30);
		f.add(ch_seatedRow_Fail);

		b_seatedRow.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ex.back(4, null);
				f.dispose();
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_rack=new ImageIcon("img_back/Rackpull.jpg");
		JButton b_Rackpull=new JButton(img_rack);
		b_Rackpull.setBounds(380,350,250,150);
		f.add(b_Rackpull);

		Checkbox ch_Rackpull_Success=new Checkbox("성공");
		ch_Rackpull_Success.setBounds(450, 510, 50, 30);
		f.add(ch_Rackpull_Success);

		Checkbox ch_Rackpull_Fail=new Checkbox("실패");
		ch_Rackpull_Fail.setBounds(520, 510, 50, 30);
		f.add(ch_Rackpull_Fail);

		b_Rackpull.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ex.back(5, null);
				f.dispose();
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		////////////////////////////////////////////////

		ImageIcon img_bar=new ImageIcon("img_back/BarbellLow.jpg");
		JButton b_barbellRow=new JButton(img_bar);
		b_barbellRow.setBounds(680,350,250,150);
		f.add(b_barbellRow);

		Checkbox ch_barbellRow_Success=new Checkbox("성공");
		ch_barbellRow_Success.setBounds(750, 510, 50, 30);
		f.add(ch_barbellRow_Success);

		Checkbox ch_barbellRow_Fail=new Checkbox("실패");
		ch_barbellRow_Fail.setBounds(820, 510, 50, 30);
		f.add(ch_barbellRow_Fail);

		b_barbellRow.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ex.back(6, null);
				f.dispose();
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
