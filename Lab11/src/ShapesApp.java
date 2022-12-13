import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShapesApp {

	private JFrame frmShapesApp;
	private ArrayList<Shape> shapes;
	private JTextArea textAreaOut;
	private ButtonGroup bgShape = new ButtonGroup();
	private JRadioButton[] rdbuttons = new JRadioButton[6];
	private JTextField textFieldWidth;
	private JTextField textFieldHeight;
	private JTextField textFieldRed;
	private JTextField textFieldGreen;
	private JTextField textFieldBlue;
	JButton btnClrSample;
	DrawJPanel drawJPanel;
	private JTextField textFieldSides;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapesApp window = new ShapesApp();
					window.frmShapesApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShapesApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShapesApp = new JFrame();
		frmShapesApp.setTitle("Shapes App");
		frmShapesApp.setBounds(100, 100, 684, 586);
		frmShapesApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		shapes = new ArrayList<Shape>();
		frmShapesApp.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_1 = new JPanel();
		frmShapesApp.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Width/Radius:");
		panel_1.add(lblNewLabel);
		
		textFieldWidth = new JTextField();
		textFieldWidth.setText("20");
		panel_1.add(textFieldWidth);
		textFieldWidth.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		panel_1.add(lblNewLabel_1);
		
		textFieldHeight = new JTextField();
		textFieldHeight.setText("10");
		panel_1.add(textFieldHeight);
		textFieldHeight.setColumns(10);
		
		JPanel panel = new JPanel();
		frmShapesApp.getContentPane().add(panel);
		
		JRadioButton rdbtnSquare = new JRadioButton("Square");
		rdbtnSquare.setSelected(true);
		panel.add(rdbtnSquare);
		
		JRadioButton rdbtnRectangle = new JRadioButton("Rectangle");
		panel.add(rdbtnRectangle);
		
		JRadioButton rdbtnCircle = new JRadioButton("Circle");
		panel.add(rdbtnCircle);
		
		JRadioButton rdbtnOval = new JRadioButton("Oval");
		panel.add(rdbtnOval);
		
		JRadioButton rdbtnStar = new JRadioButton("Star");
		panel.add(rdbtnStar);
		
		JRadioButton rdbtnPolygon = new JRadioButton("Polygon");
		panel.add(rdbtnPolygon);
		
		bgShape.add(rdbtnStar);
		bgShape.add(rdbtnRectangle);
		bgShape.add(rdbtnCircle);
		bgShape.add(rdbtnSquare);
		bgShape.add(rdbtnPolygon);
		bgShape.add(rdbtnOval);
		
		rdbuttons[0]=rdbtnStar;
		rdbuttons[1]=rdbtnRectangle;
		rdbuttons[2]=rdbtnCircle;
		rdbuttons[3]=rdbtnOval;
		rdbuttons[4]=rdbtnSquare;
		rdbuttons[5]=rdbtnPolygon;
		
		JLabel lblNewLabel_3 = new JLabel("# sides?");
		panel.add(lblNewLabel_3);
		
		textFieldSides = new JTextField();
		textFieldSides.setText("3");
		panel.add(textFieldSides);
		textFieldSides.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		frmShapesApp.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Color");
		panel_2.add(lblNewLabel_2);
		
		textFieldRed = new JTextField();
		textFieldRed.setBackground(Color.RED);
		textFieldRed.setText("0");
		textFieldRed.setForeground(Color.WHITE);
		panel_2.add(textFieldRed);
		textFieldRed.setColumns(4);
		
		textFieldGreen = new JTextField();
		textFieldGreen.setBackground(Color.GREEN);
		textFieldGreen.setText("0");
		panel_2.add(textFieldGreen);
		textFieldGreen.setColumns(4);
		
		textFieldBlue = new JTextField();
		textFieldBlue.setForeground(Color.WHITE);
		textFieldBlue.setBackground(Color.BLUE);
		textFieldBlue.setText("0");
		panel_2.add(textFieldBlue);
		textFieldBlue.setColumns(4);
		
		btnClrSample = new JButton("  ");
		btnClrSample.setBackground(new Color(0,0,0));
		panel_2.add(btnClrSample);
		
		textFieldRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colorChangedOrError();
			}
		});
		
		textFieldGreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colorChangedOrError();
			}
		});
		
		textFieldBlue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colorChangedOrError();
			}
		});
		
		JPanel panel_3 = new JPanel();
		frmShapesApp.getContentPane().add(panel_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("shapes.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(shapes);
					
					oos.close();
				}catch(IOException ioe){
					textAreaOut.setText(ioe.getMessage());
				}
			}
		});
		panel_3.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		panel_3.add(btnLoad);
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					FileInputStream fis = new FileInputStream("shapes.txt");
					ObjectInputStream ois = new ObjectInputStream(fis);
					shapes.clear();
					shapes.addAll( (ArrayList<Shape>) ois.readObject());
					drawJPanel.repaint();
					ois.close();
				}catch(IOException ioe){
					textAreaOut.setText(ioe.getMessage());
				} catch(Exception e1){
					textAreaOut.setText(e1.getMessage());;
				}
			}
		});
		
		
		
		
		drawJPanel = new DrawJPanel(shapes); 
		drawJPanel.setBackground(Color.WHITE);
		drawJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		drawJPanel.setPreferredSize(new Dimension(500,300));
		frmShapesApp.getContentPane().add(drawJPanel);
		
		textAreaOut = new JTextArea();
		textAreaOut.setEditable(false);
		textAreaOut.setRows(5);
		textAreaOut.setColumns(40);
		frmShapesApp.getContentPane().add(textAreaOut);
		
		drawJPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				System.out.println("Pressed!");

				int x = me.getX();
				int y = me.getY();
				
				try {
					int w = Integer.parseInt(textFieldWidth.getText());
					int ht = Integer.parseInt(textFieldHeight.getText());
					int n = Integer.parseInt(textFieldSides.getText());
					Shape s = null;
					Color c = btnClrSample.getBackground();
					if(rdbtnCircle.isSelected()) {
						s= new Circle(x,y,w);
					} else if (rdbtnOval.isSelected()) {
						s= new Oval(x,y,w,ht);
					} else if (rdbtnRectangle.isSelected()) {
						s= new Rectangle(x,y,w,ht);
					} else if( rdbtnSquare.isSelected()) {
						s= new Square(x,y,w);
					} else if (rdbtnStar.isSelected()) {
						s = new Star5(x,y,w);
					} else if (rdbtnPolygon.isSelected()) {
						s = new Polygon(x,y,w,n);
					}
					s.setColor(c);
					shapes.add(s);
				} catch (NumberFormatException nfe) {
					textAreaOut.setText("Width and Height should be numbers!");
				}
				
				drawJPanel.repaint();
			}
		});
		
	}
	
	private void colorChangedOrError(){
		try {
			int r,g,b;
			r = Integer.parseInt(textFieldRed.getText());
			g = Integer.parseInt(textFieldGreen.getText());
			b = Integer.parseInt(textFieldBlue.getText());
			
			if(r<0||g<0||b<0) throw new NumberFormatException();
			if(r>255||g>255||b>255) throw new NumberFormatException();
			
			btnClrSample.setBackground(new Color(r,g,b));
			
		} catch (NumberFormatException nfe) {
			textAreaOut.setText("Colors must be integers 0-255");
			textFieldRed.setText("0");
			textFieldGreen.setText("0");
			textFieldBlue.setText("0");
			btnClrSample.setBackground(new Color(0,0,0));
			
		}
	}

}
