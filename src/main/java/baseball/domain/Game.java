package baseball.domain;


public class Game {
    private static String GAME_START = "GAME START";
    private boolean status = true;
    private Computer computer;
    public Game(){
        this.computer= new Computer();
    }
    public void start(){
        while(status){
            System.out.println(GAME_START);
            computer.createThreeRandomNumbers();
            System.out.println(computer.threeRandomNumbers);
        }
    }
}
