package ca.concordia.processmanagement;

//#create class called PCB that contains the PID and process state
public class PCB {
    // create private int called pid
    private int pid;
    // create private String called processState
    private String processState;
    // create public constructor called PCB
    public PCB(int pid, String processState) {
        // set this.pid to pid
        this.pid = pid;
        // set this.processState to processState
        this.processState = processState;
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
    // create public String called getProcessState
    public String getProcessState() {
        // return processState
        return processState;
    }
    // create public void called setProcessState
    public void setProcessState(String processState) {
        // set this.processState to processState
        this.processState = processState;
    }
    // create public String called toString
    public String toString() {
        // return "PCB [pid=" + pid + ", processState=" + processState + "]";
        return "PCB [pid=" + pid + ", processState=" + processState + "]";
    }
}