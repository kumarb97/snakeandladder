package snakeandladder;

public class Snake_Ladder_UC5 {
public static void main(String[] args) {
		
		int snake = 0;
		int ladder = 1;
		int points = 0;
		int temp = 100;
		while (points <= 100)
		{
		int dice_value =( int) Math.floor(((Math.random() * 10) % 6) + 1 );
	int option = (int) Math.floor((Math.random() * 10) % 2);
			if (option == snake && points > 0 )
			{
				points = points - dice_value;	
			}
			if (option == ladder && dice_value<=temp)
			{
				points = points + dice_value;
				temp = 100 - points;
			}
			if (points < 0)
			{
				points = 0;
				System.out.println("Restarted");
			}
			if (points == 100)
			{
				System.out.println("you won with points " +points);
				break;
			}
		}

}
}
