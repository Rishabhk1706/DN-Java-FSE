package FactoryMethodPatternExample;

public abstract class DocumentFactory{

    // Factory Method
    public abstract Document createDocument();

    public void displayDocument(){
        Document document = createDocument();
        document.open();
    }
}