
/**
* This is a model class to store the array
* @author Lindelani Mbatha
*/
public class LSArray{


    private Entry [] array;
    private FileHelper handler;
    
    private int insertCounter;
    private int comparisonCounter;
    
    /**
    * Constructor initialises instance variables
    * @param file is a String of the file pasth
    * @see #addEntries()
    */    
    public LSArray( String file ){
        this.array = new Entry[3000];
        this.handler = new FileHelper( file );
        
        comparisonCounter = 0;
        insertCounter = 0;
        
        this.addEntries();
    }
    
    /**
    * Helper method to add entries to the array 
    */
    private void addEntries () {
        int i = 0;
        while ( handler.hasNextLine() && i < 3000) {
            array[i++] = handler.readLine();        
        }
    }
    
    /**
    * Helper method to find areas of a specific slot
    * @param stage is the string stage
    * @param day is the string day
    * @param startTime is the string start time
    * @return an <code> Entry </code> object with the found results, or null of not found
    */
    public Entry findEntry ( String stage, String day, String startTime ) {
        
        for ( Entry entry : array){
            if (entry != null) {
            
                this.comparisonCounter++; //counting comparison operations
                
                if ( entry.equals( stage, day, startTime ) ){
                    return entry;
                }
            }
        }
        return null;
    }
    
    /**
    * Prints areas of a specif slot
    * @param stage is the stage string
    * @param day is the string day
    * @param startTime is the string start time
    * @returns a <code> String </code> with the results
    */    
    public String printAreas ( String stage, String day, String startTime) {
    
        Entry tmp = this.findEntry( stage, day, startTime );
        
        return ( tmp == null ? "Areas not found" : "The Areas are : "+tmp.getAreas() +
        "\n"+ 
        "insert\tfind"+
        "\n"+
        ( (this.insertCounter) + "\t" + (this.comparisonCounter) )
        );
    }
    
    /**
    * void function to print all areas
    */
    public void printAllAreas () {
        for ( Entry entry : array) {
            if (entry != null)
                System.out.println(entry);
        }
    }

} 