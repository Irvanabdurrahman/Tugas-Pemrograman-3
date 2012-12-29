/**
Created by irvan abdurrrahman - 4510210003
Sunday, December 30, 2012
*/

package tugas.report;

import java.io.InputStream;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class DemoDaftarProdukPDF{
	private static String templateReport = "/DaftarProduk.jrxml";
	
	public static void main(String[] xx) throws Exception {
		//1. Load template
		InputStream template = DemoDaftarProdukPDF.class.getResourceAsStream(templateReport);
		JasperDesign jd = JRXmlLoader.load(template);
		
		//2.Compile
		JasperReport report = JasperCompileManager.compileReport(jd);
		
		//3.Isi data
		List <Produk> daftarProduk = buatSampleData();
		Map <String, Object> params = new HashMap<String, Object>();
		params.put("tahun",2013);
		
		JasperPrint jrprint = JasperFillManager.fillReport(report,params, new JRBeanCollectionDataSource(daftarProduk));
		
		//4. Export
		JRPdfExporter exporter = new JRPdfExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT,jrprint);
		
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,"target/hasil-pdf");
		exporter.exportReport();
	}
	
	private static List <Produk> buatSampleData(){
		//nantinya ini query dari database
		List <Produk> hasil = new ArrayList<Produk>();
		
		Produk p1 = new Produk();
		p1.setKode("P-001");
		p1.setNama("Mouse Logitech");
		p1.setHarga("150.000,00");
		hasil.add(p1);
		
		Produk p2 = new Produk();
		p2.setKode("P-002");
		p2.setNama("USB Flashdisk 2 GB");
		p2.setHarga("50.000,00");
		hasil.add(p2);
		
		Produk p3 = new Produk();
		p3.setKode("P-003");
		p3.setNama("Laptop Acer");
		p3.setHarga("10.000.000,00");
		hasil.add(p3);
		
		Produk p4 = new Produk();
		p4.setKode("P-004");
		p4.setNama("Harddisk 500 GB");
		p4.setHarga("800.000,00");
		hasil.add(p4);
		
		Produk p5 = new Produk();
		p5.setKode("P-005");
		p5.setNama("Printer Canon IP1980");
		p5.setHarga("600.000,00");
		hasil.add(p5);
		
		Produk p6 = new Produk();
		p6.setKode("P-006");
		p6.setNama("Joystick");
		p6.setHarga("60.000,00");
		hasil.add(p6);
		
		Produk p7 = new Produk();
		p7.setKode("P-007");
		p7.setNama("Monitor LCD Acer");
		p7.setHarga("2.000.000,00");
		hasil.add(p7);
		
		return hasil;
	}
}