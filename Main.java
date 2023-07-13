package test;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import javax.sound.sampled.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
//import calculator.Calculator;

import java.util.HashMap;
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Main {


	public static void main(String[] args) throws FileNotFoundException{
	
				
        new Calculator();

		
		
		

	}
	
}


/*

===PRINT I NUMRAVE PRIME===

MAIN: 

System.out.println("Vendosni nr max: ");
		Scanner in = new Scanner(System.in);
		int rowPrinter = 0;
		int max = in.nextInt();
		check ch = new check();
			
			for(int i=2; i<max; i++) {
				
				if(ch.prime(i) == true) {
					System.out.print(i + " ");
					rowPrinter++;
				if(rowPrinter%2==0) {
					System.out.println();
				}
				}
			}
			
check class:

public class check {

	
	static boolean prime(int n) {
		
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) return false;
		}
		return true;

	}
}




===PIRAMIDA BOSH===


Scanner in = new Scanner(System.in);
 		System.out.println("Vendosni numirn e rreshtave: ");
 		
 		int row =  in.nextInt();
 		int i, j, x, z, r, a, b;
 		
 		for(x = 0; x < row+1; x++) {
 			System.out.print(" ");
 		}
 		System.out.println("*");
 		
 		for(r = 0; r<row; r++) {
 			
 			for(i = 0; i < row - r; i++) {
 				System.out.print(" ");
 			}
 			for(j = 0; j < 1; j++) {
 				System.out.print("*");
 			}
 			for(a = 0; a < r*2+1; a++) {
 				System.out.print(" ");
 			}
 			for(b = 0; b < 1; b++) {
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		for(z = 0; z < row*2+3; z++) {
 			System.out.print("*");
 		}
 		

===PIRAMIDA ME NUMRA===

Scanner in = new Scanner(System.in);
 		System.out.println("Vendosni numirn e rreshtave: ");
 		
 		int row =  in.nextInt();
 		int i, j, z, count = 0;
 		
 		for(i = 0; i<row; i++){
 			System.out.println();
 			count++;
 			
 			for(j = 0; j<row-count; j++){
 				System.out.print(1);
 			}
 			for(z = 0; z<count; z++) {
 				System.out.print(count);
 			}
 		}
 		
 		in.close();
	}



===INNER CLASSES===

MAIN-----------------------

Outside outside = new Outside();
		Outside.Inside inside = outside.new Inside();
		
		inside.greet();
	}

OTHER CLASS----------------

public class Outside {

	String o = "Out";
	
	public class Inside{
		
		String i = "In";
		
		public void greet() {
			System.out.println(o + i);

		}
	}
}




===CUSTOM EXCEPTIONS===

MAIN-----
Scanner in = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age  = in.nextInt();
		
		
		try {
		checkAge(age);
		}
		catch(Exception e ) {
			System.out.println("error: "+ e);
		}
	
	}
	
	static void checkAge(int age)throws AgeException {
	
		if(age<18) {
			throw new AgeException("\n"+"Insufficent age!");
		}else {
			System.out.println("Signed Up!");
		}
	}
	
CLASS-----

AgeException(String message){

		super(message);
		
		
		
	}
	

===HASHMAPS===


HashMap<String, String> countries = new HashMap<String, String>();
		
		// key and value
		
		countries.put("Albania", "Tirana");
		countries.put("Germany", "Berlin");
		countries.put("Spain", "Madrid");
		countries.put("France", "Paris");
		 
		//System.out.println(countries);
			
		//countries.remove("Spain");
		//System.out.println(countries.get("France"));
		//countries.clear();
		//System.out.println(countries.size());
		//countries.replace("Albania", "Kruja");
		//System.out.println(countries.containsKey("France"));
		//System.out.println(countries.containsValue("Lyon"));
		
		for(String i : countries.keySet()) {
			System.out.print(i+"	= ");
			System.out.println(countries.get(i));
		}
		
		
===ENUMS===

enum Planets{
	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	int number;
	
	Planets(int number){
		
		this.number = number;
		
	}
}

public class Main {

	public static void main(String[] args){
		
		
		Planets myPlanet = Planets.EARTH;
		
		liveable(myPlanet);
		
	}
	static void	liveable(Planets myPlanet) {
		switch(myPlanet) {
			case EARTH: System.out.println("YOU LIVE HERE");
						System.out.println("Planet number #"+ myPlanet.number);
			break;
			default:System.out.println("YOU DIE HERE");
					System.out.println("Planet number #"+ myPlanet.number);
			break;
		}



===METHOD CHANING===


String name = "     stiven";
	
		//name = name.concat(" qehaja     ");
		//name = name.toUpperCase();
		//name = name.trim();
		
		name = name.concat(" qehaja    ").toUpperCase().trim();
		System.out.println(name);


===OPTION PANE===

JOptionPane.showMessageDialog(null, "This is a PLAIN box", "Box Title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is an INFORMATION box", "Box Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a QUESTION box", "Box Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a WARNING box", "Box Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is an ERORR box", "Box Title", JOptionPane.ERROR_MESSAGE);
		
		
		int answer = JOptionPane.showConfirmDialog(null, "Continue ?", "BoxTitle", JOptionPane.YES_NO_CANCEL_OPTION);
				// yes= 0 ; no = 1 ; cancel = 2 ; X = -1

		String name = JOptionPane.showInputDialog("Whats ur name?");

		String[] response = {"LEFT", "MIDDLE", "MIDDLE BUT RIGHT", "RIGHT"};
		ImageIcon icon =  new ImageIcon("iconTrey.png");
		JOptionPane.showOptionDialog(
				null,
				"TEXTI",
				"TITULLI",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				response,
				0);
				


===OPENNING OTHER WINDOWS

Dritare Class: 

JFrame frame = new JFrame();
	JButton button = new JButton("Click to open new Window.");
	
	Dritare(){
		
		
		button.setBounds(300, 200, 200, 50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.add(button);
		
	

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == button) {
			
			frame.dispose();
			Next next = new Next();
		}
		
	}
	
	Next Class: 
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	
	Next(){
		
		label.setBounds(170, 170, 400, 150);
		label.setFont(new Font("Calibri", Font.PLAIN, 25));
		label.setText("HELLO THERE THIS IS A STRING");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
	}
===LAYERED PANES===

		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.blue);
		label1.setBounds(50, 50, 100, 100);
		
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100, 100, 100, 100);
		
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.red);
		label3.setBounds(150, 150, 100, 100);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 250, 250);
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(1));
		layeredPane.add(label3, Integer.valueOf(2));
		
		
		JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("treyarch.png");  //create image icon
		frame.setSize(500, 500);  //dimension
		frame.setLayout(null);
		frame.setTitle("Nice Window");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);  //prevent window form being resized
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		frame.setLocationRelativeTo(null);//centered locatioN
		
		frame.add(layeredPane);
		
		

===GRID LAYOUT BUTTON MANAGER===

		JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("treyarch.png");  //create image icon

		frame.setSize(500, 500);  //dimension
		frame.setLayout(null);
		frame.setTitle("Nice Window");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);  //prevent window form being resized
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		frame.setLocationRelativeTo(null);//centered locatioN
		
		frame.setLayout(new GridLayout(3, 3, 10, 10));
		
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);  //make frame visible
		
		

===PANEL BUTTON FLOW MANAGER===

JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("treyarch.png");  //create image icon

		frame.setSize(500, 500);  //dimension
		frame.setLayout(null);
		frame.setTitle("Nice Window");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);  //prevent window form being resized
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		frame.setLocationRelativeTo(null);//centered locatioN
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(150, 100));
		panel.setBackground(new Color(0xA9BA9D));
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		frame.add(panel);
		frame.setVisible(true);  //make frame visible
		
		
===BORDER LAYOUT===

JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10, 10));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.magenta);
		
		panel2.setLayout(new BorderLayout());
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		
		// 	SUB PANELS
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

		panel6.setBackground(Color.CYAN);
		panel7.setBackground(Color.ORANGE);
		panel8.setBackground(Color.PINK);
		panel9.setBackground(Color.BLACK);
		panel10.setBackground(Color.DARK_GRAY);
		
		panel2.setLayout(new BorderLayout(5, 5));
		
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));
		
		panel2.add(panel6, BorderLayout.NORTH);
		panel2.add(panel7, BorderLayout.EAST);
		panel2.add(panel8, BorderLayout.WEST);
		panel2.add(panel9, BorderLayout.SOUTH);
		panel2.add(panel10, BorderLayout.CENTER);
		
		frame.add(panel5, BorderLayout.SOUTH);
		frame.add(panel4, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel1, BorderLayout.NORTH);
		
		
===Button===

JButton button;
	JLabel label;
	
	myFrame(){
		
		
		ImageIcon buttonIcon = new ImageIcon("iconTrey.png");
		ImageIcon labelIcon = new ImageIcon("treyarch.png");
		
		label =  new JLabel();
		label.setIcon(labelIcon);
		label.setBounds(0, 0, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(250, 150, 150,90 );
		button.addActionListener(e -> System.out.println("BUUUYAAAA"));
		button.setText("Click me");
		button.setFocusable(false);
		button.setIcon(buttonIcon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.ITALIC, 25));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.green);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setSize(800, 500);  //dimension
		this.setLayout(null);
		this.setTitle("Nice Window");  //sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);  //prevent window form being resized
		this.setVisible(true);  //make this visible
		this.setLocationRelativeTo(null);//centered location
		
		ImageIcon image = new ImageIcon(".png");  //create image icon
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == button) {
			System.out.println("Boooyaaaa");
			button.setVisible(false);
			label.setVisible(true);
		}
	}
	

===Panels===

ImageIcon labelIcon = new ImageIcon("iconTrey.png");
		
		JLabel label = new JLabel();
		label.setText("Thrasher");
		label.setIcon(labelIcon);
		label.setIconTextGap(0);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.LEFT);
		
		JPanel purplePanel = new JPanel();
		purplePanel.setBackground(new Color(167, 88, 162));
		purplePanel.setBounds(0, 0, 250, 250);
		purplePanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(250, 250, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 250, 250);
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);  //dimension
		frame.setLayout(null);
		frame.setTitle("Nice Window");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);  //prevent window form being resized
		frame.setVisible(true);  //make frame visible
		
		ImageIcon image = new ImageIcon("treyarch.png");  //create image icon
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		
		frame.add(purplePanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		frame.add(yellowPanel);
		yellowPanel.add(label);
		


=== WINDOW GO BRRRRRRRR===

		ImageIcon imageLabel = new ImageIcon("skyrim.png");
		Border border = BorderFactory.createLineBorder(Color.CYAN, 3);
		
		JLabel label = new JLabel();
		label.setText("SKYRIM");
		label.setIcon(imageLabel);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0, 255, 0));
		label.setFont(new Font("Times New Roman", Font.PLAIN,30));
		label.setIconTextGap(-10);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0, 0, 300, 300);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 350);  //dimension
		//frame.setLayout(null);
		frame.setTitle("Nice Window");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);  //prevent window form being resized
		frame.setVisible(true);  //make frame visible
		
		ImageIcon image = new ImageIcon("treyarch.png");  //create image icon
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x746AB0));  //or (167, 88, 162)
		frame.add(label);
		frame.pack();
		

===MUSIC PLAYER===

Scanner input = new Scanner(System.in);

		
		File file = new File("illusion_wav.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		
		String response = "";
			
			while(!response.equals("Q")) {
				System.out.println("P = PLAY \nS = Stop \nR = RESET \nQ = QUIT");
				System.out.println("Enter your choice: ");
				
				response = input.next();
				response = response.toUpperCase();
				
				switch(response) {
					case ("P"): clip.start();
						break;
					case("S"): clip.stop();
						break;
					case("R"): clip.setMicrosecondPosition(0);
						break;
					case("Q"): clip.close();
					
						default: System.out.println("ENDp");


===File Reading===

try {
			FileReader reader = new FileReader("desktop_doc.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

===File Wrintig===

try {
				
			FileWriter writer =  new FileWriter("desktop_doc.txt");
			writer.write("new text \nanother line");
			writer.append("\nAppended text");
			writer.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}

===Files===

File file = new File("desktop_doc.txt");
	
	if(file.exists()) {
		System.out.println("The file exists.");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		file.delete();
	}else {
		System.out.println("The file doesnt exist.");
	}

===Exception handling===

	Scanner input = new Scanner( System.in);
try {
		System.out.println("Vendosni nje numer: ");
		int x = input.nextInt();
		System.out.println("Vendosni nje numer: ");
		int y = input.nextInt();
		
		int z = x/y;
		System.out.println(z);
		
	}
	catch(ArithmeticException e){
		System.out.println("u cant devide by 0 ");
	}
	catch(InputMismatchException e) {
		System.out.println("I said enter a number");
	}
	catch(Exception e ) {
		System.out.println("error404");
	}	
	finally {
		System.out.println("printf");
		input.close();
	}
	


===Objects in arrays===

int[] numbers = new int[4];
		String[] strings = new String[3];
		char[] characters = new char[5];
		
		//Klasa[] grupi = new Klasa[5];
		Klasa top = new Klasa("Sett");
		Klasa jgl = new Klasa("Nunu");
		Klasa mid = new Klasa("Sylas");
		Klasa adc = new Klasa("Jhin");
		Klasa sup = new Klasa("Lulu");
		
		Klasa[] grupi = {top, jgl, mid, adc, sup};
		
		System.out.println(grupi[0].name);
		

===Constructors===

MAIN FUNCTION

Klasa njishi = new Klasa(48,6, 10);
		
		System.out.println(((njishi.a==0) ? "" : njishi.a ));
		System.out.println(((njishi.b==0) ? "" : njishi.b ));
		System.out.println(((njishi.c==0) ? "" : njishi.c ));
		
		Klasa dyshi = new Klasa();
		Klasa treshi = new Klasa(1);
		Klasa katra = new Klasa(4, 7);
		System.out.println("=======================================");
		
		int x, y, z;
		Scanner input =  new Scanner(System.in);
		System.out.println("Vendosni numrin e pare: ");
		x = input.nextInt();
		System.out.println("Vendosni numrin e dyte: ");
		y = input.nextInt();
		System.out.println("Vendosni numrin e trete: ");
		z = input.nextInt();
		
		Klasa test = new Klasa(x, y, z);

KLASA N VETE

int a;
	int b;
	int c;
	
	public Klasa() {
		System.out.println("--------------");
		System.out.println("Constructor pa parametra.");
	}
	public Klasa(int a) {
		System.out.println("--------------");
		System.out.println("Constructor me 1 parameter.");
		this.a = a;
		System.out.println("Shuma eshte: "+a);
	}
	public Klasa(int a, int b) {
		System.out.println("--------------");
		System.out.println("Constructor me 2 parametra.");
		this.a = a;
		this.b = b;
		System.out.println("Shuma eshte: "+ (a+b));
	}
	public Klasa(int a, int b, int c) {
		System.out.println("--------------");
		System.out.println("Constructor me 3 parametra.");
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Shuma eshte: "+(a+b+c));
	}
===ENHANCED FOR LOOP===

String[] album = {"trilogy", "kissland", "bbtm", "starboy", "mdm"};
			
			for(String i: album) {
				System.out.println(i);
			}
			
===ARRAY LISTS===

ArrayList<String> album = new ArrayList<String>();
	
		ArrayList<ArrayList<String>> music = new ArrayList();
		
		ArrayList<String> album = new ArrayList<String>();
	
		album.add("Trilogy");
		album.add("Kiss Land");
		album.add("BBTM");
		album.add("After Hours");
		album.add("Dawn FM");
		
		ArrayList<String> song = new ArrayList<String>();
	
		song.add("The Fall");
		song.add("Kissland");
		song.add("Shameless");
		song.add("Nothing compares");
		song.add("Here we go again");
		
		ArrayList<String> kanye = new ArrayList<String>();
		
		kanye.add("Graduation");
		kanye.add("Ye");
		kanye.add("TLOP");
		kanye.add("MBDTF");
		kanye.add("Yeezus");
		
		music.add(album);
		music.add(song);
		music.add(kanye);
		System.out.println(music.get(1).get(0));
		
===ARRAY FREQUENCY X TIMES FROM THNE USER===

	Scanner input = new Scanner(System.in);
		System.out.println("Vendosni numrin e elementeve qe doni: ");
		int n = input.nextInt();
		
		int v[] = new int[n];
			for(int i=0; i<n; i++) {
				int j=i+1;
				System.out.println("Elementi "+ j +":");
				v[i] = input.nextInt();
			}
			
		Random random = new Random();
		int freq[]= new int[n];
		
		System.out.println("Vendosni numrin e hereve qe doni te behet prova: ");
		
		int here = input.nextInt();
			for(int i=0; i<here; i++) {
				++freq[random.nextInt(n)];
			}
		System.out.println("Rendi | Numri | Frequenca");
			for(int i=0; i<here; i++) {
				int j=i+1;
				System.out.println(j+"\t"+v[i]+"\t"+freq[i]);
			}

===RANDOM NUMBER GENERATOR===

	Random dice = new Random();
			int number;
			
		for(int i=0; i<10; i++) {
			number = 1+dice.nextInt(6);
			System.out.println(number + " ");
		}

===PRINTIN WITH METHODS FROM ANOTHER CLASS===

MAIN
		Scanner input = new Scanner(System.in);
		klasa klasaObject = new klasa();
		System.out.println("Enter name of 1st gf: ");
		String her = input.nextLine();
		klasaObject.setName(her);
		klasaObject.saying();
OTHER CLASS
	private String girlName;
	public void setName(String name) {
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	public void saying() {
		System.out.println("Your first gf was "+getName());
	}
	
===METHODS IN OTHER CLASSES===
Scanner input = new Scanner(System.in);
		KlasaX klasaObject = new KlasaX();
		System.out.println("Vendosni emrin: ");
		String name = input.nextLine();
		klasaObject.simpleMessage(name);
		
===CALCULATOR NORMAL===

Scanner in = new Scanner(System.in);
			double a, b, rez;
			System.out.println("Numri i pare: ");
			a = in.nextDouble();
			System.out.println("Numri i dyte: ");
			b = in.nextDouble();
			rez = a + b;
			System.out.println(rez);
			
===USER INPUT===
 		Scanner scanner = new Scanner(System.in);
		System.out.print("What is ur name? ");
		String name = scanner.nextLine();
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Whats ur fav food?");
		String food = scanner.nextLine();
		System.out.println("Hello "+name);
		System.out.println("U are "+age+" years old" );
		System.out.println("Your fav food is"+food);
 
 ===USER I/O GUI===
 		String name = JOptionPane.showInputDialog("Vendosni emrin: ");
		JOptionPane.showMessageDialog(null, "Hello"+name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Vendosni moshen: "));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
		double height = Double.parseDouble(JOptionPane.showInputDialog("Vendosni gjatesine: "));
		JOptionPane.showMessageDialog(null, "You are "+height+"cm");
 
 */