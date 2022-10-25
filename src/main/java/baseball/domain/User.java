package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {
    private static int MIN_NUM = 1;
    private static int MAX_NUM = 9;
    private static int NUM_LENGTH = 3;
    private static int CHECK_LENGTH = 10;
    public ArrayList<Integer> numbers;

    public void getPlayerNumber(){
        String userNumber = Console.readLine();
        checkInputLength(userNumber);
        this.numbers = parseStringToInt(userNumber);
    }
    public void checkInputLength(String userNumber){
        if (userNumber.length() > NUM_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public ArrayList<Integer> parseStringToInt(String userNumber){
        ArrayList<Integer> userNumbers = new ArrayList<>();
        for(int i=0;i<NUM_LENGTH;i++){
            int digit = Integer.parseInt(String.valueOf(userNumber.charAt(i)));
            checkInvalidDigit(digit);
            userNumbers.add(digit);
        }
        checkDuplicate(userNumbers);
        return userNumbers;
    }

    public void checkInvalidDigit(int digit){
        if (digit > MAX_NUM || digit < MIN_NUM){
            throw new IllegalArgumentException();
        }
    }
    public void checkDuplicate(ArrayList<Integer> userNumbers){
        Boolean[] check = new Boolean[CHECK_LENGTH];
        for(int number : userNumbers){
            if (check[number]){
                throw new IllegalArgumentException();
            }
            check[number] = true;
        }
    }
}
