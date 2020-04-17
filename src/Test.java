public class Test {
    public static void main(String[] args) {
        Tree numbers = new Tree();
        numbers.insert(45);
        numbers.insert(60);
        numbers.insert(8);
        numbers.insert(71);
        numbers.insert(22);
        numbers.insert(14);
        numbers.insert(66);
        numbers.postOrder();
    }
}
