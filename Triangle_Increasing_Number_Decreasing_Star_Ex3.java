//Output
5 * * * * * 
4 4 * * * * 
3 3 3 * * * 
2 2 2 2 * * 
1 1 1 1 1 * 

public class Triangle_Increasing_Number_Decreasing_Star_Ex3 {

	public static void main(String[] args) 
	{
		for (int row = 5; row >= 1; row--) 
		{
			for (int col = 5; col >= row; col--) 
			{
				System.out.print(row + " ");
			}
			for (int star = 1; star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
