public class Habit {

    // Attributes

    private int habitId;
    private int userId;
    private String habitName;
    private int targetDays;
    private int currentStreak;
    private String status;


    // Constructor

    public Habit(int habitId,
                 int userId,
                 String habitName,
                 int targetDays,
                 int currentStreak,
                 String status) {

        this.habitId = habitId;
        this.userId = userId;
        this.habitName = habitName;
        this.targetDays = targetDays;
        this.currentStreak = currentStreak;
        this.status = status;
    }


    // Getters

    public int getHabitId() {
        return habitId;
    }

    public int getUserId() {
        return userId;
    }

    public String getHabitName() {
        return habitName;
    }

    public int getTargetDays() {
        return targetDays;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public String getStatus() {
        return status;
    }


    // Setters

    public void setHabitId(int habitId) {
        this.habitId = habitId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public void setTargetDays(int targetDays) {
        this.targetDays = targetDays;
    }

    public void setCurrentStreak(int currentStreak) {
        this.currentStreak = currentStreak;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // toString()

    @Override
    public String toString() {
        return "Habit ID : " + habitId +
                "\nUser ID : " + userId +
                "\nHabit Name : " + habitName +
                "\nTarget Days : " + targetDays +
                "\nCurrent Streak : " + currentStreak +
                "\nStatus : " + status;
    }

}
