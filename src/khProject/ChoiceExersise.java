package khProject;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ChoiceExersise   {

	public ChoiceExersise() {

		Frame f=new Frame("hi");
		f.setLayout(null);
		f.setBounds(400, 200, 1000, 600);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Font font=new Font("",Font.BOLD,25);
		Label label=new Label("Choice Exercise!!");
		label.setBounds(100, 50, 250, 30);
		label.setFont(font);

		//Label label_chest=new Label("chest");
		//label_chest.setBounds(250, 85, 100, 10);
		//Label label_back=new Label("back");
		//Label label_arm=new Label("arm");
		//Label label_leg=new Label("leg");

		ImageIcon img_test=new ImageIcon("images/chest.jpg");
		JButton btn_chest=new JButton(img_test);
		btn_chest.setBounds(100, 100, 400, 200);
		btn_chest.setBorderPainted(false);
		btn_chest.setContentAreaFilled(false);

		btn_chest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Suggest_Chest();
				f.dispose();
			}
		});

		ImageIcon img_back=new ImageIcon("images/back.jpg");
		JButton btn_back=new JButton(img_back);
		btn_back.setBounds(510, 100, 400, 200);
		btn_back.setBorderPainted(false);
		btn_back.setContentAreaFilled(false);

		btn_back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Suggest_Backwork();
				f.dispose();
			}
		});


		ImageIcon img_arm=new ImageIcon("images/arm.jpg");
		JButton btn_arm=new JButton(img_arm);
		btn_arm.setBounds(100, 310, 400, 200);
		btn_arm.setBorderPainted(false);
		btn_arm.setContentAreaFilled(false);

		btn_arm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Suggest_Arm();
				f.dispose();
			}
		});

		ImageIcon img_leg=new ImageIcon("images/leg.jpg");
		JButton btn_leg=new JButton(img_leg);
		btn_leg.setBounds(510, 310, 400, 200);
		btn_leg.setBorderPainted(false);
		btn_leg.setContentAreaFilled(false);

		btn_leg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Suggest_Leg();
				f.dispose();
			}
		});

		//f.add(label_chest);
		f.add(label);
		f.add(btn_chest);
		f.add(btn_back);
		f.add(btn_arm);
		f.add(btn_leg);

		f.setVisible(true);


	}
}
