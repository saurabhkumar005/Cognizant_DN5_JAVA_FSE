package Week1.Design_Principle_and_Pattern.FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    @Override
    public void open(){
        System.out.println("Opening Excel Document...");
    }
    

}
