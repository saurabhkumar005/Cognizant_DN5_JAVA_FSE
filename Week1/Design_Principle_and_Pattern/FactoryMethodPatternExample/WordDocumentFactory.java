package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}