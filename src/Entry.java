public class Entry{

    private String slot;
    private String areas;
    
    private int stage;
    private int day;
    private int start_time;
    
    public Entry(String slot, String areas) {
        this.slot = slot;
        this.areas = areas;
        
        this.splitSlot();
            
    }
    
    private void splitSlot() {
        int index = this.slot.indexOf("_");
        this.stage = Integer.parseInt(this.slot.substring( 0, index).trim());
        this.day = Integer.parseInt(this.slot.substring( index+1 , index + 3 ).trim());
        this.start_time = Integer.parseInt(this.slot.substring( index+4).trim());    
    }
    
    public boolean isSlot( String slot ) {
        return this.slot.equals(slot); // comparison
    }

    public boolean isDay( int day ) {
        return (this.day == day);	//comparison
    }
        
    public String toString() {
        return "Slot " + slot + "\n" + "Areas : " + areas;
    }

}