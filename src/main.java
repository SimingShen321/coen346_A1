import ca.concordia.processmanagement.*;


public class main {
    public static void main(String args[]) throws Exception{


        System.out.println("hello");

        implementation test = new implementation();
        //test 1

        test.createProcess();
        System.out.println("Process " + test.getPID() + " created");
        test.terminateProcess(300);
        //test 2

//        int i = 0;
//        for(i = 0; i <= 300; i++)
//            test.createProcess();















    }
}
