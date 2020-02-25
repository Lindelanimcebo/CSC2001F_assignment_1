public class LSArrayApp{
    
    public static void main(String [] args){
        
        LSArray array = new LSArray();
        
        int length = args.length;
        
        if ( length == 0 ) {
            array.printAllAreas();
        }
        else if ( length == 3){
            array.printAreas( args[0], args[1], args[2] );
        }
        else {
            System.out.println("Invalid arguments to main function");
        }
    }
}