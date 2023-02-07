package ca.concordia.processmanagement;

public interface Operations {
    public int createProcess() throws Exception;

    public int getProcessId() throws Exception;

    public void addProcess(PCB process) throws Exception;

    public void terminateProcess(int pid) throws Exception;


}
