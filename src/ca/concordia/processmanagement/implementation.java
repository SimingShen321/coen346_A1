package ca.concordia.processmanagement;

import java.util.LinkedList;
import java.util.Queue;

public class implementation implements Operations{
    @Override
    public void createProcess() throws Exception{
        PCB process = new PCB(PIDManager.allocate_pid(), "Running");
        addProcess(process);
        System.out.println("Process " + process.getPid() + " created");

    }

    @Override
    public int getProcessId() {
        return 0;
    }

    @Override
    public void addProcess(PCB process) {
        Queue<PCB> queue = new LinkedList<PCB>();
        queue.add(process);
    }

    @Override
    public void terminateProcess(int pid) throws Exception {
        if (pid == 0) {
            throw new Exception("Process not found");
        }
        else {
            PIDManager.release_pid(pid);
            System.out.println("Process ID " + pid + " is terminated");
        }

    }

}


