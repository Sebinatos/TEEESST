import java.util.*;
import java.io.*;

public class datei
{
    
    
    
    
     public void dateiLaden(String dateiname, ArrayList<String> wortliste)
 {
    // Alles wie gehabt
    File datei = new File(dateiname); 
 
    try{
       BufferedReader reader = new BufferedReader(new FileReader(datei));
 
       String zeile = reader.readLine(); 
 
       while(zeile != null)
       {
          wortliste.add(zeile); // Wörter werden in die Liste eingefügt
          zeile = reader.readLine();
       }
 
       reader.close();
    }catch(Exception ex)
    {
       System.out.println("Konnte die Datei nicht lesen");
       ex.printStackTrace();
    }
 }
}