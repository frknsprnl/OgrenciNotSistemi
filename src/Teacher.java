public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {

        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    void printTeacher() {
        System.out.println("Name \t: " + this.name);
        System.out.println("Phone \t: " + this.mpno);
        System.out.println("Branch \t: " + this.branch + "\n");

    }
}
