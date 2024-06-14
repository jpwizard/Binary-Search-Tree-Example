//James Panagis
package ds;
public class BinarySearchTree {
// I was about to implement the treenode inside here, but luckily I understood what was wrong, thx prof
public TreeNode root;

public BinarySearchTree () {

root = null;

}
//Implemented the inorder tree walk
public void inorder_tree_walk (TreeNode x) {

if(x!=null)

{

inorder_tree_walk (x.left);

System.out.print(x.key + " ");

inorder_tree_walk (x.right);

}

}
//Extra Credit: Implemented the peroder and postorder tree walk. Where they both visit the root node and children in different orders
public void preorder_tree_walk (TreeNode x) {

if(x!=null)

{

System.out.print(x.key + " ");

preorder_tree_walk (x.left);

preorder_tree_walk (x.right);

}

}

public void postorder_tree_walk (TreeNode x) {

if(x!=null)

{

postorder_tree_walk (x.left);

postorder_tree_walk (x.right);

System.out.print(x.key + " ");

}

}
// implemented the tree search function
public TreeNode search (TreeNode x, int k) {

if(x.key==k || x==null)

return x;

else

{

if(k < x.key)

return search(x.left,k);

else

return search(x.right,k);

}

}
// implemented the iterative search function
public TreeNode iterative_search (int k) {

TreeNode x = this.root;

while(x!=null && x.key!=k)

{

if(k<x.key)

x = x.left;

else

x = x.right;

}

return x;

}
// implemented the minimum function 
public TreeNode minimum () {

TreeNode x = this.root;

while(x.left!=null)

{

x = x.left;

}

return x;

}
// implemented the maximum function
public TreeNode maximum () {

TreeNode x = this.root;

while(x.right!=null)

{

x = x.right;

}

return x;

}
//implented succeser function
public TreeNode successor (TreeNode x) {

if(x.right!=null)

{

x = x.right;

while(x.left!=null)

{

x = x.left;

}

return x;

}

else

{

TreeNode y = x.p;

while(y!=null && x==y.right)

{

x = y;

y = y.p;

}

return y;

}

}
// implemented the insert function
public void insert (int k) {

TreeNode y = null;

TreeNode x = this.root;

TreeNode z = new TreeNode(k);

while(x!=null)

{

y = x;

if(z.key<x.key)

x = x.left;

else

x = x.right;

}

z.p = y;

if(y==null)

this.root = z;

else if(z.key<y.key)

y.left = z;

else

y.right = z;

}

/**

* @param args

*/

public static void main(String[] args) {

// TODO Auto-generated method stub

int[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};

BinarySearchTree bst;

TreeNode n;

bst = new BinarySearchTree();

for (int i = 0; i < array.length; i++)

bst.insert(array[i]);

System.out.println("Inorder_tree_walk starts ------------------");

bst.inorder_tree_walk(bst.root);

System.out.println("Inorder_tree_walk ends ------------------");

System.out.print("\n\n");

System.out.println("Search starts ------------------");

n = bst.search(bst.root, 13);

System.out.println("found: " + n.key);

System.out.println("Search ends ------------------");

System.out.print("\n\n");

System.out.println("Iterative search starts ------------------");

n = bst.iterative_search(4);

System.out.println("found: " + n.key);

System.out.println("Iterative search ends ------------------");

System.out.print("\n\n");

System.out.println("Minimum starts ------------------");

n = bst.minimum();

System.out.println("Minimum key is " + n.key);

System.out.println("Minimum ends ------------------");

System.out.print("\n\n");

System.out.println("Maximum starts ------------------");

n = bst.maximum();

System.out.println("Maximum key is " + n.key);

System.out.println("Maximum ends ------------------");

System.out.print("\n\n");

System.out.println("Successor starts ------------------");

n = bst.successor(bst.root.left.right.right);

System.out.println("Successor key is " + n.key);

System.out.println("Successor ends ------------------");

System.out.print("\n\n");

}

}







