public class App {
    
    public static void main(String[] args) throws Exception {
        
        // Person p1 = new Person("Dylan", 'M');
        // Person p2 = new Person("Mart", 'L');

        Student p3 = new Student("Mart", 'F', "TU856");
        Student p2 = new Student("Fart", 'M', "TU856");

        // System.out.println(p1.toString());
        // System.out.println(p2.toString());

        // System.out.println(p3.toString());
        // System.out.println();
        // System.out.println();

        // p3.confirmDetails();
        // p3.getCourseDetails();

        // System.out.println(p3 instanceof Person);
        // System.out.println(p3 instanceof Student);
        // System.out.println(p3 instanceof PublishDetails);

        p3.confirmDetails();
        p2.confirmDetails();
    }
}
