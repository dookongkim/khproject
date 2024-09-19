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

public class Suggest_Chest {
	public Suggest_Chest() {

		Frame f=new Frame();

		f.setLayout(null);

		f.setBounds(400, 200, 1000, 600);
		
		Font font_l=new Font("",Font.BOLD,30);
		Label l=new Label("Chest Exercise");
		l.setFont(font_l);
		l.setBounds(390, 50, 300,35);
		f.add(l);
		

		ImageIcon img_Bench=new ImageIcon("img_chest/benchpress.jpg");
		JButton b_Bench=new JButton(img_Bench);
		b_Bench.setBounds(80,100,250,150);
		f.add(b_Bench);
		
		Checkbox ch_Bench_Success=new Checkbox("성공");
		ch_Bench_Success.setBounds(150, 260, 50, 30);
		f.add(ch_Bench_Success);

		Checkbox ch_Bench_Fail=new Checkbox("실패");
		ch_Bench_Fail.setBounds(220, 260, 50, 30);
		f.add(ch_Bench_Fail);

		b_Bench.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_InclineBench=new ImageIcon("img_chest/inclinebench.jpg");
		JButton b_InclineBench=new JButton(img_InclineBench);
		b_InclineBench.setBounds(380,100,250,150);
		f.add(b_InclineBench);
		
		Checkbox ch_InclineBench_Success=new Checkbox("성공");
		ch_InclineBench_Success.setBounds(450, 260, 50, 30);
		f.add(ch_InclineBench_Success);
		
		Checkbox ch_InclineBench_Fail=new Checkbox("실패");
		ch_InclineBench_Fail.setBounds(520, 260, 50, 30);
		f.add(ch_InclineBench_Fail);
		
		b_InclineBench.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});

		////////////////////////////////////////////////

		ImageIcon img_ChestPress=new ImageIcon("img_chest/chestpress.jpg");
		JButton b_ChestPress=new JButton(img_ChestPress);
		b_ChestPress.setBounds(680,100,250,150);
		f.add(b_ChestPress);
		
		Checkbox ch_ChestPress_Success=new Checkbox("성공");
		ch_ChestPress_Success.setBounds(750, 260, 50, 30);
		f.add(ch_ChestPress_Success);
		
		Checkbox ch_ChestPress_Fail=new Checkbox("실패");
		ch_ChestPress_Fail.setBounds(820, 260, 50, 30);
		f.add(ch_ChestPress_Fail);
		
		b_ChestPress.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_InclineMach=new ImageIcon("img_chest/inclinechestpress.jpg");
		JButton b_InclineMach=new JButton(img_InclineMach);
		b_InclineMach.setBounds(80,350,250,150);
		f.add(b_InclineMach);
		
		Checkbox ch_InclineMach_Success=new Checkbox("성공");
		ch_InclineMach_Success.setBounds(150, 510, 50, 30);
		f.add(ch_InclineMach_Success);
		
		Checkbox ch_InclineMach_Fail=new Checkbox("실패");
		ch_InclineMach_Fail.setBounds(220, 510, 50, 30);
		f.add(ch_InclineMach_Fail);
		
		b_InclineMach.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		
		////////////////////////////////////////////////

		ImageIcon img_Dips=new ImageIcon("img_chest/dips.jpg");
		JButton b_Dips=new JButton(img_Dips);
		b_Dips.setBounds(380,350,250,150);
		f.add(b_Dips);
		
		Checkbox ch_Dips_Success=new Checkbox("성공");
		ch_Dips_Success.setBounds(450, 510, 50, 30);
		f.add(ch_Dips_Success);
		
		Checkbox ch_Dips_Fail=new Checkbox("실패");
		ch_Dips_Fail.setBounds(520, 510, 50, 30);
		f.add(ch_Dips_Fail);
		
		b_Dips.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// 운동 상세설명 창 뜬 후 , 성공 or 실패 버튼 누르고
				// exit 된 후 success/fail 체크박스 체크 
			}
		});
		////////////////////////////////////////////////

		ImageIcon img_Fly=new ImageIcon("img_chest/fly.jpg");
		JButton b_Fly=new JButton(img_Fly);
		b_Fly.setBounds(680,350,250,150);
		f.add(b_Fly);
		
		Checkbox ch_Fly_Success=new Checkbox("성공");
		ch_Fly_Success.setBounds(750, 510, 50, 30);
		f.add(ch_Fly_Success);
		
		Checkbox ch_Fly_Fail=new Checkbox("실패");
		ch_Fly_Fail.setBounds(820, 510, 50, 30);
		f.add(ch_Fly_Fail);
		
		b_Fly.addActionListener(new ActionListener() {	
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




