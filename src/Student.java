public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void printStudent(){
        System.out.println("Ogrenci adi: " + this.name);
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void addOralExamNote(int oral1, int oral2, int oral3){
        if (oral1 >= 0 && oral1 <= 100) {
            this.c1.oralGrade = oral1;
        }

        if (oral2 >= 0 && oral2 <= 100) {
            this.c2.oralGrade = oral2;
        }

        if (oral3 >= 0 && oral3 <= 100) {
            this.c3.oralGrade = oral3;
        }
    }
    void isPass(){
        this.average = (((this.c1.note * (1 - this.c1.oralGradeCoef)) + (this.c1.oralGrade * this.c1.oralGradeCoef))
                + ((this.c2.note * (1 - this.c2.oralGradeCoef)) + (this.c2.oralGrade * this.c2.oralGradeCoef))
                + ((this.c3.note * (1 - this.c3.oralGradeCoef)) + (this.c3.oralGrade * this.c3.oralGradeCoef))) / 3.0;
        printNote();
        if (this.average >= 55){
            System.out.println("\nSinifi basariyla gectiniz!\n");
            this.isPass = true;
        } else {
            System.out.println("\nSeneye gorusuruz. :(\n");
        }

    }

    void printNote() {
        System.out.println("================================");
        System.out.println(c1.name + " Notu : " + this.c1.note + "\t\t\tSozlu Notu: " + this.c1.oralGrade + "\t\tSozlu Notun Ortalamaya Etkisi: " + (this.c1.oralGrade * this.c1.oralGradeCoef));
        System.out.println(c2.name + " Notu : " + this.c2.note + "\t\t\tSozlu Notu: " + this.c2.oralGrade + "\t\tSozlu Notun Ortalamaya Etkisi: " + (this.c2.oralGrade * this.c2.oralGradeCoef));
        System.out.println(c3.name + " Notu : " + this.c3.note + "\t\tSozlu Notu: " + this.c3.oralGrade + "\t\tSozlu Notun Ortalamaya Etkisi: " + (this.c3.oralGrade * this.c3.oralGradeCoef));
        System.out.println("Ortalamaniz: " + String.format("%.2f",this.average));


    }


}
