import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode rigth;

    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.rigth = right;
    }
}



public class PreorderTraversal {
    
    public List<Integer> preorder(TreeNode root){
        ArrayList<Integer> ls = new ArrayList<>();
        preordertraversal(root, ls);
        return ls;
    }

/*************  ✨ Windsurf Command ⭐  *************/
    /**
     * Performs a preorder traversal of the given binary tree rooted at {@code node},
     * adding the values of each visited node to {@code ls}.
     *
     * @param node the root node of the binary tree to traverse
     * @param ls the list to which the values of visited nodes will be added
     */
/*******  f083097b-f1ff-47ed-b911-749e03f9da12  *******/
    private void preordertraversal(TreeNode node, ArrayList<Integer> ls){
        if(node == null){
            return;
        }
        ls.add(node.val);
        preordertraversal(node.left,ls);
        preordertraversal(node.rigth, ls);

    }
}
