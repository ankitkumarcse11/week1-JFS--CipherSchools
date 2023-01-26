import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int div=sc.nextInt();
		switch(div)
		{
		case 1:
			System.out.println("YOU GOT FIRST RANK");
			break;
		case 2:
			System.out.println("You GOT SECOND RANK");
			break;
		
		case 3:
			System.out.println("You got hird rank");
			break;
			default:
				System.out.println("better luck nexttime");
		}

	}

}
