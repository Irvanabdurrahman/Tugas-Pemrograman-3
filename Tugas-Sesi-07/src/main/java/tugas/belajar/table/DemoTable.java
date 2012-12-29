/**
Created by irvan abdurrrahman - 4510210003
Sunday, December 30, 2012
*/

package tugas.belajar.table;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import javax.swing.event.*;
import javax.swing.table.*;


public class DemoTable{
	private static final JTable tabelproduk = new JTable();
	private static final List<Produk> p = dataproduk();					
							
	public static void main(String[] xx){
						final JFrame fr = new JFrame("Sorting JTable");
						JLabel lbFilter = new JLabel("                                                                                                      Filter");	
						final JTextField tFilter = new JTextField(15);
						JButton bFilter = new JButton("Filter");
									
						TabelProduk pro = new TabelProduk(p);
						tabelproduk.setModel(pro);
		
						tabelproduk.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						JScrollPane scrProduk = new JScrollPane(tabelproduk);
		
						JPanel pnlProduk = new JPanel();
						pnlProduk.setLayout(new GridLayout(1,1));
						pnlProduk.add(lbFilter);
						pnlProduk.add(tFilter);
						
							
						pnlProduk.setBounds(new Rectangle(-305,30,705,25));
						scrProduk.setBounds(new Rectangle(0, 70, 400, 180));
						bFilter.setBounds(new Rectangle(0, 250, 400, 40));
						
						Container k = new Container();
						k =  fr.getContentPane();
						k.setLayout(null);
						k.add(pnlProduk);
						k.add(scrProduk);
						k.add(bFilter);
		
						//5 Tampilkan
						
						fr.setResizable(false);		
						fr.setSize(405,319);
						fr.setLocationRelativeTo(null);
						fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						fr.setVisible(true);	
	}
	
private static List<Produk> dataproduk(){
		List<Produk> p = new ArrayList<Produk>();
		
		Produk p1 = new Produk();
		p1.setSimbol("AMZN");
		p1.setName("Amazon");
		p1.setPrice("4128");
		p.add(p1);
		
		Produk p2 = new Produk();
		p2.setSimbol("EBAY");
		p2.setName("eBay");
		p2.setPrice("1157");
		p.add(p2);
		
		Produk p3 = new Produk();
		p3.setSimbol("GOOG");
		p3.setName("Google");
		p3.setPrice("38833");
		p.add(p3);
		
		Produk p4 = new Produk();
		p4.setSimbol("MSFT");
		p4.setName("Microsoft");
		p4.setPrice("2656");
		p.add(p4);
		
		Produk p5 = new Produk();
		p5.setSimbol("NOK");
		p5.setName("Nokia Corp");
		p5.setPrice("1748");
		p.add(p5);
		
		Produk p6 = new Produk();
		p6.setSimbol("ORCL");
		p6.setName("Oracle Corp");
		p6.setPrice("1252");
		p.add(p6);
		
		Produk p7 = new Produk();
		p7.setSimbol("ACR");
		p7.setName("Acer");
		p7.setPrice("18290");
		p.add(p7);
		
		Produk p8 = new Produk();
		p8.setSimbol("VOD");
		p8.setName("Vodafone Corp");
		p8.setPrice("2602");
		p.add(p8);
		
		Produk p9 = new Produk();
		p9.setSimbol("HP");
		p9.setName("HP");
		p9.setPrice("2346");
		p.add(p9);
		
		Produk p10 = new Produk();
		p10.setSimbol("SUS");
		p10.setName("Asus");
		p10.setPrice("6782");
		p.add(p10);
		
		Produk p11 = new Produk();
		p11.setSimbol("TOSH");
		p11.setName("Toshiba");
		p11.setPrice("4590");
		p.add(p11);
		
		Produk p12 = new Produk();
		p12.setSimbol("INT");
		p12.setName("Intel Corp");
		p12.setPrice("8730");
		p.add(p12);
		
		Produk p13 = new Produk();
		p13.setSimbol("IB");
		p13.setName("IBM Corp");
		p13.setPrice("786210");
		p.add(p13);
		
		Produk p14 = new Produk();
		p14.setSimbol("LNX");
		p14.setName("Linux");
		p14.setPrice("8947");
		p.add(p14);
				
		return p;
	}
}