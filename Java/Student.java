public class Student extends User {
    String matric_no = "bhu/21/04/09/0034";
    String admission_no = "youarecorrect";

    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered all courses";
        }
    }

    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 9As, 1Bs and 1D";
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Simon-Anyebe Josiah";
        student.password = "Intruders14";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
