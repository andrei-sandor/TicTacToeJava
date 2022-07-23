import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to TIC-TAC-TOE");

        String turn = "Xturn";
        boolean noWinner = true;
        String[][] array = {{" ", " ", ""}, {" ", " ", ""}, {" ", " ", ""}};
        while(noWinner)
        {
            if(turn == "Xturn")
            {
                System.out.println("Enter a number between 0 and 8 inclusive for your position: ");
                int n = reader.nextInt();

                int row = n / 3;
                int column = n % 3;
                if (array[row][column] == "X" || (array[row][column] == "O")) {
                    System.out.println("This place is already chosen.");
                    continue;
                } else {
                    array[row][column] = "X";
                }
                if (isWin(array)) {
                    System.out.println(Arrays.deepToString(array[0]));
                    System.out.println(Arrays.deepToString(array[1]));
                    System.out.println(Arrays.deepToString(array[2]));
                    System.out.println("YOU WON!");
                    break;
                }
                System.out.println(Arrays.deepToString(array[0]));
                System.out.println(Arrays.deepToString(array[1]));
                System.out.println(Arrays.deepToString(array[2]));
                turn = "Oturn";
                if(isDraw(array))
                {
                    System.out.println("This is a draw");
                    break;
                }
            }
            else
            {
                System.out.println("Enter a number between 0 and 8 inclusive for your position: ");
                int n = reader.nextInt();

                int row = n/ 3;
                int column = n % 3;
                if (array[row][column] == "X" || (array[row][column] == "O"))
                {
                    System.out.println("This place is already chosen.");
                    continue;
                } else
                {
                    array[row][column] = "O";
                }
                if (isWin(array))
                {
                    System.out.println(Arrays.deepToString(array[0]));
                    System.out.println(Arrays.deepToString(array[1]));
                    System.out.println(Arrays.deepToString(array[2]));
                    System.out.println("YOU WON!");
                    break;
                }
                System.out.println(Arrays.deepToString(array[0]));
                System.out.println(Arrays.deepToString(array[1]));
                System.out.println(Arrays.deepToString(array[2]));
                turn = "Xturn";
                if(isDraw(array))
                {
                    System.out.println("This is a draw");
                    break;
                }
            }
        }
    }
    public static boolean isWin(String[][] array){
        if( array[0][0] == "X" && array[0][1] == "X" && array[0][2] == "X")
        {
         return true;
        }
        if( array[1][0] == "X" && array[1][1] == "X" && array[1][2] == "X")
        {
            return true;
        }
        if( array[2][0] == "X" && array[2][1] == "X" && array[2][2] == "X")
        {
            return true;
        }
        if( array[0][0] == "X" && array[1][0] == "X" && array[2][0] == "X")
        {
            return true;
        }
        if( array[0][1] == "X" && array[1][1] == "X" && array[2][1] == "X")
        {
            return true;
        }
        if( array[0][2] == "X" && array[1][2] == "X" && array[2][2] == "X")
        {
            return true;
        }
        if( array[0][0] == "X" && array[1][1] == "X" && array[2][2] == "X")
        {
            return true;
        }
        if( array[0][2] == "X" && array[1][1] == "X" && array[2][0] == "X")
        {
            return true;
        }
        if( array[0][0] == "O" && array[0][1] == "O" && array[0][2] == "O")
        {
            return true;
        }
        if( array[1][0] == "O" && array[1][1] == "O" && array[1][2] == "O")
        {
            return true;
        }
        if( array[2][0] == "O" && array[2][1] == "O" && array[2][2] == "O")
        {
            return true;
        }
        if( array[0][0] == "O" && array[1][0] == "O" && array[2][0] == "O")
        {
            return true;
        }
        if( array[0][1] == "O" && array[1][1] == "O" && array[2][1] == "O")
        {
            return true;
        }
        if( array[0][2] == "O" && array[1][2] == "O" && array[2][2] == "O")
        {
            return true;
        }
        if( array[0][0] == "O" && array[1][1] == "O" && array[2][2] == "O")
        {
            return true;
        }
        if( array[0][2] == "O" && array[1][1] == "O" && array[2][0] == "O")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isDraw(String[][] array)
    {
        if((array[0][0].equals("X") || array[0][0].equals("O")) &&
            (array[0][1].equals("X") || array[0][1].equals("O")) &&
            (array[0][2].equals("X") || array[0][2].equals("O")) &&
            (array[1][0].equals("X") || array[1][0].equals("O")) &&
            (array[1][1].equals("X") || array[1][1].equals("O")) &&
            (array[1][2].equals("X") || array[1][2].equals("O")) &&
            (array[2][0].equals("X") || array[2][0].equals("O")) &&
            (array[2][1].equals("X") || array[2][1].equals("O")) &&
            (array[2][2].equals("X") || array[2][2].equals("O")) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
