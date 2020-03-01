import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class LSBSTApp {
    
    public static void main ( String [] args ) {
    
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

        
        LSBST tree = new LSBST();
        
        int length = args.length;
        
        if ( length == 0 ) {
            tree.printAllAreas();
        }
        else if ( length == 3){
            logger.info( tree.printAreas( args[0], args[1], args[2] ) );
        }
        else {
            System.out.println("Invalid arguments to main function");
        }
       
        
    }
    
}