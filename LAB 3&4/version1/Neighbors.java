package cpds;

public class Neighbors extends Thread {
    private flags flags;    // Flags object which will control the flag raising. It is passed as a parameter in the constructor
     
    public Neighbors(flags flags) {
        this.flags = flags;
    }
     
    public void run() {
        while (true) {
            try {
                String name = Thread.currentThread().getName(); 
                System.out.println("try again, my name is: "+ name);
                Thread.sleep((int)(200*Math.random()));
                flags.set_true(name);   // Set the corresponding flag to True before trying to enter
                if (!flags.query_flag(name)) {  
                    System.out.println(name + " enters");
                    Thread.sleep(400);
                    System.out.println(name + " exits");
                }
                Thread.sleep((int)(200*Math.random()));
                flags.set_false(name);      
            }catch (InterruptedException e) {};
        }
    }
}

