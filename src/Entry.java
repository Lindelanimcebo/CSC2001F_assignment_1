public class Entry{

    private String slot;
    private String areas;
    
    private int stage;
    private int day;
    private int startTime;
    
    public Entry(String slot, String areas) {
        this.slot = slot;
        this.areas = areas;
        
        this.splitSlot();
            
    }
    
    private void splitSlot() {
        int index = this.slot.indexOf("_");
        int lastIndex = this.slot.lastIndexOf("_");
        this.stage = Integer.parseInt(this.slot.substring( 0, index).trim());
        this.day = Integer.parseInt(this.slot.substring( index+1 , lastIndex ).trim());
        this.startTime = Integer.parseInt(this.slot.substring( lastIndex+1 ).trim());    
    }
    
    public boolean isSlot ( String slot ) {
        return this.slot.equals(slot); // comparison
    }
    
    public boolean equals ( int stage, int day, int startTime) {
        return (stage == this.stage && day == this.day && startTime == this.startTime); //comparison
    }

    public boolean isDay( int day ) {
        return (this.day == day);	//comparison
    }
    
    public String getAreas () {
        return areas;
    }
        
    public String toString() {
        return "Slot " + slot + "\n" + "Areas : " + areas;
    }

}