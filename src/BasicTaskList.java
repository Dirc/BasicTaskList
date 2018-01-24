public class BasicTaskList {

    public static void main(String []args) {
        System.out.println("BasicTaskList");

        Task task_1 = new Task("first task");
        task_1.setDescription("First description of a task");

        task_1.printTask();
    }
}
