package solution;

import java.math.BigInteger;
import java.util.Scanner;

public class ThreeNPlusOneProblemSolver {
    public static void main(String[]args){
        Scanner userInputScanner = new Scanner(System.in);
        BigInteger usersInt;
        while(true){
            System.out.println("Please type a number for the computer to process, or hit \"Enter\" to finish.");
            String userInput = userInputScanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            try{
                usersInt = getBigIntFromUser(userInput);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                continue;
            }
            processUsers3NPlus1Problem(usersInt);
        }

        System.out.println("Goodbye. Thanks for using the program!");
    }

    public static BigInteger getBigIntFromUser(String userInput) throws IllegalArgumentException{

        BigInteger usersInt;
        try {
            usersInt = new BigInteger(userInput);
        }catch (NumberFormatException exception){
            throw new IllegalArgumentException("You entered at least one character that was not an integer.");
        }
        if(usersInt.signum()==-1||usersInt.signum()==0){
            throw new IllegalArgumentException("The 3N + 1 solution process only works for integers greater than 0.");
        }
        return usersInt;

    }

    public static void processUsers3NPlus1Problem (BigInteger intToSolve){
        BigInteger three = BigInteger.valueOf(3);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        long iterationCounter = 0;

        while (!intToSolve.equals(BigInteger.ONE)){
            if(intToSolve.testBit(0)){
                intToSolve = intToSolve.multiply(three);
                intToSolve = intToSolve.add(one);
            }else{
                intToSolve = intToSolve.divide(two);
            }
            iterationCounter++;
            String intString = intToSolve.toString();
            System.out.println(intString);
        }
        System.out.println("The 3N+1 process iterated " + iterationCounter + " times.");
    }

}
