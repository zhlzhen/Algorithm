package alg;

/**
 * @author zha
 * 把一个完全二叉树，转化为一个链表样式的结构
 */
public class LinkedListConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 首先是新建一颗二叉树 , 根据数组来创建一个完全的二叉树
		
		int[] value = {10,6,14,4,8,12,16};
		Node head = creatNode(value,1);
		
		printNode(head);

	}

	//二叉树的便利，提供中序遍历的实现
	private static void printNode(Node head) {
		System.out.print(head.value + " ");
		if(head.left != null){
			printNode(head.left);
		}
		
		if(head.right != null){
			printNode(head.right);
		}
		
	}

	//建立一颗二叉树
	static Node creatNode(int[] value,int i){
		
		Node node = new Node();
		node.value = value[i-1];
		
		if(2*i+ 1 <= value.length){
			Node right = creatNode(value, 2*i+ 1);
			node.right = right;
		}
		
		if(2*i <= value.length){
			Node left = creatNode(value, 2*i);
			node.left = left;
		}
		
		return node ;
	}
}

class Node {
	int value ;
	Node left;
	Node right;
}
