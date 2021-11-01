package tree;

public class DefaultTree<T extends Comparable<T>> implements Tree<T> {

    private  TreeNode<T> root;

    @Override
    public void addNode(T value) {
        root=addNode(root,value);
    }

    @Override
    public void deleteNode(T value) {
        root=deleteNode(root,value);
    }

    @Override
    public boolean containsNode(T value) {
        return containsNode(root,value);
    }

    private boolean containsNode(TreeNode<T> currentNode,T value){
        if(currentNode==null){
            return false;
        }
        int comparisonResult=currentNode.getValue().compareTo(value);
        if(comparisonResult==0){
            return true;
        }
        return comparisonResult>0
                ? containsNode(currentNode.getLeft(),value)
                : containsNode(currentNode.getLeft(),value);
    }

    private TreeNode<T> addNode(TreeNode<T> currentNode,T value){
        if(currentNode==null){
            currentNode=new DefaultTreeNode<>(value);
        }
        else if(currentNode.getValue().compareTo(value)>0){
            currentNode.setLeft(addNode(currentNode.getLeft(),value));
        }
        else if(currentNode.getValue().compareTo(value)<0){
            currentNode.setRight(addNode(currentNode.getRight(),value));
        }
        return currentNode;
    }

    private TreeNode<T> deleteNode(TreeNode<T> currentNode,T value){
        if(currentNode==null){
            return null;
        }

        if(currentNode.getValue().compareTo(value)<0){
            currentNode.setRight(deleteNode(currentNode.getRight(),value));
            return currentNode;
        }

        if(currentNode.getValue().compareTo(value)>0){
            currentNode.setLeft(deleteNode(currentNode.getLeft(),value));
            return currentNode;
        }

        if(currentNode.getLeft()==null && currentNode.getRight()==null){
            return null;
        }

        if(currentNode.getRight()==null){
            return currentNode.getLeft();
        }

        if(currentNode.getLeft()==null){
            return currentNode.getRight();
        }

        T smallestValue = findSmallestValue(currentNode.getRight());

        TreeNode<T> nextNode = new DefaultTreeNode<>(smallestValue);
        nextNode.setLeft(currentNode.getLeft());
        nextNode.setRight(deleteNode(currentNode.getRight(), smallestValue));

        return nextNode;
    }

    private T findSmallestValue(TreeNode<T> node) {
        return node.getLeft() == null ? node.getValue() : findSmallestValue(node.getLeft());
    }

    private static class DefaultTreeNode<T> implements TreeNode<T>{
        private final T value;

        private TreeNode<T> left;

        private TreeNode<T> right;

        public DefaultTreeNode(T value) {
            this.value=value;
        }

        @Override
        public T getValue() {
            return value;
        }

        @Override
        public TreeNode<T> getLeft() {
            return left;
        }

        @Override
        public TreeNode<T> getRight() {
            return right;
        }

        @Override
        public void setLeft(TreeNode<T> left) {
            this.left=left;
        }

        @Override
        public void setRight(TreeNode<T> right) {
            this.right=right;
        }
    }
}
