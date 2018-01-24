public class Main {

    public static void main(String []args) {

        TaskList mytasklist = new TaskList();

        Task task_0 = new Task();
        mytasklist.addTask(task_0);

        Task task_1 = new Task("First description of a task");
        task_1.setTitle("First Task");
        mytasklist.addTask(task_1);

        Task task_2 = new Task("Second description of a task");
        task_2.setTitle("Second Task");
        mytasklist.addTask(task_2);

        mytasklist.printTasklist();

    }

}
