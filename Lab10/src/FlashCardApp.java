import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class FlashCardApp {

	private int button = 0;
	private JFrame frame;
	public static FlashCard cards = new FlashCard();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int i = -1;
		String line = "";
		try {
			FileInputStream fis = new FileInputStream("questions");
			Scanner fin = new Scanner(fis);
			while (fin.hasNext()) {
				line = fin.nextLine();
				if (line.startsWith("Q")||line.startsWith("A")) {
					cards.addCard(line);
					++i;
				} else if (line.startsWith("  ")) {
					cards.addToCard(i, ("\n  "+(line)));
				}
			}
			
		} catch (FileNotFoundException fne) {
			
					}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlashCardApp window = new FlashCardApp();
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
	public FlashCardApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("DJ's Flash Card App");
		frame.setBounds(100, 100, 492, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(5);
		textArea.setColumns(40);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		JButton btnGetAnswer = new JButton("Start Flashcards");
		btnGetAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					textArea.setText(cards.getCard(button));
					if(button == (cards.cardSize()-1)) {
						btnGetAnswer.setText("Start over");
						button = -1;
					} else if(button%2==0) {
						btnGetAnswer.setText("Get Answer");
					} else if (button%2==1) {
						btnGetAnswer.setText("Next Question");
					}
					++button;
					
				} catch(Exception e1) {
					textArea.setText(e1.getMessage());
				}
				
			}
		});
		frame.getContentPane().add(btnGetAnswer);
		
	}

}
