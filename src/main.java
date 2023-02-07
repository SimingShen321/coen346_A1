import ca.concordia.processmanagement.*;


public class main {
    public static void main(String args[]) throws Exception{
        implementation createProcess = new implementation();
        createProcess.createProcess();
        //#print process Id
        System.out.println("Process Id: " + createProcess.getPid());



    }
}
