public class LSArray{

    Entry [] array;
    FileHandler handler;
        
    public LSArray(){
        this.array = new Entry[3000];
        this.handler = new FileHandler( "./data/data.txt" );
        
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
                if ( entry.equals( stage, day, startTime ) ){
                    return entry;
                }
            }
        }
        return null;
    }
    
    public void printAreas ( String stage, String day, String startTime ) {
        this.printAreas( Integer.parseInt(stage), Integer.parseInt(day), Integer.parseInt(startTime) );
    }
    
    public void printAreas ( int stage, int day, int startTime) {
        Entry tmp = this.findEntry( stage, day, startTime );
        System.out.println( tmp == null ? "Areas not found" : "The Areas are : "+tmp.getAreas() );
    }
    
    public void printAllAreas () {
        for ( Entry entry : array) {
            if (entry != null)
                System.out.println(entry);
        }
    }

}