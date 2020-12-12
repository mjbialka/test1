package p45;

import java.util.Random;

public class p45 {

	public static void main(String[] args) {
		Random random=new Random();
		int tab[][] = new int[2][3];
		
		int licznik = 0;
		for (int i = 0; i<2; i++)
		{	
			for (int j = 0; j<3;j++)
			{
				tab[i][j]=random.nextInt(100)+1;
				System.out.print(tab[i][j] + " ");
				if (tab[i][j]%2==0)
					licznik++;
			}
			System.out.println();
			
		}
		System.out.print("liczb parzystych jest = " + licznik);
		
		
	}

}
