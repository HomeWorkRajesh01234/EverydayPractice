package EgPackage;

public class NamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter Rows: ");
		//row=s.nextInt();
		
		//P
		/*for(i=0;i< 7;i++)
		{
			for(j=0; j< 5; j++)
			{
				if((j == 0) || (j == 4 && i == 2) || (j == 4 && i == 1) ||( i == 0 && j  != 4)||(i == 3 && j < 4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		//U
		System.out.print("\n");
		for(i=0;i< 6;i++)
		{
			for(j=0; j< 5; j++)
			{
				if((j==0 && i<5)||(j>0 && i==5 && j < 4) || (j==4 && i<5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		*/
		//N
		System.out.print("\n");
		for(i=0;i< 5;i++)
		{
			for(j=0; j< 5; j++)
			{
				if((j==0)||(j==4)||(i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		//A
		System.out.print("\n");
		for(i=0;i< 5;i++)
		{
			for(j=0; j< 5; j++)
			{
				if((j==0 && i>0)||(j==4 && i>0)||(j==1 && i==2)||(j==2 && i==2)||(j==3 && i==2)||(j==1 && i==0)||(j==3 && i==0)||(j==2 && i==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		//M
		System.out.print("\n");
		for(i=0;i< 6;i++)
		{
			for(j=0; j< 5; j++)
			{
				if((j==0)||(j==4)||(j==1 && i==1)||(j==1 && i==2) || (j==2 && i==3)||(j==3 && i==2)||(j==3 && i==1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}