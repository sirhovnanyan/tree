package tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree=new DefaultTree<>();

        tree.addNode(20);
        tree.addNode(15);
        tree.addNode(25);
        tree.addNode(10);
        tree.addNode(24);
        tree.addNode(18);
        tree.addNode(26);
        tree.addNode(16);
        tree.addNode(23);
        tree.addNode(19);

        tree.deleteNode(15);

        System.out.println(tree);
    }
}
