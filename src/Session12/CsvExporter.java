package Session12;

import java.util.List;

public interface CsvExporter{
    void exportToCsv();
}
abstract class Report{
    public String title;
    public List<String> data ;

    Report(String title , List<String> data){
        this.title = title;
        this.data= data;
    }

    public void display(){
        System.out.println("title = " + title);
    }
    public abstract void showPreview();

}
class CsvReport extends Report implements CsvExporter {

    CsvReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
        System.out.println("Preview: " + data);
    }

    @Override
    public void exportToCsv() {
        System.out.println("export");
    }
}

    interface PdfExportar{
        void exportToPdf();
        void showDetails();

    }
     class PdfReport extends Report implements PdfExportar{

        PdfReport(String title,List<String>data){
            super(title,data);
        }
        @Override
        public void showPreview(){
            System.out.println("Preview: " + data);
        }
        @Override
        public void exportToPdf(){
            System.out.println("export to pdf featuer");
        }

        @Override
        public void showDetails(){
            System.out.println("Details  : " + title +"+"+data);
        }

    }


class Main{
    public static void main(String[] args) {

        CsvReport csvReport = new CsvReport("Finance Report Table", List.of("1","2","3"));
        csvReport.display();
        csvReport.showPreview();
        csvReport.exportToCsv();

        PdfReport pdfReport = new PdfReport("Finance Manula",List.of("hader","body"));
        pdfReport.showPreview();
        pdfReport.exportToPdf();
        pdfReport.showDetails();

    }
}
