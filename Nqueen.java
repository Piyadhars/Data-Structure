import java.util.*;
public class Nqueen {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of queens: ");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=0;
            }
        }
        Solve s=new Solve(n);
        if (s.backtrack(a, 0) != true) {
			System.out.print("Solution does not exist");
		}
        else{
            s.print(a);
        }
        in.close();
    }
}
class Solve{
    int m;
    Solve(int m)
    {
        this.m=m;
    }
    boolean backtrack(int board[][], int col)
	{
		if (col >= m)
			return true;
		for (int i = 0; i < m; i++) {
			if (isSafe(board, i, col)) {
				board[i][col] = 1;
				if (backtrack(board, col + 1) == true)
					return true;

				board[i][col] = 0;
			}
		}
		return false;
	}
    boolean isSafe(int board[][], int row, int col)
	{
		int i, j;

		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;
		for (i = row, j = col; j >= 0 && i < m; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}
    void print(int board[][])
	{
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(" " + board[i][j]+ " ");
			System.out.println();
		}
	}
}