class Solution {
    private Node shubh = new Node(-1);
    private Node temp = shubh;
    public void solve(Node root) {
        // Code here
        if (root == null) {
            return;
        }
        
        solve(root.left);
        Node curr = new Node(root.data);
        temp.right = curr;
        temp = curr;
        solve(root.right);
    }
    public Node flattenBST(Node root) {
        solve(root);
        
        return shubh.right;
    }
}
