package baseball.domain;


public class Game {
    private boolean status = true;
    public void start(){
        while(status){
            System.out.println("Game start");
        }
    }
}
