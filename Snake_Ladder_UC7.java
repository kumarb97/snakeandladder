package snakeandladder;

public class Snake_Ladder_UC7 {
public static void main(String[] args) {
		
		int snake = 0;
		int ladder = 1;
		int points_of_plyr1 = 0;
		int points_of_plyr2 = 0;
		boolean player2 = false;
		while (points_of_plyr1 <= 100 && points_of_plyr2 <= 100)
		{
		int dice_value =( int) Math.floor(((Math.random() * 10) % 6) + 1 );
	int option = (int) Math.floor((Math.random() * 10) % 2);
			if (option == snake)
			{
				if (player2 == false)
				{
					points_of_plyr1 = points_of_plyr1 - dice_value;
					player2 = true;
				}
				else
				{
					points_of_plyr2 = points_of_plyr2 - dice_value;
					player2 = false;
				}
			}
			if (option == ladder)
			{
				if(player2 == false)
				{
					points_of_plyr1 = points_of_plyr1 + dice_value;
			}
				else
				{
					points_of_plyr2 = points_of_plyr2 + dice_value;
				}
			}
			if (points_of_plyr1 < 0)
			{
					points_of_plyr1 = 0;
			}
			if (points_of_plyr2 < 0)
			{
					points_of_plyr2 = 0;
			}
			if (points_of_plyr1 >= 100)
			{
					System.out.println("player1 won the game with points " +points_of_plyr1);
					break;
			}
			if (points_of_plyr2 >= 100)
				{
					System.out.println("player2 won the game with points " +points_of_plyr2);
					break;
				}
			}
		}

}

