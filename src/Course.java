public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int oralGrade;
    double oralGradeCoef;

    Course(String name, String code, String prefix, double oralGradeCoef) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralGrade = 0;
        this.oralGradeCoef = oralGradeCoef;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {

            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor.");
        }

    }
    void printTeacherInfo() {
        this.teacher.printTeacher();
    }
}
