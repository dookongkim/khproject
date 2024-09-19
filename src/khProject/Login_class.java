package khProject;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Login_class {

	public Login_class() {
		Frame f=new Frame();
		f.setLayout(null);
		f.setBounds(400, 200, 1000, 600);

		JLabel mainName=new JLabel("<운동관리 도우미>");
		Font font=new Font("",Font.BOLD,40);
		mainName.setFont(font);

		//mainName.setBackground(Color.white);
		//mainName.setForeground(Color.black);
		mainName.setBounds(330, 100, 350, 60);
		mainName.setOpaque(false);
		f.add(mainName);


		//아이디 입력 텍스트필드
		TextField tf_id=new TextField(20);
		tf_id.setBackground(Color.WHITE);
		tf_id.setBounds(410,460,180,30);

		//비밀번호 입력 텍스트필드
		TextField tf_password=new TextField();
		tf_password.setBackground(Color.WHITE);
		tf_password.setBounds(410,520,180,30);

		f.add(tf_id);
		f.add(tf_password);
		
		

		//로그인 버튼
		JButton login=new JButton("로그인");
		login.setBounds(600, 440, 90, 40);
		f.add(login);
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});


		//회원가입 버튼
		JButton register=new JButton("회원가입");
		register.setBounds(600, 480, 90, 40);
		f.add(register);
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Register_class r=new Register_class();
				r.Regist();

			}
		});


		// 아이디,비밀번호,회원가입 입력창
		ImageIcon info=new ImageIcon("images/yourinfo.jpg");
		JLabel yourinfo=new JLabel(info);
		yourinfo.setBounds(400, 440, 200, 120);
		f.add(yourinfo);   


		//배경화면
		ImageIcon img_background=new ImageIcon("images/background1.jpg");
		JLabel img_back_label=new JLabel(img_background);
		img_back_label.setBounds(0, 0, 1000, 600);
		f.add(img_back_label);


		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);


	}



}






