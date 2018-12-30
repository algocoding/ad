import java.util.*;

public class Main {

	static Integer[] A;
	static Integer[] B;	// 내림차순 정렬위해 객체 타입으로
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A = new Integer[N];
		B = new Integer[N];
		for(int i = 0; i < N; i++)		
			A[i] = sc.nextInt(); 
		for(int i = 0; i < N; i++)		
			B[i] = sc.nextInt();

		// 오름차순 정렬 수행
		Arrays.sort(A);
		// 내림차순 정렬
		Arrays.sort(B, Collections.reverseOrder());
		int sum = 0;
		for(int i = 0; i < N; i++)
			sum += A[i] * B[i];
		System.out.println(sum);
		sc.close();
	}
}