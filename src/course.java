public class course {
    String courseName;
    int StudentRegistered;
    static int TotalStudentRegistered = 0;

public course(String courseName, int StudentRegistered){
this.courseName = courseName;
this.StudentRegistered = StudentRegistered;

    TotalStudentRegistered += StudentRegistered;
}

public void displayStudentInfo(){
    System.out.println("courseName =" +courseName);
    System.out.println("StudentRegistered =" + StudentRegistered);
}

public static void main(String[] args){
    course crs1 = new course("Computer Science", 80);
    course crs2 = new course("Business and Management", 40);
    course crs3 = new course("Mathematics", 15);
    course crs4 = new course("Software Engineering", 70);

    crs1.displayStudentInfo();
    crs2.displayStudentInfo();
    crs3.displayStudentInfo();
    crs4.displayStudentInfo();

    System.out.println("TotalStudentRegistered =" +TotalStudentRegistered);
}



}