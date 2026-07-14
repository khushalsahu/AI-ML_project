-- USERS TABLE

CREATE TABLE Users (
    user_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    age INT CHECK (age > 0)
);



-- TASKS TABLE

CREATE TABLE Tasks (
    task_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,

    title VARCHAR(100) NOT NULL,
    description TEXT,
    deadline DATE,
    priority VARCHAR(10)
        CHECK (priority IN ('HIGH', 'MEDIUM', 'LOW')),

    status VARCHAR(15)
        CHECK (status IN ('PENDING', 'IN_PROGRESS', 'COMPLETED')),

    FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
);



-- HABITS TABLE

CREATE TABLE Habits (
    habit_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,

    habit_name VARCHAR(100) NOT NULL,
    target_days INT CHECK (target_days > 0),
    current_streak INT DEFAULT 0,

    status VARCHAR(15)
        CHECK (status IN ('ACTIVE', 'PAUSED', 'COMPLETED')),

    FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
);



-- SCHEDULE TABLE

CREATE TABLE Schedule (
    schedule_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,

    title VARCHAR(100) NOT NULL,
    schedule_date DATE,
    schedule_time TIME,
    duration VARCHAR(50),

    FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
);



-- PRODUCTIVITY ANALYTICS TABLE

CREATE TABLE Productivity_Analytics (
    analytics_id SERIAL PRIMARY KEY,
    user_id INT UNIQUE NOT NULL,

    tasks_completed INT DEFAULT 0,

    habit_completion_rate DOUBLE PRECISION
        CHECK (
            habit_completion_rate >= 0
            AND habit_completion_rate <= 100
        ),

    weekly_productivity_score INT
        CHECK (
            weekly_productivity_score >= 0
            AND weekly_productivity_score <= 100
        ),

    monthly_productivity_score INT
        CHECK (
            monthly_productivity_score >= 0
            AND monthly_productivity_score <= 100
        ),

    FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
);
