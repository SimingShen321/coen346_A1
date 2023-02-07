package ca.concordia.processmanagement;

public class PCB {
    // create private int called pid
    private int pid;
    // create private String called status
    private String status;
    // create public ProcessControl constructor
    public PCB(int pid, String status) {
        // set this.pid to pid
        this.pid = pid;
        // set this.status to status
        this.status = status;
    }
    // create public int called getPid
    public int getPid() {
        // return pid
        return pid;
    }
    // create public void called setPid
    public void setPid(int pid) {
        // set this.pid to pid
        this.pid = pid;
    }
    // create public String called getStatus
    public String getStatus() {
        // return status
        return status;
    }
    // create public void called setStatus
    public void setStatus(String status) {
        // set this.status to status
        this.status = status;
    }
}
