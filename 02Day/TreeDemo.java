import java.util.*;

public class TreeDemo {
	static int[] L = new int[100];	// ���� �ڽ�
	static int[] R = new int[100];	// ������ �ڽ�
	static int[] P = new int[100];	// �θ�	
	static int V, E;	// ����, ������	
	
	public static void bfsWithQ(int v)
	{
		System.out.println("Ʈ���� �ʺ�켱Ž��_Queue<>> ");
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(v);
		
		while(!Q.isEmpty())
		{
			v = Q.remove();
			System.out.printf("%d ", v);
			if(L[v] != 0) Q.add(L[v]);
			if(R[v] != 0) Q.add(R[v]);
		}
	}
	public static void bfs(int v)
	{
		System.out.println("Ʈ���� �ʺ�켱Ž��> ");
		int[] Q = new int[100];
		int front = -1, rear = -1;
		
		Q[++rear] = v;
		while(front != rear)
		{
			v = Q[++front];
			System.out.printf("%d ", v);
			if(L[v] != 0) Q[++rear] = L[v];
			if(R[v] != 0) Q[++rear] = R[v];
		}
	}
	public static int treeSize(int v)
	{
		if(v == 0) return 0;
		int size = 1;
		size += treeSize(L[v]);
		size += treeSize(R[v]);
		
		return size;
	}
	public static int treeHeight(int v)
	{
		if(v == 0) return -1;
		
		int lh = treeHeight(L[v]);
		int rh = treeHeight(R[v]);
		
		return lh > rh? lh + 1: rh + 1;
	}
	
	public static void inorder(int v)
	{
		if(v == 0) return;
	
		inorder(L[v]);
		System.out.printf("%d ", v);
		inorder(R[v]);		
	
	}
	
	public static void main(String[] args)	{		
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		
		int parent, child;
		for(int i = 0; i < E; i++)
		{
			parent = sc.nextInt();
			child = sc.nextInt();
			if(L[parent] == 0) L[parent] = child;
			else R[parent] = child;
			P[child] = parent;			
		}
		sc.close();
		
		inorder(1); System.out.print('\n');		
		
		System.out.printf("Ʈ���� ���� = %d\n", TreeDemo.treeHeight(1));
		System.out.printf("Ʈ���� ũ�� = %d\n", TreeDemo.treeSize(1));
		
		bfs(1); System.out.print('\n');
		bfsWithQ(1); System.out.print('\n');
	}
}
