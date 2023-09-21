public class Person {
    private String name;
    private char gender;

    Person(String name, char gender)
    {
        setName(name);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        switch (gender) {
            case 'M':
            case 'F':
            case 'U':
                this.gender = gender;
                break;
            default:
                System.out.println("ERROR: The gender entered was incorrect, please use either 'M', 'F', or 'U'");
        }
    }

    @Override
    public String toString() {
        String genderLabel = "";

        switch (gender) {
            case 'M':
                genderLabel = "Male";
                break;
            case 'F':
                genderLabel = "Female";
                break;
            case 'U':
                genderLabel = "Unknown";
                break;
        }

        return String.format("This person's name is %s, and they are %s, ", this.name, genderLabel);
    }
}
