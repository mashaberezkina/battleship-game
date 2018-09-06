/**
 * Created by Maria on 15.03.2018.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}

   /* int [] locationCells;
    int numOfHits = 0;
    String checkYourself(String userGuess) {
        int userGuessInt = Integer.parseInt(userGuess);
        for (int i = 0; i < locationCells.length; i++){
            if (locationCells[userGuessInt] == locationCells[i]) {
                numOfHits = numOfHits + 1;
            }
        }
    }
    void setLocationCells(int [] loc) {

    }*/


