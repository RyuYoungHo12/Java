package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.util.ArrayList;
import javax.swing.JRadioButton;
public class ComponentsTest {

	private JFrame frame;
	private JTextField textUid;
	private JTextField textName;
	private JTextField textHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setBounds(12, 10, 120, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn2 = new JButton("확인2\r\n");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn2.setBounds(172, 64, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("확인1\r\n");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 64, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭... ","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				}else {System.out.println("NO 클릭...");
					
				}
			}
		});
		btn3.setBounds(307, 64, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("TextFeild");
		lblNewLabel_1.setBounds(12, 110, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(12, 163, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("휴대폰");
		lblNewLabel_2_1.setBounds(12, 194, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textUid = new JTextField();
		textUid.setBounds(81, 132, 116, 21);
		frame.getContentPane().add(textUid);
		textUid.setColumns(10);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(81, 160, 116, 21);
		frame.getContentPane().add(textName);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(81, 191, 116, 21);
		frame.getContentPane().add(textHp);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(318, 135, 104, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(318, 163, 86, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(318, 194, 104, 15);
		frame.getContentPane().add(lbHp);

		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 135, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = textUid.getText();
				lbUid.setText("결과 : " + uid);
				
			}
		});
		
		
		btnUid.setBounds(209, 132, 97, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textName.getText();
				lbName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(209, 159, 97, 23);
		frame.getContentPane().add(btnName);
		
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = textHp.getText();
				lbHp.setText("결과 : " + hp);
				
			}
		});
		btnHp.setBounds(209, 190, 97, 23);
		frame.getContentPane().add(btnHp);
		
				
		JLabel lblNewLabel_5 = new JLabel("버튼 실습");
		lblNewLabel_5.setBounds(22, 44, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 242, 49, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("참외");
		chk2.setBounds(80, 242, 49, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("딸기");
		chk3.setBounds(148, 242, 49, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("포도");
		chk4.setBounds(209, 242, 49, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("수박");
		chk5.setBounds(276, 242, 49, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한과일 : ");
		lbChkFruit.setBounds(12, 279, 144, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkfruit = new JButton("확인");
		btnChkfruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				
				lbChkFruit.setText("선택한 과일 : " + fruits);
				
			}
		});
		btnChkfruit.setBounds(347, 242, 57, 23);
		frame.getContentPane().add(btnChkfruit);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("CheckBox 실습");
		lblNewLabel_6.setBounds(12, 219, 97, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 실습");
		lblNewLabel_4.setBounds(12, 301, 120, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 322, 57, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(81, 322, 64, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("선택결과 : ");
		lbGender.setBounds(12, 351, 257, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText());
				}else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				
			}
		});
		
		btnGender.setBounds(148, 322, 78, 23);
		frame.getContentPane().add(btnGender);
		
	}
}
