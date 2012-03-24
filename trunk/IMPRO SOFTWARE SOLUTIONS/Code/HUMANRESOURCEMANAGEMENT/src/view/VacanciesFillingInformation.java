package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VacanciesFillingInformation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtVacancyid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmployeeid = null;
	private JLabel jLabel3 = null;
	private JTextField txtFilldate = null;
	private JLabel jLabel4 = null;
	private JTextArea jtaIntakedetails = null;
	private JButton btnAdd = null;
	
	private JButton btnDelete = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField jTextField = null;
	private JTextField jTextField1 = null;

	/**
	 * This is the default constructor
	 */
	public VacanciesFillingInformation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(428, 408);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmVacancyFill");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Creator :");
			jLabel6.setLocation(new Point(240, 170));
			jLabel6.setSize(new Dimension(56, 25));
			jLabel5 = new JLabel();
			jLabel5.setText("Status :");
			jLabel5.setLocation(new Point(240, 130));
			jLabel5.setSize(new Dimension(54, 25));
			jLabel4 = new JLabel();
			jLabel4.setText("IntakeDetails :");
			jLabel4.setLocation(new Point(20, 220));
			jLabel4.setSize(new Dimension(83, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Fill-Date :");
			jLabel3.setLocation(new Point(20, 170));
			jLabel3.setSize(new Dimension(57, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("EmployeeID :");
			jLabel2.setLocation(new Point(20, 130));
			jLabel2.setSize(new Dimension(75, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID :");
			jLabel1.setLocation(new Point(20, 90));
			jLabel1.setSize(new Dimension(69, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(36, 17, 338, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Add Vacancies Filling Details");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtVacancyid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmployeeid(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtFilldate(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getJtaIntakedetails(), null);
			jContentPane.add(getBtnAdd(), null);
			
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getJTextField1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtVacancyid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancyid() {
		if (txtVacancyid == null) {
			txtVacancyid = new JTextField();
			txtVacancyid.setLocation(new Point(110, 90));
			txtVacancyid.setSize(new Dimension(90, 25));
		}
		return txtVacancyid;
	}

	/**
	 * This method initializes txtEmployeeid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmployeeid() {
		if (txtEmployeeid == null) {
			txtEmployeeid = new JTextField();
			txtEmployeeid.setSize(new Dimension(90, 25));
			txtEmployeeid.setLocation(new Point(110, 130));
		}
		return txtEmployeeid;
	}

	/**
	 * This method initializes txtFilldate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFilldate() {
		if (txtFilldate == null) {
			txtFilldate = new JTextField();
			txtFilldate.setLocation(new Point(110, 170));
			txtFilldate.setPreferredSize(new Dimension(4, 20));
			txtFilldate.setSize(new Dimension(90, 25));
		}
		return txtFilldate;
	}

	/**
	 * This method initializes jtaIntakedetails	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJtaIntakedetails() {
		if (jtaIntakedetails == null) {
			jtaIntakedetails = new JTextArea();
			jtaIntakedetails.setSize(new Dimension(200, 60));
			jtaIntakedetails.setLocation(new Point(110, 220));
			jtaIntakedetails.setPreferredSize(new Dimension(4, 20));
			jtaIntakedetails.setBorder(BorderFactory.createEtchedBorder());
		}
		return jtaIntakedetails;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(96, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnAdd.setLocation(new Point(79, 300));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Cancel");
			btnDelete.setSize(new Dimension(97, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/button-cancel-icon.png")));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setLocation(new Point(232, 300));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Ban co chac muon thoat", "Thong Bao",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewVacanciesFillingInformation()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnDelete;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setSize(new Dimension(90, 25));
			jTextField.setLocation(new Point(311, 130));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setSize(new Dimension(90, 25));
			jTextField1.setLocation(new Point(311, 170));
		}
		return jTextField1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
