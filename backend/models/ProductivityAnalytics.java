public class ProductivityAnalytics {

    // Attributes

    private int analyticsId;
    private int userId;
    private int tasksCompleted;
    private double habitCompletionRate;
    private int weeklyProductivityScore;
    private int monthlyProductivityScore;


    // Constructor

    public ProductivityAnalytics(int analyticsId,
                                 int userId,
                                 int tasksCompleted,
                                 double habitCompletionRate,
                                 int weeklyProductivityScore,
                                 int monthlyProductivityScore) {

        this.analyticsId = analyticsId;
        this.userId = userId;
        this.tasksCompleted = tasksCompleted;
        this.habitCompletionRate = habitCompletionRate;
        this.weeklyProductivityScore = weeklyProductivityScore;
        this.monthlyProductivityScore = monthlyProductivityScore;
    }


    // Getters

    public int getAnalyticsId() {
        return analyticsId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public double getHabitCompletionRate() {
        return habitCompletionRate;
    }

    public int getWeeklyProductivityScore() {
        return weeklyProductivityScore;
    }

    public int getMonthlyProductivityScore() {
        return monthlyProductivityScore;
    }


    // Setters

    public void setAnalyticsId(int analyticsId) {
        this.analyticsId = analyticsId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public void setHabitCompletionRate(double habitCompletionRate) {
        this.habitCompletionRate = habitCompletionRate;
    }

    public void setWeeklyProductivityScore(int weeklyProductivityScore) {
        this.weeklyProductivityScore = weeklyProductivityScore;
    }

    public void setMonthlyProductivityScore(int monthlyProductivityScore) {
        this.monthlyProductivityScore = monthlyProductivityScore;
    }


    // toString()

    @Override
    public String toString() {

        return "Analytics ID : " + analyticsId +
                "\nUser ID : " + userId +
                "\nTasks Completed : " + tasksCompleted +
                "\nHabit Completion Rate : " + habitCompletionRate +
                "\nWeekly Productivity Score : " + weeklyProductivityScore +
                "\nMonthly Productivity Score : " + monthlyProductivityScore;
    }

}
