
public class ArrayDemo {
	static int N = 4;
	static int M = 5;
	// ��켱
	static int[][] arr1 = {{ 1,  2,  3,  4,  5}, 
	                 { 6,  7,  8,  9, 10}, 
					 {11, 12, 13, 14, 15}, 
					 {16, 17, 18, 19, 20}, 
					 {21, 22, 23, 24, 25}};
	// ���켱
	static int[][] arr2 = {{1,  6, 11, 16, 21}, 
			         {2,  7, 12, 17, 22},
					 {3,  8, 13, 18, 23},
					 {4,  9, 14, 19, 24},
					 {5, 10, 15, 20, 25}};
	// �������
	static int[][] arr3 = {{ 1,  2,  3,  4,  5}, 
	                 {10,  9,  8,  7,  6}, 
					 {11, 12, 13, 14, 15}, 
					 {20, 19, 18, 17, 16},
					 {21, 22, 23, 24, 25}};
	// �밢
	static int[][] arr4 = {{ 1,  2,  4,  7, 11},
			  		{ 3,  5,  8, 12, 15},
			  		{ 6,  9, 13, 16, 18},
			  		{10, 14, 17, 19, 20}};

	static void RowFirstSearch(int arr[][])
	{
	    for(int i = 0; i < N; i++) {
	        for(int j = 0; j < M; j++) {
	            System.out.printf("%2d ", arr[i][j]);
	        }
	    }
	    System.out.println();
	}
	static void ColFirstSearch(int arr[][])
	{
	    for(int i = 0; i < N; i++) 
		{
	        for(int j = 0; j < M; j++) 
			{
	        	System.out.printf("%2d ", arr[j][i]);
	        }
	    }
	    System.out.println();
	}
	static void zigzagSearch(int arr[][])
	{
	    for(int i = 0; i < N; i++) {
	        if((i & 1) == 0)				// ¦����
			{	
	        	for(int j = 0; j < M; j++)
	            	System.out.printf("%2d ", arr[i][j]);	            
	        }else{							// Ȧ����
	        	for(int j = M - 1; j >= 0; j--)
	            	System.out.printf("%2d ", arr[i][j]);
	        }
	    }
	    System.out.println();
	}

	static void diagonalSearch(int arr[][])
	{
	    for(int diag = 0; diag < N + M - 1; diag++)
	    {	// �밢�� ���� = ��ũ�� + ��ũ�� - 1
	        // x,y: �밢 ȭ��ǥ ���� ��ǥ
	        int x = diag < M ? 0: (diag - M + 1);
	        int y = diag < M ? diag: M - 1;

	        while(x < N && y >= 0)
	        {
	        	System.out.printf("%2d ", arr[x][y]);
	            x++; y--;
	        }
	    }
	    System.out.println();
	}
	static void deltaSearch(int arr[][])
	{
	    int dx[] = {0, 0, 1, -1};// ��, ��, ��, ��
	    int dy[] = {1, -1, 0, 0};

	    for(int x = 0; x < N; x++)
	    for(int y = 0; y < M; y++){
	        // ��ǥ ����
	        for(int i = 0; i < 4; i++)
			{
	            int tx = x + dx[i];
	            int ty = y + dy[i];
	            // tx, ty�� ���� �۾� ����
	        }
	    }
	}
	static void RectSearch(int arr[][], int n)
	{
	    // x,y: ���� ��ǥ, n: Ž�� ���� ũ��
	    for(int x = 0; x <= N - n; x++)
	    for(int y = 0; y <= N - n; y++)
		{

	        for(int i = x; i < x + n; i++)
	        for(int j = y; j < y + n; j++)
			{
	            //���ϴ� �۾� ����           
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		RowFirstSearch(arr1);
	    ColFirstSearch(arr2);
	    zigzagSearch(arr3);
	    diagonalSearch(arr4);
	    
	    //deltaSearch(arr1);
	    //RectSearch(arr1, 3);
	}
}
