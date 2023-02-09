package ca.concordia.processmanagement;

//#create the class PIDManager that allocates proess ID
public class PIDManager {
    // create private static int called MIN_PID
    private static int MIN_PID = 300;
    // create private static int called MAX_PID
    private static int MAX_PID = 500;
    // create private static int called pid
    private static int pid;
    // create private static int called pidArray
    private static int[] pidArray;
    // create public static int called allocate_pid
    public static int allocate_pid() {
        // create if statement that checks if pidArray is null
        if (pidArray == null) {
            // set pidArray to new int[MAX_PID - MIN_PID + 1]
            pidArray = new int[MAX_PID - MIN_PID + 1];
        }
        // create for loop that loops through pidArray
        for (int i = 0; i < pidArray.length; i++) {
            // create if statement that checks if pidArray[i] is 0
            if (pidArray[i] == 0) {
                // set pidArray[i] to 1
                pidArray[i] = 1;
                // set pid to i + MIN_PID
                pid = i + MIN_PID;
                // return pid
                return pid;
            }
        }
        // return -1
        return -1;
    }
    // create public static void called release_pid
    public static void release_pid(int pid) {
        // set pidArray[pid - MIN_PID] to 0
        pidArray[pid - MIN_PID] = 0;
    }
}