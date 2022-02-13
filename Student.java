public class Student {
    String name,studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name,int classes,String studentNo,Course mat,Course fizik, Course kimya){
        this.name=name;
        this.classes=classes;
        this.studentNo=studentNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.isPass=false;
    }

    public void calcAverage(){
        double matWeight=0.0;
        double fizikWeight=0.0;
        double kimyaWeight=0.0;

        matWeight=(this.mat.note *0.8) + (this.mat.opinionNote*0.2);
        fizikWeight=(this.fizik.note*0.8) +(this.fizik.opinionNote*0.2);
        kimyaWeight=(this.kimya.note*0.8) + (this.kimya.opinionNote*0.2);

        this.average=(matWeight+fizikWeight+kimyaWeight)/3.0;
        /* this.average=(((this.fizik.note *0.80)+(this.fizik.opinionNote * 0.20))+
                ((this.mat.note * 0.80)+(this.mat.opinionNote *0.20))+
                ((this.kimya.note* 0.80)+(this.kimya.opinionNote *0.20))) / 3.0;
        */
       // System.out.println(this.name + " Mat:" + matWeight + " Fizik:"+fizikWeight + " Kimya:"+kimyaWeight);
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average>55;
    }

    public void isPass(){
        if(this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0 ||
                this.mat.opinionNote==0 || this.fizik.opinionNote==0||this.kimya.opinionNote==0)
        {
            System.out.println("Notlar tam olarak girilmemis...");
        }else{
            this.isPass=this.isCheckPass();
           // printNote();
            System.out.println("Ortalama : " + this.average);
            if(this.isPass){
                System.out.println("Sinifi gecti.");
            }else{
                System.out.println("Sinifta kaldi...");
            }
        }
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik notu : " + this.mat.note);
        System.out.println("Matematik Sozlu notu : " + this.mat.opinionNote);

        System.out.println("Fizik notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu notu : " + this.fizik.opinionNote);

        System.out.println("Kimya notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu notu : " + this.kimya.opinionNote);
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkOpinionNote(int mat,int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.opinionNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.opinionNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.opinionNote = kimya;
        }
    }
}
