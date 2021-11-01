package tree;

public interface Tree<T> {
    void addNode(T value);

    void deleteNode(T value);

    boolean containsNode(T value);

    interface TreeNode<T> {

        T getValue();

        TreeNode<T> getLeft();

        TreeNode<T> getRight();

        void setLeft(TreeNode<T> left);

        void setRight(TreeNode<T> right);
    }
}
