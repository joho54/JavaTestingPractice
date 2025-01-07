class Document{
    static int count = 0;
    String name;

    public Document(){
        this("Unnamed" + ++count);
    }

    public Document(String name){
        this.name = name;
        System.out.printf("Document %s has been created", this.name);
        System.out.println();
    }
}

public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document("hoho");
        Document d4 = new Document();
    }
}
