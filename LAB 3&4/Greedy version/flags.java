public class flags {
    
    private boolean flag_alice;
    private boolean flag_bob;
     
    public flags() {
        flag_alice = false;
        flag_bob = false;
    }
     
    public synchronized boolean query_flag(String s) {
        if(s.equals("alice")) return flag_bob;
        return flag_alice;
    }
     
    
    public synchronized void set_true(String s) {
        //no synchronization needed
        if (s.equals("alice")){
            flag_alice = true;
        }else
            flag_bob = true;
    }
     
    public synchronized void set_false(String s) {
        if (s.equals("alice")){
            flag_alice = false;
        }else
            flag_bob = false;
    }
}

