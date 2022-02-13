public class Main {
    public static void main(String[] args) {
        Course mat= new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Mahmut Hoca","532111","MAT");
        Teacher t2 = new Teacher("Fatma Ayse","532222","FZK");
        Teacher t3 = new Teacher("Ali Veli","532333","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Inek Saban",4,"123",mat,fizik,kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOpinionNote(60, 50,50); //Sozlu notlarini ekle
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Guduk Necmi",4,"234",mat,fizik,kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOpinionNote(50, 70,70);
        s2.printNote();
        s2.isPass();

        Student s3 = new Student("Hayta Ismail",4,"345",mat,fizik,kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOpinionNote(70, 70,60);
        s3.printNote();
        s3.isPass();
    }
}
