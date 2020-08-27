package Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ключ Продукта:");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int a = 123;//key pro
        int b = 321;//key Expert
        if (key == a){
            ProDocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        }else if (key == b){
            ExpertDocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        }else {
            DocumetWorker doc = new DocumetWorker();
            doc.openDocument();
            doc.editDocument();
            doc.saveDocument();
        }
    }
}
