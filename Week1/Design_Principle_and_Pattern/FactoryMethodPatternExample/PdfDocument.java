package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }

}