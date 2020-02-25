
public class Test{
    
    public static void main ( String [] args ) {
        System.out.println("Testing");
        
        FileHandler handler = new FileHandler("./data/data.txt");
     
        Entry [] arr = new Entry[100];
        
        System.out.println("hi");
        
        int i = 0;
        while ( handler.hasNextLine() && i < 100) {
            System.out.println(i);
            arr[i++] = handler.readLine();
            System.out.println(arr[i-1]);
            
            
        }
        System.out.println("Done Testing");
    }
    
}
