package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JTextField;

import dao.DepartmentsDAO;

import model.DepartmentsModel;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ViewDepartment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdepartment = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDeptid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDeptname = null;
	private JLabel jLabel3 = null;
	private JTextField txtDepthead = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"ID","Name","Dep_Head","Location","Up_Dep_No","Dn_Dep_No"};
	private String[][] tableData;
	/**
	 * This is the default constructor
	 */
	public ViewDepartment() {
		super();
		initialize();
		this.setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(650, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDept");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(208, 18, 202, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Department");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(27, 83, 567, 191));
			jScrollPane.setViewportView(getJTableViewdepartment());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdepartment	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdepartment() {
		loadDataToTable();
		if (jTableViewdepartment == null) {
			jTableViewdepartment = new JTable(tableData, ColumnName);
		}
		return jTableViewdepartment;
	}
	private void loadDataToTable(){
		ArrayList<DepartmentsModel> listDepartments = DepartmentsDAO.getAllDepartments();
		tableData = new String[listDepartments.size()][6];
		int row = 0;
		for (DepartmentsModel model:listDepartments){
		tableData [row][0] = model.getDep_ID();
		tableData [row][1] = model.getDep_Name();
		tableData [row][2] = model.getDep_Head();
		tableData [row][3] = model.getLocation();
		tableData [row][4] = model.getUp_Dep_No();
		tableData [row][5] = model.getDn_Dep_No();
		row++;
		}
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
			btnAdd.setSize(new Dimension(90, 30));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(90, 410));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit");
			btnEdit.setSize(new Dimension(90, 30));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(270, 410));
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(90, 30));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(450, 410));
		}
		return btnDelete;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("DeptHead");
			jLabel3.setLocation(new Point(278, 17));
			jLabel3.setSize(new Dimension(57, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptName");
			jLabel2.setSize(new Dimension(64, 25));
			jLabel2.setLocation(new Point(9, 55));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptID");
			jLabel1.setSize(new Dimension(40, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(564, 94));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDeptid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtDeptname(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtDepthead(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(88, 17));
			txtDeptid.setSize(new Dimension(160, 25));
		}
		return txtDeptid;
	}

	/**
	 * This method initializes txtDeptname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptname() {
		if (txtDeptname == null) {
			txtDeptname = new JTextField();
			txtDeptname.setLocation(new Point(88, 55));
			txtDeptname.setSize(new Dimension(160, 25));
		}
		return txtDeptname;
	}

	/**
	 * This method initializes txtDepthead	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDepthead() {
		if (txtDepthead == null) {
			txtDepthead = new JTextField();
			txtDepthead.setLocation(new Point(353, 17));
			txtDepthead.setSize(new Dimension(160, 25));
		}
		return txtDepthead;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setText("Search");
			btnSearch.setSize(new Dimension(95, 25));
			btnSearch.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/Zoom.png")));
			btnSearch.setLocation(new Point(393, 56));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
