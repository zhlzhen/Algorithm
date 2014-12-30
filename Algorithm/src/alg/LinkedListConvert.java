package alg;

/**
 * @author zha
 * ��һ����ȫ��������ת��Ϊһ��������ʽ�Ľṹ
 */
public class LinkedListConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������½�һ�Ŷ����� , ��������������һ����ȫ�Ķ�����
		
		int[] value = {10,6,14,4,8,12,16};
		Node head = creatNode(value,1);
		
		printNode(head);

	}

	//�������ı������ṩ���������ʵ��
	private static void printNode(Node head) {
		System.out.print(head.value + " ");
		if(head.left != null){
			printNode(head.left);
		}
		
		if(head.right != null){
			printNode(head.right);
		}
		
	}

	//����һ�Ŷ�����
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
