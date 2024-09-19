package khProject;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Register_class {
	private String id;
	private String pw;
	private String name;
	private String level; // 초급,중급,상급,엘리트 저장
	private String gender;
	private int height;
	private int weight;
	private int muscle;
	private int fat;
	private int level1=0;
	private int level2=0;
	private int n;

	public void Regist() {

		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(400, 200, 1000, 600);// 프레임

		// ImageIcon bc = new ImageIcon("images/b_b.jpg");
		JLabel ibc = new JLabel();
		ibc.setBounds(0, 0, 1000, 600);

		//Font font = new Font("", Font.BOLD, 30);
		Panel pn_gender = new Panel();
		pn_gender.setBounds(100, 100, 200, 40);
		pn_gender.setBackground(Color.GRAY);

		Label lb_grnder = new Label("성별");
		lb_grnder.setBounds(10, 10, 100, 50);




		CheckboxGroup Gender = new CheckboxGroup();
		Checkbox g_male = new Checkbox("남자", Gender, true);
		Checkbox g_female = new Checkbox("여자", Gender, false);
		//String G = "";


		g_male.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "male";
			}
		});

		g_female.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "female";
			}
		});

		Panel pn_level = new Panel();
		pn_level.setBounds(100, 150, 400, 40);
		pn_level.setBackground(Color.GRAY);

		Label lb_level = new Label("난이도");
		lb_level.setBounds(100, 150, 420, 45);


		CheckboxGroup l = new CheckboxGroup();
		Checkbox lt = new Checkbox("입문자", l, false);
		lt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				level1=1;
			}
		});
		Checkbox lb = new Checkbox("초보자", l, false);
		lt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				level1=2;
			}
		});
		Checkbox ln = new Checkbox("중급자", l, false);
		lt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				level1=3;
			}
		});
		Checkbox ls = new Checkbox("상급자", l, false);
		lt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				level1=4;
			}
		});
		Checkbox le = new Checkbox("엘리트", l, false);
		lt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				level1=5;
			}
		});



		JPanel pn_inbody = new JPanel();
		pn_inbody.setBounds(100, 200, 200, 125);
		pn_inbody.setBackground(Color.GRAY);
		pn_inbody.setLayout(null);

		Label lb_inbody = new Label("인바디");
		lb_inbody.setBounds(10, 10, 60, 20);

		Label lb_muscle = new Label("골격근량");
		lb_muscle.setBounds(10, 70, 60, 20);
		TextField tf_muscle = new TextField(15);
		tf_muscle.setBounds(80, 70, 100, 20);

		Label lb_fat = new Label("지방량");
		lb_fat.setBounds(10, 100, 60, 20);
		TextField tf_fat = new TextField(15);
		tf_fat.setBounds(80, 100, 100, 20);

		Checkbox ei = new Checkbox("인바디 경험이 있다면");
		ei.setBounds(10, 40, 150, 20);
		ei.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				boolean IS = ei.getState();
				tf_muscle.setEnabled(IS);
				tf_fat.setEnabled(IS);

			}
		});

		Panel pn_idpw = new Panel();
		pn_idpw.setBounds(100, 350, 200, 70);
		pn_idpw.setBackground(Color.GRAY);
		Label lb_id = new Label("이름");
		TextField tf_id = new TextField(15);
		Label lb_pw = new Label("비번");
		TextField tf_pw = new TextField(15);

		pn_gender.add(lb_grnder);
		pn_gender.add(g_male);
		pn_gender.add(g_female);

		pn_level.add(lb_level);
		pn_level.add(lt);
		pn_level.add(lb);
		pn_level.add(ln);
		pn_level.add(ls);
		pn_level.add(le);

		pn_inbody.add(lb_inbody);
		pn_inbody.add(ei);
		pn_inbody.add(lb_muscle);
		pn_inbody.add(tf_muscle);
		pn_inbody.add(lb_fat);
		pn_inbody.add(tf_fat);

		pn_idpw.add(lb_id);
		pn_idpw.add(tf_id);
		pn_idpw.add(lb_pw);
		pn_idpw.add(tf_pw);

		f.add(pn_gender);
		f.add(pn_level);
		f.add(pn_inbody);
		f.add(pn_idpw);

		f.add(ibc);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			};
		});

		//정보 입력후 확인 버튼
		JButton btn_check=new JButton("확인");
		btn_check.setBounds(100, 450, 60, 40);
		f.add(btn_check);
		User user=new User();

		//if(gender.equals("남자"))
		//	user.setGender("남자");
		//else
		//	user.setGender("여자");

		btn_check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int fat=Integer.parseInt(tf_fat.getText());
				int muscle=Integer.parseInt(tf_muscle.getText());

				if ( muscle <= 30 || fat >= 30 ) 
					level2=1;
				else if ( muscle <= 35 || fat >= 25) 
					level2=2;
				else if ( muscle <= 40 && fat >= 20) 
					level2=3;
				else if (muscle <= 45 || fat >= 15) 
					level2=4;
				else if (muscle >= 46 && fat < 15) 
					level2=5;

				if(level1<=level2) 
					n=level2;
				else
					n=level1;
				switch(n) {
				case 1:
					user.setArm_level("입문자");
					user.setLeg_level("입문자");
					user.setChest_level("입문자");
					user.setBack_level("입문자");
					break;
				case 2:
					user.setArm_level("초보자");
					user.setLeg_level("초보자");
					user.setChest_level("초보자");
					user.setBack_level("초보자");
					break;
				case 3:
					user.setArm_level("중급자");
					user.setLeg_level("중급자");
					user.setChest_level("중급자");
					user.setBack_level("중급자");
					break;
				case 4:
					user.setArm_level("상급자");
					user.setLeg_level("상급자");
					user.setChest_level("상급자");
					user.setBack_level("상급자");
					break;
				case 5:
					user.setArm_level("엘리트");
					user.setLeg_level("엘리트");
					user.setChest_level("엘리트");
					user.setBack_level("엘리트");
					break;
				}

				user.setId(tf_id.getText());
				user.setPw(tf_pw.getText());

				InfoWriter iw=new InfoWriter();

				iw.infoWrite(user);

				f.dispose();
				new ChoiceExersise(); //다음 운동부위 선택화면으로 이동;
			}//action리스너
		});


		f.setVisible(true);



	}
}