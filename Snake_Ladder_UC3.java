package snakeandladder;

public class Snake_Ladder_UC3 {
public static void main(String[] args) {
	
	int dice = (int) Math.floor(((Math.random() * 10) % 6) + 1 );
	System.out.println("dice value is " +dice);
	int no_play = 0;
	int snake = 1;
	int option = (int) Math.floor((Math.random() * 10) % 3);
	
	if (option == no_play)
	{
		System.out.println("player will stay in same position");
	}
	else if (option == snake)
	{
		System.out.println("Player moves ahead by " +dice);
	}
	else
	{
		System.out.println("Player moves behind by " +dice);
	}
}
}
