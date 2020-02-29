public class LSBST {
    
    private BinarySearchTree<Entry> tree;
    private FileHelper helper;
    
    public LSBST () {
        
        tree = new BinarySearchTree<Entry>();
        helper = new FileHelper("./data/data.txt");
        
        this.addEntries();
    }
    
    private void addEntries () {
        
        while( helper.hasNextLine() ){
            tree.insert( helper.readLine() );
        }
        
    }
    
    public Entry find ( Entry other ) {
        BinaryTreeNode<Entry> result  = tree.find(other);
        return result == null ? null : result.data;
    }
    
    public Entry find ( String slot ) {
        return this.find( new Entry(slot) );
    }
    
    public String printAreas ( String stage , String day , String time) {
        return this.printAreas(stage+"_"+day+"_"+time);
    }
    
    public String printAreas ( int stage , int day , int time) {
        return this.printAreas(stage+"_"+day+"_"+time);
    }
    
    public String printAreas ( String slot ) {
        Entry entry = this.find( slot );
        
        return ( entry == null ? "No Areas Found " : "The areas are: "+entry.getAreas()+
        "\n"+
        "Operation executed after "+ tree.getCount() + " Comparison steps."
        );
    }
    
    public void printAllAreas () {
        tree.inOrder();        
    }
    
}