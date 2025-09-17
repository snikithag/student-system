public class Student {
    public static void main(String[] args) {
        System.out.println("Student system: starting...");
        Marks m = new Marks();
        Attendence a = new Attendence();
        Login l = new Login();
        m.showMarks();
        a.showAttendence();
        l.doLogin();
        System.out.println("Done");
    }
}
