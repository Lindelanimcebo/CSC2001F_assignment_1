
public class LSArray{


    private Entry [] array;
    private FileHelper handler;
    private int counter;
        
    public LSArray(){
        this.array = new Entry[3000];
        this.handler = new FileHelper( "./data/data.txt" );
        counter = 0;
        
        this.addEntries();
    }

    private void addEntries () {
        int i = 0;
        while ( handler.hasNextLine() && i < 3000) {
            array[i++] = handler.readLine();        
        }
    }
    
    public Entry findEntry ( int stage, int day, int startTime ) {
        
        for ( Entry entry : array){
            if (entry != null) {
            
                this.counter++; //counting comparison operations
                
                if ( entry.equals( stage, day, startTime ) ){
                    return entry;
                }
            }
        }
        return null;
    }
    
    public String printAreas ( String stage, String day, String startTime ) {
        return this.printAreas( Integer.parseInt(stage), Integer.parseInt(day), Integer.parseInt(startTime) );
    }
    
    public String printAreas ( int stage, int day, int startTime) {
    
        Entry tmp = this.findEntry( stage, day, startTime );
        
        return ( tmp == null ? "Areas not found" : "The Areas are : "+tmp.getAreas() +
        "\n"+ 
        "This operation was completed after "+this.counter+" comparison operations."
        );
    }
    
    public void printAllAreas () {
        for ( Entry entry : array) {
            if (entry != null)
                System.out.println(entry);
        }
    }

}