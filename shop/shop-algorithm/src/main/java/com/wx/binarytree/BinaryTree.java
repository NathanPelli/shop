package com.wx.binarytree;

import sun.reflect.generics.tree.Tree;

/**
 * 二叉树的链式存储
 * Created By 002764
 * on 2018/10/9 15:55
 */
public class BinaryTree {
    private TreeNode root = null;
    public BinaryTree(){
        root = new TreeNode(1,"rootNode(A)");
    }

    /**
     *
     * @param root 创建一颗二叉树
     */
    public void createBinaryTree(TreeNode root){
        TreeNode newNodeB = new TreeNode(2,"B");
        TreeNode newNodeC = new TreeNode(3,"C");
        TreeNode newNodeD = new TreeNode(4,"D");
        TreeNode newNodeE = new TreeNode(5,"E");
        TreeNode newNodeF = new TreeNode(6,"F");

        root.leftChild = newNodeB;
        root.rightChild = newNodeC;

        newNodeB.leftChild = newNodeD;
        newNodeB.rightChild = newNodeE;

        newNodeC.rightChild = newNodeF;

    }

    public boolean isEmpty(TreeNode root){
        return root == null;
    }

    public int height(){
        return height(root);
    }

    public int size(){
        return size(root);
    }

    public TreeNode parent(TreeNode element){
        return (root==null|| root==element)?null:parent(root, element);
    }

    public TreeNode parent(TreeNode subTree,TreeNode element) {
        if(subTree == null){
            return null;
        }
        if(subTree.leftChild == element || subTree.rightChild == element){
            return subTree;
        }
        TreeNode p;
        //先到左子树中找,如果找不到才到右子树中去找
        if((p = parent(subTree.leftChild,element)) != null){
            return p;
        }else{
            //递归在右子树中搜索
            return parent(subTree.rightChild,element);
        }
    }

    public void destroy(TreeNode subTree){
        if(subTree != null){
            destroy(subTree.leftChild);
            destroy(subTree.rightChild);
            subTree = null;
        }
    }

    public void traverse(TreeNode subTree){
        System.out.println("key:"+subTree.key+"--name:"+subTree.data);
        traverse(subTree.leftChild);
        traverse(subTree.rightChild);
    }

    /**
     * 前序遍历
     * @param subTree
     */
    private void preOrder(TreeNode subTree){
        if(subTree != null){
            visited(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    /**
     * 中序遍历
     * @param subTree
     */
    private void inOrder(TreeNode subTree){
        if(subTree != null){
            inOrder(subTree.leftChild);
            visited(subTree);
            inOrder(subTree.rightChild);
        }
    }

    private void postOrder(TreeNode subTree){
        if(subTree != null){
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visited(subTree);
        }
    }

    public void visited(TreeNode subTree){
        subTree.isVisited = true;
        System.out.println("key:"+subTree.key+"--name:"+subTree.data);
    }
        /**
         *
         * @param subTree
         * @return
         * 获取树的高度
         */
    private int height(TreeNode subTree){
        if(subTree == null){
            //递归结束,空树的高度为0
            return 0;
        }else{
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);
            return i>j?(i+1):(j+1);
        }
    }

    /**
     *
     * @param subTree
     * @return
     * 获取树的节点数量
     */
    private int size(TreeNode subTree){
        if(subTree == null){
            return 0;
        }else{
            return 1+size(subTree.leftChild) + size(subTree.rightChild);
        }
    }

    private class TreeNode{
        private int key = 0;
        private String data = null;
        private boolean isVisited = false;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        public TreeNode(){

        }


        /**
         *
         * @param key  层序编码
         * @param data 数据域
         */
        public TreeNode(int key,String data){
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree(bt.root);
        System.out.println("the size of the tree is " + bt.size());
        System.out.println("the height of the tree is " + bt.height());
        System.out.println("*******(前序遍历)[ABDECF]遍历*****************");
        bt.preOrder(bt.root);
        System.out.println("*******(中序遍历)[DBEACF]遍历*****************");
        bt.inOrder(bt.root);
        System.out.println("*******(后序遍历)[DEBFCA]遍历*****************");
        bt.postOrder(bt.root);

    }
}

