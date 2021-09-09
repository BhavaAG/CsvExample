package Bhavaag.Sample;
import java.io.*;
public class CSVReaderTest {
//	public static void main(String[] args) throws Exception  
//	{  
//	 Scanner so = new Scanner(new File("Demo.csv"));  
//	   so.useDelimiter(",");    
//	   while (so.hasNext())    
//	   {  
//	   System.out.print(so.next());   
//	   }   
//	   so.close();  
//	   }  
   public static final String delimiter = ",";
   public static void read(String CsvFile) {
      try {
         File file = new File(CsvFile);
         FileReader f = new FileReader(file);
         BufferedReader b = new BufferedReader(f);
         String line = "";
         String[] temp;
         while((line = b.readLine()) != null) {
            temp = line.split(delimiter);
            for(String tempStr : temp) {
               System.out.print(tempStr + " ");
            }
            System.out.println();
         }
         b.close();
         } catch(IOException a1) {
            a1.printStackTrace();
         }
   }
   public static void main(String[] args) {
      String CsvFile = "Demo.csv";
       CSVReaderTest.read(CsvFile);
   }
}