package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Integer> threeRandomNumbers;
    public void createThreeRandomNumbers(){
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        while(randomNumbers.size()!=3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if( checkOverlap(randomNumbers,randomNumber)){
                randomNumbers.add(randomNumber);
            }
        }
        threeRandomNumbers = randomNumbers;
    }
    public boolean checkOverlap(ArrayList<Integer> numbers,Integer randomNumber){
        for(int i : numbers){
            if (i == randomNumber){
                return false;
            }
        }
        return true;
    }
}
