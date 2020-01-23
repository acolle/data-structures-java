package binarysearchtree;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();
        System.out.println();

        System.out.println(tree.get(30));
        System.out.println(tree.get(33));

        System.out.println(tree.min());
        System.out.println(tree.max());

        tree.delete(15); // case 2
        tree.delete(17); // case 1
        tree.delete(25); // case 3

        tree.traversePreOrder();
        System.out.println();
        
        tree.traversePostOrder();
        System.out.println();
    }
}
