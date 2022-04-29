package project2;

public class GuessNumber {
    public static void main(String[] args) {

        Game game = new Game();
        boolean b = false;
        while (!b){
            game.takeUserInput();
            System.out.println(game.isCorrect());
        }
    }
}
