public class SmartDeliveryTest {
    public static void main(String[] args){
        SmartBox<Document> documentBox = new SmartBox<>();
        documentBox.addItem(new Document("Contract.pdf"));
        System.out.println(documentBox.getItem());

        SmartBox<Electronic> electronicBox = new SmartBox<>();
        electronicBox.addItem(new Electronic("iPad Pro"));
        System.out.println(electronicBox.getItem());

        printBoxItem(documentBox);
        printBoxItem(electronicBox);
    }
    // Wildcard method
    public static void printBoxItem(SmartBox<? extends Object> box){
        System.out.println("Wildcard item: " + box.getItem());
    }
    //? extends Object means the method accepts any subtype of Object, which includes all classes.
}
