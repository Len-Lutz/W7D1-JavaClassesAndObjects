package w7d1Homework;

public class ToDoItem implements Comparable<ToDoItem>{
    private String task;
    private int priority;
    private boolean completed;

    public ToDoItem() {
        this.task = "New ToDo Item";
        this.priority = 1;
        this.completed = false;
    }

    public ToDoItem(String task, int priority) {
        this.task = task;
        this.priority = priority;
        this.completed = false;
    }

    public ToDoItem(String task, int priority, boolean completed) {
        this.task = task;
        this.priority = priority;
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("\n{ Task: %-25s  Priority: %2d   Completed: %s }",
                task, priority, completed ? "Yes" : "No");
    }

    @Override
    public int compareTo(ToDoItem list) {
        if( priority == list.priority) {
            return 0;
        } else if (priority < list.priority) {
            return 1;
        }
        return -1;
    }
}
