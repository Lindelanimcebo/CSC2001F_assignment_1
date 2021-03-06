import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

/**
* Array application main class
* 
* @author Lindelani Mbatha
*/
public class LSArrayApp{
    
    /**
    * application main method
    * @param <code> String [] <code> args can either be empty or 3 spaced 1-2 digit numbers.
    * and the third param speceifies the file to search on
    */
    public static void main(String [] args){
        
        int length = args.length;
        
        String file_name = length == 4 ? args[3] : "./data/data.txt";
                
        Logger logger = Logger.getLogger(LSArrayApp.class.getName());
        FileHandler fh;
        
        try {

            fh = new FileHandler("./logs/logs.txt");
            logger.addHandler( fh );
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter( formatter );
            
        } catch ( IOException e ) {
            e.printStackTrace();
        }
         
        LSArray array = new LSArray( file_name );    
                
        if ( length == 0 ) {
            array.printAllAreas();
        }
        else if ( length == 3 || length == 4 ){
            logger.info( array.printAreas( args[0], args[1], args[2] ) );
        }
        else {
            System.out.println("Invalid arguments to main function");
        }
    }
}