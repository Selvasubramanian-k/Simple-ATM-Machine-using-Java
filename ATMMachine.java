import java.util.Scanner;
class ATMMachine
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int balance=10000;
		int withdraw,deposite;
		while(true)
		{
			System.out.println("Automatic Teller Machine");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposite");
			System.out.println("choose 3 to check balance");
			System.out.println("choose 4 to exit");
			System.out.println("And your choice is: ");
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("enter amount to be withdraw: ");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("and your balance is: "+balance);
				}
				else
				{
					System.out.println("inefficient balance");
				}
				System.out.println("");
				break;

				case 2:System.out.println("enter amount to be deposite: ");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("and your balance is: "+balance);
				System.out.println("");
				break;

				case 3:System.out.println("your balance is: "+balance);
				System.out.println("");
				break;
			
				case 4:System.exit(0);
				System.out.println("");
				break;
			}
		}
	}
}
			
				
