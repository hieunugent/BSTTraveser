import java.util.List;

class BSTTraveser{
  public static List<Integer> inOrderTraveser(BST tree, List<Integer> array){
    // left root right
    if(tree.left != null) inOrderTraveser(tree.left, array);
    array.add(tree.value);
    if(tree.right != null) inOrderTraveser(tree.right, array);

  }
  public static List<Integer> preOrderTraveser(BST tree, List<Integer> array){
    // root left right
    array.add(tree.value);
    if(tree.left != null) preOrderTraveser(tree.left, array);
    if(tree.right != null) preOrderTraveser(tree.right, array);
  }
  public static List<Integer> postOrderTraveser(BST tree, List<Integer> array){
    //left right root
    if(tree.left != null) postOrderTraveser(tree.left, array);
    if(tree.right != null) postOrderTraveser(tree.right, array);
    array.add(tree.value);
  }
  static  class BST{
    public int value;
    public BST left;
    public BST right;
    public BST(int value){
       this.value = value;
    }
  }
}
