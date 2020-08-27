package Task1;

public class Pupil {
    void study (){
        System.out.print("Study ");
    }void read (){
        System.out.print("Read ");
    }void  write (){
        System.out.println("Write ");
    }void relax (){
        System.out.println("Relax ");
    }
}
class ExcelentPupipl extends Pupil{
        @Override
        void read() {
            System.out.println("Excelent read");
        }

        @Override
        void study() {
            System.out.println("Excelent study");
        }

        @Override
        void write() {
            System.out.println("Excelent write");
        }

        @Override
        void relax() {
            System.out.println("Excelent relax");
        }
}
class GoogPupil  extends  Pupil{
    @Override
    void read() {
        System.out.println("Good read");
    }

    @Override
    void study() {
        System.out.println("Good study");
    }

    @Override
    void write() {
        System.out.println("Good write");
    }

    @Override
    void relax() {
        System.out.println("Bad relax");
    }
}
class BadPupil extends Pupil{
    @Override
    void read() {
        System.out.println("Bad read");
    }

    @Override
    void study() {
        System.out.println("Bad study");
    }

    @Override
    void write() {
        System.out.println("Bad write");
    }

    @Override
    void relax() {
        System.out.println("Bad relax");
    }
}
