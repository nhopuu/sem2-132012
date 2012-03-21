package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUserid = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel3 = null;
	private JTextField txtAcclevel = null;
	private JButton btnLogin = null;
	private JButton btnCancel = null;

	/**
	 * This is the default constructor
	 */
	public Login() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(476, 360);
		this.setContentPane(getJContentPane());
		this.setTitle("FormLogin");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Acc-Level");
			jLabel3.setLocation(new Point(73, 200));
			jLabel3.setForeground(Color.yellow);
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(76, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Password");
			jLabel2.setLocation(new Point(73, 150));
			jLabel2.setForeground(Color.yellow);
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(76, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("UserID");
			jLabel1.setLocation(new Point(73, 99));
			jLabel1.setForeground(Color.yellow);
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setSize(new Dimension(58, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(29, 8, 407, 60));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.yellow);
			jLabel.setText("Welcome To Enterprise Organiser");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(0, 136, 255));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtUserid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtAcclevel(), null);
			jContentPane.add(getBtnLogin(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUserid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUserid() {
		if (txtUserid == null) {
			txtUserid = new JTextField();
			txtUserid.setSize(new Dimension(200, 30));
			txtUserid.setLocation(new Point(179, 99));
		}
		return txtUserid;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setLocation(new Point(179, 150));
			txtPassword.setSize(new Dimension(200, 30));
		}
		return txtPassword;
	}

	/**
	 * This method initializes txtAcclevel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAcclevel() {
		if (txtAcclevel == null) {
			txtAcclevel = new JTextField();
			txtAcclevel.setSize(new Dimension(200, 30));
			txtAcclevel.setLocation(new Point(179, 200));
		}
		return txtAcclevel;
	}

	/**
	 * This method initializes btnLogin	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton();
			btnLogin.setText("Login");
			btnLogin.setSize(new Dimension(101, 30));
			btnLogin.setForeground(Color.yellow);
			btnLogin.setBackground(new Color(0, 109, 255));
			btnLogin.setIcon(new ImageIcon(getClass().getResource("/images/Key.png")));
			btnLogin.setLocation(new Point(110, 260));
		}
		return btnLogin;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.setSize(new Dimension(114, 30));
			btnCancel.setForeground(Color.yellow);
			btnCancel.setBackground(new Color(0, 109, 255));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnCancel.setLocation(new Point(250, 260));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
