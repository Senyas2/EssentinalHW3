package Task3;

public class DocumetWorker {
   void openDocument (){
       System.out.println("Документ открыт");
    }
    void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }
    void saveDocument () {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}
class ProDocumentWorker extends DocumetWorker{
    void editDocument() {
        System.out.println("Документ отредактирован");
    }


    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
class ExpertDocumentWorker extends ProDocumentWorker{

    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
