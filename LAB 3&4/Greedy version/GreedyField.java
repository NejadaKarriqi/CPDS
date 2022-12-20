
public class GreedyField {
 
     
    public static void main(String[] args) {
        flags flags = new flags();
        Thread a = new GreedyNeighbor(flags);
        Thread b = new GreedyNeighbor(flags);
        // Set the names of the neighbors and start the threads
        a.setName("alice");
        b.setName("bob");
        a.start();
        b.start();
    }
}
