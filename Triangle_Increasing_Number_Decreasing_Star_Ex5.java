//Output
5 * * * * * 
4 5 * * * * 
3 4 5 * * * 
2 3 4 5 * * 
1 2 3 4 5 * 
//

public class Triangle_Increasing_Number_Decreasing_Star_Ex5 {

	public static void main(String[] args) 
	{ 
		for (int row = 5;row>=1;row--)
		{
			for(int col = row; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			for(int star = 1; star <= row; star++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}