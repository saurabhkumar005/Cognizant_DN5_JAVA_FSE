package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}
