import java.awt.Graphics;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


import com.sun.org.apache.xml.internal.security.utils.Base64;
import sun.misc.BASE64Decoder;




public class Sample 
{

	public static void main(String[] args)
    {
		
		List<Date> listDates = new ArrayList<Date>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		
		 ArrayList<Date> dateList = new ArrayList<Date>();
		
		         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		 
		     DateCompare compare = new DateCompare();
		 
		         try{
			         Date toDate = df.parse("2005-12-10");           
			         Date fromDate = df.parse("2005-12-01");
			         
			         long diff = toDate.getTime() - fromDate.getTime();
			         
						
						long diffDays = diff / (24 * 60 * 60 * 1000);
			 
						System.out.print(diffDays + " days, ");
						
			 
						for(int i=0;i<=diffDays-1;i++){
							
							//dateList.add("");
						}
			       
			 
		         } catch (Exception e) {
		             e.printStackTrace();
		         }

		/*try {
		    listDates.add(dateFormatter.parse("2013-09-30"));
		    listDates.add(dateFormatter.parse("2013-07-06"));
		    listDates.add(dateFormatter.parse("2013-11-28"));
		} catch (ParseException ex) {
		    System.err.print(ex);
		}
		 
		System.out.println("Before sorting: " + listDates);
		 
		Collections.sort(listDates);
		 
		System.out.println("After sorting: " + listDates);*/
    	/*System.out.println("inside");
    	Double genRandomNo = Math.floor(Math.random());
    	System.out.println("genRandomNo"+genRandomNo);
    	String no = "79d9c336e642ef0cbde6c1df6e0fc9e3M";
    	no=no.substring(0,no.length()-1);
    	System.out.println("genRandomNo"+no);
    	
    	
    	String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	int character=(int)(Math.random()*26);
    	System.out.println("character "+character);
    	String s=alphabet.substring(character, character+1);
    	System.out.println("string "+s);
    	//String fixed = getFixedString("Testing");
    	//byte[]   bytesEncoded = Base64.encodeBase64(str .getBytes());
    //	System.out.println("ecncoded value is " + new String(bytesEncoded ));

    	// Decrypt data on other side, by processing encoded data
    	//byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
    	//System.out.println("Decoded value is " + new String(valueDecoded));
    	try{
    	BASE64Decoder decoder = new BASE64Decoder();
    	byte[] decodedBytes = decoder.decodeBuffer("YWIga2kgYmFhciBtb2RpIHNhcmthcg==");
    	System.out.println("Decoded value is " + new String(decodedBytes));*/
    	}
	public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
}	

	


	String getFixedString(String a){
		
		String b=null;
		
		
		
		return b;
	}
}

class DateCompare implements Comparator<Date> {
	
    public int compare(Date one, Date two){

    return one.compareTo(two);

    }

}

