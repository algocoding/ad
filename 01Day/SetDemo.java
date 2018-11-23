// ������ ��Ʈ ǥ�� �� ���� ����

public class SetDemo {

	public static void printBits(String str, int set)
	{
		for(int i = str.length() - 1; i >= 0; i--)
		{
			if( (set & (1 << i)) != 0) 
				System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}	
	
	public static void main(String[] args) {
		
		String str = new String("ABCDEFGH");				
		int U = 0xff;		
		System.out.print("��ü����> "); printBits(str, U);
		
		int A = 0x2D, B = 0x65;
		
		System.out.print("A  ����> "); printBits(str, A);		
		System.out.print("B  ����> "); printBits(str, B);
		System.out.print("A ������> "); printBits(str, ~A);
		System.out.print("A|B������> "); printBits(str, A|B);
		System.out.print("A&B������> "); printBits(str, A&B);
		System.out.print("A-B������> "); printBits(str, A & ~B);
	}
}