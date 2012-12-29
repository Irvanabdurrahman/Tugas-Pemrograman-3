/**
Created by irvan abdurrrahman - 4510210003
Sunday, December 30, 2012
*/

package belajar.complex.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;


public class ComboList{
	private static JComboBox comboHobi = new JComboBox();
	private static JList list = new JList();
	private static List<String> Hobi = new ArrayList<String>();
	private static final List<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa> ();
	
	public static void isi(){
		//data dimasukkan kedalam class model
		DefaultComboBoxModel model = new DefaultComboBoxModel(daftarMahasiswa.toArray());
		//pasang model dicombo
		list.setModel(model);
	}
	
	public static void tambahData(Mahasiswa mh){
		daftarMahasiswa.add(mh);
		isi();
	}
	
	public static void isiCombo(){
		DefaultComboBoxModel model = new DefaultComboBoxModel(Hobi.toArray());
		comboHobi.setModel(model);
	}
	
	public static void isiHobi(String isi){
		Hobi.add(isi);
		isiCombo();
	}
	
public static void main(String[] xx){
		Mahasiswa mh = new Mahasiswa();
			mh.setNpm("NIM");
			mh.setNama("Nama");
			mh.setHobi("Hobi");
			tambahData(mh);
			
		final JFrame fr = new JFrame("Combo dan List");
		JLabel lbJudul = new JLabel ("Input Mahasiswa");
		JLabel lbNim = new JLabel("                      NIM");
		JLabel lbNama = new JLabel("                      Nama");
		JLabel lbHobi = new JLabel("                      Hobi");
				
		isiHobi("== Pilihan ==");
		isiHobi("Ngoding");
		isiHobi("Mancing");
		isiHobi("Berenang");
	
		JScrollPane scrData = new JScrollPane(list);
		
		final JTextField tfNim = new JTextField(15);
		final JTextField tfNama = new JTextField(15);
		
		JButton btnSave = new JButton("Save");
		JButton btnReset = new JButton("Reset");
		
		JPanel pnlList = new JPanel();
		pnlList.setLayout(new GridLayout(3,3));
		pnlList.add(lbNim);
		pnlList.add(tfNim);
		pnlList.add(lbNama);
		pnlList.add(tfNama);
		pnlList.add(lbHobi);
		pnlList.add(comboHobi);

		lbJudul.setBounds(new Rectangle(100,0,300,60));
		pnlList.setBounds(new Rectangle(-50,70,300,70));
		btnSave.setBounds(new Rectangle(100,145,70,25));
		btnReset.setBounds(new Rectangle(175,145,70,25));
		scrData.setBounds(new Rectangle(320,70,270,120));
		
		Container p = new Container();
		p = fr.getContentPane();
		p.setLayout(null);
		p.add(pnlList);
		p.add(lbJudul);
		p.add(btnSave);
		p.add(btnReset);
		p.add(scrData);
		
		fr.setSize(640,280);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
	class isi implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String nim = tfNim.getText();
				String nama = tfNama.getText();
				System.out.println("NPM : "+nim);
				System.out.println("Nama : "+nama);
				
				String hobi = (String) comboHobi.getSelectedItem();
				System.out.println("Hobi : "+hobi);

				Mahasiswa mh = new Mahasiswa();
					mh.setNpm(nim);
					mh.setNama(nama);
					mh.setHobi(hobi);
					tambahData(mh);
					
				//kosongkan textfield
				tfNama.setText("");
				tfNim.setText("");
				tfNim.requestFocus();
				comboHobi.setSelectedItem("== Pilihan ==");
			}
		}isi l = new isi();
		btnSave.addActionListener(l);
		
	class batal implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tfNim.setText("");
			tfNama.setText("");
			tfNim.requestFocus();
			comboHobi.setSelectedItem("== Pilihan ==");
		}
	}batal b = new batal();
	btnReset.addActionListener(b);	
	}
}