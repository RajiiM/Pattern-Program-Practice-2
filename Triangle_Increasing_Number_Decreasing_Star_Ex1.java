//Output
1 * * * * * 
1 2 * * * * 
1 2 3 * * * 
1 2 3 4 * * 
1 2 3 4 5 * 

public class Triangle_Increasing_Number_Decreasing_Star_Ex1 {

	public static void main(String[] args) 
	{
		for (int row = 1; row <= 5; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print(col + " ");
			}
			for (int star = 1; star<=6-row; star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}