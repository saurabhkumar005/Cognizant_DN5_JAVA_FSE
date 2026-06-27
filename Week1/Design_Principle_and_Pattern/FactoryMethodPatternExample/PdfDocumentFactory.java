package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
