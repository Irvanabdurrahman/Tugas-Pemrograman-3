/* Tuesday, October 17, 2012 
	*  Irvan Abdurrahman
	*  Twitter @van_parker
	* 	http://www.facebook.com/abddurrahman.irvan
	*  Blogspot : http://irvanabdurrahman.blogspot.com
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class entrydata extends JFrame implements ActionListener{
		private JLabel lNim, lNama, lHobi, lJK;
		private JTextField tfNim, tfNama;
		private JCheckBox cbFS, cbBS, cbSG;
		private JRadioButton rbLK, rbPR;
		private JButton bSimpan, bBatal;
		private JPanel p1, p2, p3, panel1, panel2;
		ButtonGroup group;
		
		//constructor
		public entrydata(){
			super("Created by Irvan Abdurrahman - 4510210003");
			lNim = new JLabel("NPM : ");
			tfNim = new JTextField(20);
			lNama = new JLabel("Nama : ");
			tfNama = new JTextField(20);
			lHobi = new JLabel("Hobi : ");
			cbFS = new JCheckBox("Futsal");
			cbBS = new JCheckBox("Basketball");
			cbSG = new JCheckBox("Singing");
			lJK = new JLabel("Jenis Kelamin : ");
			rbLK = new JRadioButton("Laki - Laki");
			rbPR = new JRadioButton("Perempuan");
			group = new ButtonGroup();
			group.add(rbLK);
			group.add(rbPR);
			bSimpan = new JButton("Simpan");
			bBatal = new JButton("Batal");
			bSimpan.addActionListener(this);
			bBatal.addActionListener(this);
			
			p1 = new JPanel ( new GridLayout (2, 2));
			p2 = new JPanel ( new GridLayout (0, 1));
			p3 = new JPanel ();
			panel1 = new JPanel(new BorderLayout());
			panel2 = new JPanel();
			this.setLayout(new BorderLayout());
			p1.add(lNim);
			p1.add(tfNim);
			p1.add(lNama);
			p1.add(tfNama);
			p2.add(lHobi);
			p2.add(cbFS);
			p2.add(cbBS);
			p2.add(cbSG);
			p2.add(lJK);
			p2.add(rbLK);
			p2.add(rbPR);
			p3.add(bSimpan);
			p3.add(bBatal);
			
			ScrollPane scroll = new ScrollPane();
			scroll.setPreferredSize(new Dimension (400, 300));
			
			panel1.add(p1, "North");
			panel1.add(p2, "Center");
			panel1.add(p3, "South");
			
			panel2.add(scroll);
			scroll.add(panel1);
			this.add(panel2, "North");
			bSimpan.addActionListener(this);
			bBatal.addActionListener(this);
			
			this.pack();
			this.setVisible(true);
			this.setLocation(200,100);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		}// akhir constructor
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == bSimpan){
				JOptionPane.showMessageDialog(this, " Congratulation, your signup is succes and thank you for your partisipans " ,  " message", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}if (event.getSource() == bBatal){
				tfNim.setText("");
				tfNama.setText("");
				cbFS.setSelected(false);
				cbBS.setSelected(false);
				cbSG.setSelected(false);
				rbLK.setSelected(false);
				rbPR.setSelected(false);
		}//finish of event handling
			// Created by Irvan Abdurrahman
	}//finish of InnerEntry
	
	public static void main(String[] args){
		new entrydata();
	}
}