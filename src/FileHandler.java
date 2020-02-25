import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler{
    
    File file;
    Scanner scanner;
    
    public FileHandler ( String file) {
     
        try {
            this.file = new File(file);
            this.scanner = new Scanner(this.file);
            
        } catch (Exception e) {
            System.out.println("Error Reading the file: ");
            e.printStackTrace();        
        }
        
    }
    
    public boolean hasNextLine(){
        return scanner.hasNextLine();
    }
    
    public Entry readLine(){
     
        String line = scanner.nextLine();
        int index = line.lastIndexOf("_")+3; 
        String slot = (line.substring(0, index)).trim();
        String areas = (line.substring(index)).trim();
        
        return new Entry( slot , areas );
    }
    
    public void setFile( String file){
       this.file = new File(file); 
    }
    
    public String getFile(){
        return file.getName();
    }
    
    public void printFile () {
        System.out.println("File : "+this.getFile());
        while( scanner.hasNextLine() ) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
        System.out.println("**************DONE************");    
    }
    
    public String toString(){
        return this.getFile();
    }
    
}