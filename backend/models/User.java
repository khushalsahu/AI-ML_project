public class User {

    // Attributes
    private int userId;
    private String name;
    private String email;
    private int age;


    // Constructor
    public User(int userId, String name, String email, int age) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.age = age;
    }


    // Getters

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    // Setters

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // toString()

    @Override
    public String toString() {
        return "User ID : " + userId +
                "\nName : " + name +
                "\nEmail : " + email +
                "\nAge : " + age;
    }

}
