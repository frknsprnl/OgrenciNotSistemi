public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "555 111 22 33", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "111 222 33 44", "FZK");
        Teacher t3 = new Teacher("Ali Nesin", "000 000 11 22", "MAT");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "202", "FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik", "303", "MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Furkan", "1911012054", "3", tarih, fizik, matematik);
        s1.printStudent();
        s1.addBulkExamNote(100, 50, 100);
        s1.isPass();

        Student s2 = new Student("Sergen", "1911012055", "3", tarih, fizik, matematik);
        s2.printStudent();
        s2.addBulkExamNote(90,80,70);
        s2.isPass();

    }
}
