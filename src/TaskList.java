public class TaskList {

    /*
    # MVP:
    addTask
    printTaskList

    # v 1.0
    removeTask
    shuffleTasks

    # v 1.1
    prioritizeTasks
    finishTask
     */

    // Fields
    Task [] tasklist;
    int taskCounter;

    // Constructor
    TaskList() {
        this.taskCounter = 0;
        // Initialize the tasklist array
        this.tasklist = new Task[10];
    }

    // Methods
    public void addTask(Task task) {
        tasklist[taskCounter] = task;
        taskCounter++;
    }

    public void printTasklist() {
        System.out.println( "BasicTaskList: " );
        for( int i = 0; i < this.taskCounter; i++){
            System.out.println("\n");
            this.tasklist[i].printTask();
        }
    }

}
