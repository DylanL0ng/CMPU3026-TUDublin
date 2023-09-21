interface PublishDetails {
    public void confirmDetails();
    public void getCourseDetails();
}

public class Student extends Person implements PublishDetails {
    private int studentId;
    private String courseCode;

    static int counter = 0;

    Student(String name, char gender, String courseCode)
    {
        super(name, gender);

        counter += 1;
        this.studentId = counter;
        this.courseCode = courseCode;
    }

    public void confirmDetails()
    {
        System.out.println(toString());
    }

    public void getCourseDetails()
    {
        System.out.println(String.format("The course code is %s", this.courseCode));
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format("their student ID is %s, and their course code is %s", this.studentId, this.courseCode);
    }
}
