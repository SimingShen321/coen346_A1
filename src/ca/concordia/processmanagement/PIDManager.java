package ca.concordia.processmanagement;

public class PIDManager {
    // create private static final int called MIN_PID
    private static final int MIN_PID = 300;
    // create private static final int called MAX_PID
    private static final int MAX_PID = 500;
    // create private static int array called pid
    private static int[] pid;
    // create public static int called allocate_map
    public static int allocate_map() {
        // create int called size
        int size = MAX_PID - MIN_PID;
        // create int array called pid
        pid = new int[size];
        // create for loop
        for (int i = 0; i < size; i++) {
            // set pid[i] to 0
            pid[i] = 0;
        }
        // return 1
        return 1;
    }
    // create public static int called allocate_pid
    public static int allocate_pid() {
        // create for loop
        for (int i = 0; i < pid.length; i++) {
            // create if statement
            if (pid[i] == 0) {
                // set pid[i] to 1
                pid[i] = 1;
                // return i + MIN_PID
                return i + MIN_PID;
            }
        }
        // return -1
        return -1;
    }
    // create public static void called release_pid
    public static void release_pid(int pid) {
        // set pid[pid - MIN_PID] to 0
        PIDManager.pid[pid - MIN_PID] = 0;
    }
}
