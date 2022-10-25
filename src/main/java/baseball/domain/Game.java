package baseball.domain;


public class Game {
    private static String GAME_START = "GAME START";
    private boolean status = true;
    private Computer computer;
    private User user;
    public Game(){
        this.computer= new Computer();
        this.user = new User();
    }
    public void start(){
        while(status){
            System.out.println(GAME_START);
            computer.createThreeRandomNumbers();

        }
    }
}
