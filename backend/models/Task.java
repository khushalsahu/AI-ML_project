public class Task {

    // Attributes

    private int taskId;
    private int userId;
    private String title;
    private String description;
    private String deadline;
    private String priority;
    private String status;


    // Constructor

    public Task(int taskId,
                int userId,
                String title,
                String description,
                String deadline,
                String priority,
                String status) {

        this.taskId = taskId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.status = status;
    }


    // Getters

    public int getTaskId() {
        return taskId;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }


    // Setters

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // toString()

    @Override
    public String toString() {
        return "Task ID : " + taskId +
                "\nUser ID : " + userId +
                "\nTitle : " + title +
                "\nDescription : " + description +
                "\nDeadline : " + deadline +
                "\nPriority : " + priority +
                "\nStatus : " + status;
    }

}
