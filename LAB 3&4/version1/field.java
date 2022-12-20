package cpds;

public class field {
	   
    public static void main(String[] args) {
        flags flags = new flags();
        Thread a = new Neighbors(flags);
        Thread b = new Neighbors(flags);
        a.setName("alice");     
        b.setName("bob");
        a.start();
        b.start();
    }
}

