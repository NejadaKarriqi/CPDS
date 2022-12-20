public class GreedyNeighbor extends Thread {
    private flags flags;    // Flags object which will control the flag raising. It is passed as a parameter in the constructor
     
    public GreedyNeighbor(flags flags) {
        this.flags = flags;
    }
     
    public void run() {
        while (true) {
            try {
                String name = Thread.currentThread().getName(); 
                System.out.println("try again, my name is: "+ name);
                flags.set_true(name);   
                Thread.sleep((int)(200*Math.random()));
                if (!flags.query_flag(name)) {  
                    System.out.println(name + " enters");
                    Thread.sleep(400);
                    System.out.println(name + " exits");
                }
                Thread.sleep((int)(200*Math.random()));
                flags.set_false(name);    // Either when it exits the field or if it the other flag is risen, lower the flag
            }catch (InterruptedException e) {};
        }
    }
}

