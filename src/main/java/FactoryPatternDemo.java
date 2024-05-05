import factories.DocumentFactory;
import interfaces.Document;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Document document = documentFactory.createDocument(getDocumentType());
        document.display();
    }
    private static String getDocumentType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select document type (word/pdf): ");
        return scanner.nextLine();
    }
}
