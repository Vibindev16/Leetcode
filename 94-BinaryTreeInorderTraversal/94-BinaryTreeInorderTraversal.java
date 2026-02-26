// Last updated: 2/26/2026, 9:56:49 AM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right,list);
    }
}