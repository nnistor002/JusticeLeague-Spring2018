import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import java.awt.Dimension;

public class GameFrame extends JFrame
{
	
	
	private JTextField txtFieldMapTitle;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel contentPane;
	
	//================== CONTAINERS =====================|
	
	JPanel mapContainer = new JPanel();
	JPanel commandContainer = new JPanel();

	//================== LABELS ========================|
	JLabel mapBox = new JLabel("");
	
	
	//================== BUTTONS ========================|
	JButton btnSaveGame = new JButton("Save Game");
	JButton btnLoadGame = new JButton("Load Game");
	
	
	
	public GameFrame()
	{
		Frame frame = new Frame();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		mapContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		mapContainer.setBounds(827, 60, 500, 500);
		contentPane.add(mapContainer);
		mapContainer.setLayout(null);
		
		//============================================================================================== mapBox
		mapBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		mapBox.setIcon(new ImageIcon("C:\\Users\\Natanael Nistor\\Desktop\\GameMap001 500500.png"));
		mapBox.setHorizontalAlignment(SwingConstants.CENTER);
		mapBox.setBounds(0, 0, 500, 500);
		mapContainer.add(mapBox);
		
		txtFieldMapTitle = new JTextField();
		txtFieldMapTitle.setEditable(false);
		txtFieldMapTitle.setBorder(new LineBorder(Color.BLACK, 3, true));
		txtFieldMapTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldMapTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		txtFieldMapTitle.setText("Map Title");
		txtFieldMapTitle.setBounds(827, 11, 500, 50);
		contentPane.add(txtFieldMapTitle);
		txtFieldMapTitle.setColumns(10);
		
		
		commandContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		commandContainer.setBounds(1183, 571, 144, 222);
		contentPane.add(commandContainer);
		commandContainer.setLayout(null);
		
		
		btnSaveGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSaveGame.setBounds(10, 11, 126, 40);
		commandContainer.add(btnSaveGame);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoadGame.setBounds(10, 62, 126, 40);
		commandContainer.add(btnLoadGame);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHelp.setBounds(10, 113, 126, 40);
		commandContainer.add(btnHelp);
		
		JButton btnExit = new JButton("Exit Game");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(10, 164, 126, 40);
		commandContainer.add(btnExit);
		
		JPanel navContainer = new JPanel();
		navContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		navContainer.setBounds(820, 571, 353, 222);
		contentPane.add(navContainer);
		navContainer.setLayout(null);
		
		JButton btnNorth = new JButton("");
		btnNorth.setIcon(new ImageIcon("Icons/arrow_up.png"));
		btnNorth.setBounds(59, 15, 50, 50);
		navContainer.add(btnNorth);
		
		JButton btnWest = new JButton("");
		btnWest.setIcon(new ImageIcon("Icons/arrow_left.png"));
		btnWest.setBounds(10, 65, 50, 50);
		navContainer.add(btnWest);
		
		JButton btnEast = new JButton("");
		btnEast.setIcon(new ImageIcon("Icons/arrow_right.png"));
		btnEast.setBounds(108, 65, 50, 50);
		navContainer.add(btnEast);
		
		JButton btnSouth = new JButton("");
		btnSouth.setIcon(new ImageIcon("Icons/arrow_down.png"));
		btnSouth.setBounds(59, 115, 50, 50);
		navContainer.add(btnSouth);
		
		JButton btnFloorUp = new JButton("");
		btnFloorUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String str = "Hello-------------------------------------------------------------------------------------------------------------------"; //<<<<<<<<< Print to the GUI  Console
			   // textBOX.append(str);
			}
		});
		btnFloorUp.setIcon(new ImageIcon("Icons/Stairs_up.png"));
		btnFloorUp.setBounds(217, 15, 75, 75);
		navContainer.add(btnFloorUp);
		
		JButton btnFloorDown = new JButton("");
		btnFloorDown.setIcon(new ImageIcon("Icons/Stairs_down.png"));
		btnFloorDown.setBounds(217, 90, 75, 75);
		navContainer.add(btnFloorDown);
		
		JPanel roomPanel = new JPanel();
		roomPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		roomPanel.setBounds(5, 170, 340, 41);
		navContainer.add(roomPanel);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		roomPanel.add(btnEnter);
		
		JButton btnExamine = new JButton("Examine");
		btnExamine.setFont(new Font("Tahoma", Font.BOLD, 11));
		roomPanel.add(btnExamine);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		roomPanel.add(btnSearch);
		
		JButton btnExitRoom = new JButton("Exit Room");
		btnExitRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		roomPanel.add(btnExitRoom);
		
		JPanel playerContainer = new JPanel();
		playerContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		playerContainer.setBounds(10, 472, 503, 321);
		contentPane.add(playerContainer);
		playerContainer.setLayout(null);
		
		JLabel lblPlayerHp = new JLabel("Player Health");
		lblPlayerHp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayerHp.setBounds(30, 21, 115, 48);
		playerContainer.add(lblPlayerHp);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(139, 0, 0));
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		progressBar.setValue(85);
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(0, 100, 0));
		progressBar.setBounds(155, 34, 232, 20);
		playerContainer.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Damage");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(408, 11, 79, 20);
		playerContainer.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 255));
		textField.setText("65");
		textField.setEditable(false);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(407, 34, 80, 29);
		playerContainer.add(textField);
		textField.setColumns(10);
		
		JPanel inventory = new JPanel();
		inventory.setPreferredSize(new Dimension(15, 15));
		inventory.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		inventory.setBounds(10, 68, 399, 189);
		playerContainer.add(inventory);
		inventory.setLayout(new GridLayout(0, 6, 1, 1));
		
		JToggleButton toggleButton = new JToggleButton("1");
		toggleButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		toggleButton.setBackground(new Color(169, 169, 169));
		inventory.add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBackground(new Color(169, 169, 169));
		toggleButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("");
		toggleButton_2.setBackground(new Color(169, 169, 169));
		toggleButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("");
		toggleButton_3.setBackground(new Color(169, 169, 169));
		toggleButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("");
		toggleButton_4.setBackground(new Color(169, 169, 169));
		toggleButton_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("");
		toggleButton_5.setBackground(new Color(169, 169, 169));
		toggleButton_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("");
		toggleButton_6.setBackground(new Color(169, 169, 169));
		toggleButton_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("");
		toggleButton_7.setBackground(new Color(169, 169, 169));
		toggleButton_7.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_7);
		
		JToggleButton toggleButton_9 = new JToggleButton("");
		toggleButton_9.setBackground(new Color(169, 169, 169));
		toggleButton_9.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_9);
		
		JToggleButton toggleButton_8 = new JToggleButton("");
		toggleButton_8.setBackground(new Color(169, 169, 169));
		toggleButton_8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_8);
		
		JToggleButton toggleButton_10 = new JToggleButton("");
		toggleButton_10.setBackground(new Color(169, 169, 169));
		toggleButton_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_10);
		
		JToggleButton toggleButton_12 = new JToggleButton("");
		toggleButton_12.setBackground(new Color(169, 169, 169));
		toggleButton_12.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_12);
		
		JToggleButton toggleButton_11 = new JToggleButton("");
		toggleButton_11.setBackground(new Color(169, 169, 169));
		toggleButton_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_11);
		
		JToggleButton toggleButton_13 = new JToggleButton("");
		toggleButton_13.setBackground(new Color(169, 169, 169));
		toggleButton_13.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_13);
		
		JToggleButton toggleButton_15 = new JToggleButton("");
		toggleButton_15.setBackground(new Color(169, 169, 169));
		toggleButton_15.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_15);
		
		JToggleButton toggleButton_14 = new JToggleButton("");
		toggleButton_14.setBackground(new Color(169, 169, 169));
		toggleButton_14.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_14);
		
		JToggleButton toggleButton_16 = new JToggleButton("");
		toggleButton_16.setBackground(new Color(169, 169, 169));
		toggleButton_16.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_16);
		
		JToggleButton toggleButton_17 = new JToggleButton("");
		toggleButton_17.setBackground(new Color(169, 169, 169));
		toggleButton_17.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_17);
		
		JToggleButton toggleButton_18 = new JToggleButton("");
		toggleButton_18.setBackground(new Color(169, 169, 169));
		toggleButton_18.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_18);
		
		JToggleButton toggleButton_20 = new JToggleButton("");
		toggleButton_20.setBackground(new Color(169, 169, 169));
		toggleButton_20.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_20);
		
		JToggleButton toggleButton_19 = new JToggleButton("");
		toggleButton_19.setBackground(new Color(169, 169, 169));
		toggleButton_19.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_19);
		
		JToggleButton toggleButton_21 = new JToggleButton("");
		toggleButton_21.setBackground(new Color(169, 169, 169));
		toggleButton_21.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_21);
		
		JToggleButton toggleButton_22 = new JToggleButton("");
		toggleButton_22.setBackground(new Color(169, 169, 169));
		toggleButton_22.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_22);
		
		JToggleButton toggleButton_23 = new JToggleButton("");
		toggleButton_23.setBackground(new Color(169, 169, 169));
		toggleButton_23.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_23);
		
		JToggleButton toggleButton_24 = new JToggleButton("");
		toggleButton_24.setBackground(new Color(169, 169, 169));
		toggleButton_24.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_24);
		
		JToggleButton toggleButton_25 = new JToggleButton("");
		toggleButton_25.setBackground(new Color(169, 169, 169));
		toggleButton_25.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_25);
		
		JToggleButton toggleButton_26 = new JToggleButton("");
		toggleButton_26.setBackground(new Color(169, 169, 169));
		toggleButton_26.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_26);
		
		JToggleButton toggleButton_27 = new JToggleButton("");
		toggleButton_27.setBackground(new Color(169, 169, 169));
		toggleButton_27.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_27);
		
		JToggleButton toggleButton_28 = new JToggleButton("");
		toggleButton_28.setBackground(new Color(169, 169, 169));
		toggleButton_28.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_28);
		
		JToggleButton toggleButton_29 = new JToggleButton("30");
		toggleButton_29.setBackground(new Color(169, 169, 169));
		toggleButton_29.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		inventory.add(toggleButton_29);
		
		JTextArea txtrHereGoesItem = new JTextArea();
		txtrHereGoesItem.setEditable(false);
		txtrHereGoesItem.setText("Here goes Item Details");
		txtrHereGoesItem.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtrHereGoesItem.setBounds(10, 263, 483, 47);
		playerContainer.add(txtrHereGoesItem);
		
		JButton btnNewButton = new JButton("Pickup");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(414, 67, 79, 35);
		playerContainer.add(btnNewButton);
		
		JButton btnDrop = new JButton("Drop");
		btnDrop.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDrop.setBounds(414, 105, 79, 35);
		playerContainer.add(btnDrop);
		
		JButton btnEquip = new JButton("Equip");
		btnEquip.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEquip.setBounds(414, 143, 79, 35);
		playerContainer.add(btnEquip);
		
		JButton btnUnequip = new JButton("UnEquip");
		btnUnequip.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUnequip.setBounds(414, 180, 79, 35);
		playerContainer.add(btnUnequip);
		
		JButton btnUseItem = new JButton("Use");
		btnUseItem.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUseItem.setBounds(414, 219, 79, 35);
		playerContainer.add(btnUseItem);
		
		JPanel consoleContainer = new JPanel();
		consoleContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		consoleContainer.setBounds(10, 11, 807, 450);
		contentPane.add(consoleContainer);
		consoleContainer.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 787, 428);
		consoleContainer.add(scrollPane);
		
		JTextArea txtrGuiConsolePrintout = new JTextArea();
		txtrGuiConsolePrintout.setText("GUI CONSOLE PRINTOUT\r\n-\r\n-\r\n-\r\n-\r\n---------------\r\n-----------------------\r\n--------------------------------------\r\n-----------------------\r\n---------------\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-");
		txtrGuiConsolePrintout.setLineWrap(true);
		txtrGuiConsolePrintout.setWrapStyleWord(true);
		scrollPane.setViewportView(txtrGuiConsolePrintout);
		
		JPanel actionContainer = new JPanel();
		actionContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		actionContainer.setBounds(523, 472, 294, 321);
		contentPane.add(actionContainer);
		actionContainer.setLayout(null);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAttack.setBounds(10, 52, 129, 37);
		actionContainer.add(btnAttack);
		
		JButton btnFlee = new JButton("Flee");
		btnFlee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFlee.setBounds(155, 52, 129, 37);
		actionContainer.add(btnFlee);
		
		JPanel puzzleContainer = new JPanel();
		puzzleContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		puzzleContainer.setBounds(10, 100, 274, 210);
		actionContainer.add(puzzleContainer);
		puzzleContainer.setLayout(null);
		
		JButton btnExaminePuzzle = new JButton("Examine Puzzle");
		btnExaminePuzzle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExaminePuzzle.setBounds(10, 11, 128, 36);
		puzzleContainer.add(btnExaminePuzzle);
		
		JButton btnHint = new JButton("Hint");
		btnHint.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHint.setBounds(148, 11, 116, 36);
		puzzleContainer.add(btnHint);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(62, 58, 155, 53);
		puzzleContainer.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Solve Puzzle");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(50, 115, 179, 23);
		puzzleContainer.add(btnNewButton_1);
		
		JButton btnQuit = new JButton("Quit Puzzle");
		btnQuit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuit.setBounds(80, 149, 116, 36);
		puzzleContainer.add(btnQuit);
		
		JButton btnExamineMonster = new JButton("Examine \r\nMonster");
		btnExamineMonster.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExamineMonster.setBounds(48, 11, 200, 37);
		actionContainer.add(btnExamineMonster);
		
		frame.addWindowListener(new CloseListener()); 
		frame.setSize(1344,835);
		frame.setLocation(100,100);
		frame.add(contentPane);
		frame.setTitle("Game");
		frame.setResizable(false);
		
		frame.setVisible(true);	
	}

	public void addController(Controller myController)
	{
		
		
	}
	
	public static class CloseListener extends WindowAdapter {
		  public void windowClosing(WindowEvent e) {
		   e.getWindow().setVisible(false);
		   System.exit(0);
		  } 
		 } 
	
}
