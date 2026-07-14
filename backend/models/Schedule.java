public class Schedule {

    // Attributes

    private int scheduleId;
    private int userId;
    private String title;
    private String scheduleDate;
    private String scheduleTime;
    private String duration;


    // Constructor

    public Schedule(int scheduleId,
                    int userId,
                    String title,
                    String scheduleDate,
                    String scheduleTime,
                    String duration) {

        this.scheduleId = scheduleId;
        this.userId = userId;
        this.title = title;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = scheduleTime;
        this.duration = duration;
    }


    // Getters

    public int getScheduleId() {
        return scheduleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public String getDuration() {
        return duration;
    }


    // Setters

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    // toString()

    @Override
    public String toString() {
        return "Schedule ID : " + scheduleId +
                "\nUser ID : " + userId +
                "\nTitle : " + title +
                "\nSchedule Date : " + scheduleDate +
                "\nSchedule Time : " + scheduleTime +
                "\nDuration : " + duration;
    }

}
