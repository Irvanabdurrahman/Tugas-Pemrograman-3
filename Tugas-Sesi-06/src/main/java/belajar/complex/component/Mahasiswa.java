/**
Created by irvan abdurrrahman - 4510210003
Sunday, December 30, 2012
*/

package belajar.complex.component;

public class Mahasiswa{
	private String npm;
	private String nama;
	private String hobi;
	
	public String getNpm(){
		return this.npm;
	}
	
	public void setNpm(String x){
		this.npm = x;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setNama(String x){
		this.nama = x;
	}
	
	public String getHobi(){
		return this.hobi;
	}
	
	public void setHobi(String x){
		this.hobi=x;
	}
	
	public String toString(){
		return "     "   +this.npm+   "      -     "    +this.nama +     "      -      "    +this.hobi;
	}
}