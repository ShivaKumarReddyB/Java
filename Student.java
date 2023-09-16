public class Student {
    String  name, education;
    int age;
    double grade;
    boolean employed;

    public Student (String name, int age, String education, double grade, boolean employed){
        this.name = name;
        this.age = age;
        this.education = education;
        this.grade = grade;
        this.employed = employed;
    }

    public Student (){
        System.out.println("Invoked no-argument constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    @Override
    public String toString(){
        return "Student Name: " + name + "\n Student Age: " + age + "\nStudne Education: " + education +
                "\nStudent Grade: " + grade + "\nIs Employed: " + employed;

    }

}
