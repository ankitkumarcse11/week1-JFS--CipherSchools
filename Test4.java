import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//how long is your burp
		Scanner sc=new Scanner(System.in);
		System.out.println("how long is your burp");
		int burpLen=sc.nextInt();
		String msg="";
		for(int i=0;i<burpLen;i++)
		{
			msg=msg+'r';
		}
		System.out.print("Bu"+msg+"p");
	}

}
