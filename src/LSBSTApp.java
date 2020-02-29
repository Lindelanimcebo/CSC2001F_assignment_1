public class LSBSTApp {
    
    public static void main ( String [] args ) {
        
        LSBST tree = new LSBST();
        
        int length = args.length;
        
        if ( length == 0 ) {
            tree.printAllAreas();
        }
        else if ( length == 3){
            System.out.println( tree.printAreas( args[0], args[1], args[2] ) );
        }
        else {
            System.out.println("Invalid arguments to main function");
        }
       
        
    }
    
}