package Practice;

class Student {

    private int id;
    private String firstname;
    private String lastName;

    public Student(int sid,String sname,String slname)
    {
        id = sid;
        firstname = sname;
        lastName = slname;
    }

    
    @Override
    public String toString() {
        return "Student{id =" + id + ", name='" + firstname + "'}";
    }
    
    public class ToStringMethod {
        public static void main(String[] args) {
            Student s = new Student(1, "sreenu", "polukanti");
            System.out.println(s);
        }
    }

}