package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
