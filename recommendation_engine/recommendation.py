"""
AI Productivity OS

Python Recommendation Engine.

Generates productivity recommendations
based on productivity metrics.
"""

# AI Productivity OS
# Productivity Recommendation Engine


def generate_recommendations(tasks_completed,
                             habit_completion_rate,
                             weekly_score,
                             monthly_score):

    print("\n======================================")
    print("AI PRODUCTIVITY RECOMMENDATIONS")
    print("======================================\n")


    # Productivity Analysis

    if weekly_score >= 90:
        print("Excellent Productivity!\n")

    elif weekly_score >= 70:
        print("Good Productivity!\n")

    else:
        print("Productivity Needs Improvement.\n")


    # Recommendations

    print("Suggestions:\n")


    # Task Analysis

    if tasks_completed < 20:
        print("- Complete more pending tasks.")
    else:
        print("- Great job completing your tasks.")


    # Habit Analysis

    if habit_completion_rate < 70:
        print("- Improve your habit consistency.")
    else:
        print("- Maintain your current habit streak.")


    # Weekly Productivity

    if weekly_score < 80:
        print("- Focus on improving your weekly productivity.")
    else:
        print("- Maintain your weekly productivity score.")


    # Monthly Productivity

    if monthly_score < 80:
        print("- Set realistic monthly goals.")
    else:
        print("- Continue your excellent monthly performance.")


    print("\n======================================")



# User Input


tasks_completed = int(input("Enter Tasks Completed : "))

habit_completion_rate = float(
    input("Enter Habit Completion Rate (0-100) : ")
)

weekly_score = int(
    input("Enter Weekly Productivity Score (0-100) : ")
)

monthly_score = int(
    input("Enter Monthly Productivity Score (0-100) : ")
)



# Function Call


generate_recommendations(
    tasks_completed,
    habit_completion_rate,
    weekly_score,
    monthly_score
)
