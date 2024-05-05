package factories;

import models.NullDocument;
import models.PdfDocument;
import models.WordDocument;
import interfaces.Document;

public class DocumentFactory {
    private Document document;
    public Document createDocument(String type) {

        if(type.equalsIgnoreCase("word")) {
            document = new WordDocument();
        }

        else if(type.equalsIgnoreCase("pdf")) {
            document = new PdfDocument();
        }

        else {
            document = new NullDocument();
        }

        return document;
    }
}
