package ca.concordia.processmanagement;

import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public void createProcess() throws Exception {
        // create int called pid
        int pid = PIDManager.allocate_pid();
        // create PCB called process
        PCB process = new PCB(pid, "Running");
        // create if statement
        if (pid == -1) {
            // throw new Exception("No PID available");
            throw new Exception("No PID available");
        }
        // add process to queue
        addProcess(process);
    }
    //#implement the addProcess method that adds a process to a created queue
    public void addProcess(PCB process) {
        // create queue called queue
        Queue<PCB> queue = new LinkedList<PCB>();
        // add process to queue
        queue.add(process);
    }

    //#method to return the process id of the process that is created
    public int getPid() {
        // create int called pid
        int pid = PIDManager.allocate_pid();
        // return pid
        return pid;
    }


}
