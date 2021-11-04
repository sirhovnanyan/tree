package tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new DefaultTree<>();

        tree.addNode(10);
        tree.addNode(20);
        tree.addNode(25);
        tree.addNode(10);
        tree.addNode(24);
        tree.addNode(18);
        tree.addNode(26);
        tree.addNode(16);
        tree.addNode(23);
        tree.addNode(19);

        //tree.deleteNode(15);


       // System.out.println(tree.containsNode(18));

/*        tree.addNode(new User(10, "Me"));
        tree.addNode(new User(15, "You"));
        tree.addNode(new User(20, "We"));
        tree.addNode(new User(30, "He"));
        tree.addNode(new User(26, "aa"));
        tree.addNode(new User(16, "ab"));
        tree.addNode(new User(26, "a"));
        tree.addNode(new User(9, "ac"));
        tree.addNode(new User(5, "ba"));
        tree.addNode(new User(6, "ra"));*/


        System.out.println(tree);
    }
}
