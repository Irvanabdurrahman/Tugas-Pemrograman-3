/**
 Create by Irvan Abdurrahman - 4510210003
*/

package tugas.belajar.table;

import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

public class TabelProduk extends AbstractTableModel{
	private String[] namaKolom = new String[]{"Symbol","Name","Price"};
	
	private List<Produk> dataProduk = new ArrayList<Produk>();
	
	public TabelProduk(List<Produk> data){
		this.dataProduk = data;
	}
	
	public String getColumnName(int col){
		return namaKolom[col].toString();
	}
	public int getRowCount(){ return dataProduk.size();}
	public int getColumnCount(){ return namaKolom.length;}
	public Object getValueAt(int baris, int kolom){
		Produk p = dataProduk.get(baris);
		
		switch(kolom){
			case 0: return p.getSimbol();
			case 1: return p.getName();
			case 2: return p.getPrice();
			default: return null;
		}
	}
	
	public boolean isCellEditable(int row, int col){ return true;}
	public void setValue(Object value, int baris, int kolom){
		Produk p = dataProduk.get(baris);
		String isi = (String) value;
		
		switch(kolom){
			case 0: p.setSimbol(isi);break;
			case 1: p.setName(isi);break;
			case 2: p.setPrice(isi);break;
			default: break;
		}
		fireTableCellUpdated(baris, kolom);
	}
}