public class StudentDriver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj1Student = new Student();
        System.out.println("****Testing toString() method on Obj1Student****");
        System.out.println(obj1Student.toString());
        System.out.println("****Testing toString() method on Obj1Student****");
        obj1Student.setName("Hermoine");
        obj1Student.setAge(20);
        obj1Student.setEducation("UnderGrad");
        obj1Student.setGrade(3.5);
        obj1Student.setEmployed(true);
        System.out.println(obj1Student.toString());
        System.out.println("****Testing Getter methods on obj1Student****");
        System.out.println("Name of the Student: "+obj1Student.getName());
        System.out.println("Age of the Student: "+obj1Student.getAge());
        System.out.println("Education of the Student "+obj1Student.getEducation());
        System.out.println("Grade of the Student "+obj1Student.getGrade());
        System.out.println("Is Employed :"+obj1Student.isEmployed());

        Student obj2Student = new Student("Potter",25, "Graduate", 6.6, false );
        System.out.println("*****Testing toString method on obj2Student*****");
        System.out.println(obj2Student.toString());
        System.out.println("*****Testing Getter methods on obj2Student******");
        System.out.println("Name of the Student: "+obj2Student.getName());
        System.out.println("Age of the Student: "+obj2Student.getAge());
        System.out.println("Education of the Student "+obj2Student.getEducation());
        System.out.println("Grade of the Student "+obj2Student.getGrade());
        System.out.println("Is Employed :"+obj2Student.isEmployed());


    }
}
