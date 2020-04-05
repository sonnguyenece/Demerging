public class Student {
    private boolean gender;
    private String birth;

    Student() {
    }

    Student(boolean gender, String birth) {
        this.gender = gender;
        this.birth = birth;
    }

    public String getBirth() {
        return birth;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGender() {
        if (gender) return "male";
        else return "female";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
