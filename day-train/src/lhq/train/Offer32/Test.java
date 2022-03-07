package lhq.train.Offer32;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public int[] levelOrder1(TreeNode root) {

        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){
            {
                add(root);
            }
        };
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null){
            queue.add(root);
        }
        List<List<Integer>> ans = new ArrayList<>();
        while(! queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(temp);
        }
        return ans;
    }


    public List<List<Integer>> levelOrder3(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null){
            queue.add(root);
        }
        List<List<Integer>> ans = new ArrayList<>();
        while(! queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(ans.size() % 2 == 0){
                    temp.addLast(node.val);
                }else {
                    temp.addFirst(node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
