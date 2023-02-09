package ca.concordia.processmanagement;

public interface Operations {
    public void createProcess() throws Exception;

    public int getProcessId();

    public void addProcess(PCB process);

    public void terminateProcess(int pid) throws Exception;

}
