import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int computerchoices=r.nextInt(20);
		System.out.println("random"+computerchoices);
		//Guess the number
	
		
		for(int i=1;i<6;i++)
		{
			System.out.println("Guess the number betwwen 0 and 20");
			int userchoice=sc.nextInt();
			if(userchoice>computerchoices)
			{
				System.out.println("You guess is to heigh");
			}
			else if(userchoice<computerchoices)
			{
				System.out.println("Your guess is to low");
			}
			else {
				System.out.println("You win");
				break;
			}
		}
		

	}

}
