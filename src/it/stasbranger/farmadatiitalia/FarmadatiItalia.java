package it.stasbranger.farmadatiitalia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import javax.xml.bind.JAXBElement;

import org.datacontract.schemas._2004._07.FDIWebServices.GetDataSet_Output;
import org.datacontract.schemas._2004._07.fdiwebservices.ArrayOfSetDati;
import org.datacontract.schemas._2004._07.fdiwebservices.Field;
import org.datacontract.schemas._2004._07.fdiwebservices.GetDataSetChangesOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.GetEnabledDataSetOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.GetSchemaDataSetOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.SetDati;

import it.farmadati.webservices.FarmadatiItaliaWebServicesM2;
import it.farmadati.webservices.FarmadatiItaliaWebServicesM2_Service;

public class FarmadatiItalia {

	public static void main(String[] args) {
		
		FarmadatiItaliaWebServicesM2_Service fd = new FarmadatiItaliaWebServicesM2_Service();
		FarmadatiItaliaWebServicesM2 m2 = fd.getBasicHttpBindingFarmadatiItaliaWebServicesM2();
		GetEnabledDataSetOutput dataSetOutput = m2.getEnabledDataSet("murgiaweb", "srl30145ba");
		
		JAXBElement<ArrayOfSetDati> jaxbElement = dataSetOutput.getSetDatiAbilitati();
		
		GetDataSet_Output output = new GetDataSet_Output();
		
		Iterator<SetDati> iter = jaxbElement.getValue().getSetDati().iterator();
		while (iter.hasNext()) {
			SetDati setDati = (SetDati) iter.next();
			System.out.println(setDati.getDescription().getValue());
			
		
			GetSchemaDataSetOutput schemaDataSetOutput = m2.getSchemaDataSet("murgiaweb", "srl30145ba", setDati.getKey().getValue(), false);
			Iterator<Field> iter2 = schemaDataSetOutput.getFields().getValue().getField().iterator();
			while (iter2.hasNext()) {
				Field field = (Field) iter2.next();
				System.out.println(">"+field.getDescription().getValue());
			}
			
			Calendar now = Calendar.getInstance();
			now.add(Calendar.DATE, -1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			String ora = sdf.format(now.getTime());
			System.out.println(ora);
			GetDataSetChangesOutput dataSetOutput2 = m2.getDataSetChanges("murgiaweb", "srl30145ba", setDati.getKey().getValue(),ora, "GETRECORDS", 1, 25000);
			byte[] file = dataSetOutput2.getByteListFile().getValue();
			
			
			try {
				FileOutputStream fos = new FileOutputStream("./output/"+setDati.getKey().getValue()+"_"+1+".zip");
				fos.write(file);
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// per estrapolare le immagini basta mettere il nome del file e il serial number 
			// es. http://www.farmadati.it/imgbd/imgbd.aspx?img=106609.jpg&sn=srl30145wx
		}
	}

}
