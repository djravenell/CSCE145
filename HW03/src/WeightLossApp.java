import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WeightLossApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private static double BMI(double kgWeight, double cmHeight) {
		double bmi = kgWeight/Math.pow(cmHeight/100,2);
		return bmi;
	}
	
	private static double BMR(double weight,double height,int age,boolean male) {
		if(male) {
			return 66.5+13.75*weight+5.003*height-6.75*age;
		}
		else {
			return 655.1+9.563*weight+1.850*height-4.676*age;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightLossApp window = new WeightLossApp();
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
	public WeightLossApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Name:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Weight:");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Height:");
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Age:");
		panel_3.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Use Pounds/Inches");
		panel_4.add(tglbtnNewToggleButton);
		
		JPanel panel_5 = new JPanel();
		frame.getContentPane().add(panel_5);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Do Recommendations");
		panel_5.add(tglbtnNewToggleButton_1);
		
		JPanel panel_6 = new JPanel();
		frame.getContentPane().add(panel_6);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Male?");
		panel_6.add(tglbtnNewToggleButton_2);
		
		JPanel panel_7 = new JPanel();
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		frame.getContentPane().add(panel_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(15);
		textArea.setColumns(40);
		textArea.setEditable(false);
		panel_8.add(textArea);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double weight = Double.parseDouble(textField_1.getText());
					double height = Double.parseDouble(textField_2.getText());
					if (tglbtnNewToggleButton.isSelected()) {
						weight = weight/2.2;
						height = height * 2.54;
					}
					int age = Integer.parseInt(textField_3.getText());
					double bmi = WeightLossApp.BMI(weight, height);
					double bmr = WeightLossApp.BMR(weight, height, age, tglbtnNewToggleButton_2.isSelected());
					
					double dailyCaloricIntake = bmr;
					
					String words = "";
					words += "Name: "+ textField.getText();
					words += "\nBMI: "+ bmi;
					words += "\nBMR: "+ bmr;
					
					if (tglbtnNewToggleButton_1.isSelected()) {
						words += "\nFor different activity levels, calorie intake to maintain weight:";
						for (int i = 1; i < 6; ++i) {
							switch(i) {
								case 1:
									words += "\n" + i + ": " + dailyCaloricIntake*1.2 + " calories";
									break;
									
								case 2:
									words += "\n" + i + ": " + dailyCaloricIntake*1.375 + " calories";
									break;
									
								case 3:
									words += "\n" + i + ": " + dailyCaloricIntake*1.55 + " calories";
									break;
									
								case 4:
									words += "\n" + i + ": " + dailyCaloricIntake*1.725 + " calories";
									break;
									
								case 5:
									words += "\n" + i + ": " + dailyCaloricIntake*1.9 + " calories";
									break;
							}
						}
						words += "\nEat 500 calories less a day to lose 1 pound (~0.5kg) per week";
						words += "\nEat 1000 calories less a day to lose 2 pounds (~0.9kg) per week";
					}
					
					textArea.setText(words);
				} catch (Exception e1) {
					textArea.setText("ERROR: The input Weight, Height, and Age should all be positive numbers");
				}
			}
		});
		panel_7.add(btnNewButton);
		
		
	}

}
