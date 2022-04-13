package XOXGame;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Player p1 = new Player("Muhammet Emin", "Okumuş", "x");
        Player p2 = new Player("Ömer Faruk", "Okumuş", "o");
        Board board = new Board();

        try {
            playXOX(p1, p2, board);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void playXOX(Player p1, Player p2, Board board) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the spot you want to put sign in. Number between 1-9");
        int firstPlayerSpot;
        int secondPlayerSpot;
        int numberOfTurn = 0;
        while (!(isGameOver(board.getBoardArr()))) {
            System.out.println("First Player:");
            firstPlayerSpot = Integer.parseInt(scanner.nextLine());
            putSignOnBoard(p1, board.getBoardArr(), firstPlayerSpot);
            numberOfTurn++;
            if (numberOfTurn == 9){
                break;
            }
            System.out.println("Second Player:");
            secondPlayerSpot = Integer.parseInt(scanner.nextLine());
            putSignOnBoard(p2, board.getBoardArr(), secondPlayerSpot);
            numberOfTurn++;
            board.printBoard();
        }
        board.printBoard();
    }

    private static boolean isGameOver(String[][] arr) {
        boolean gameOver = false;
        for (int i = 0; i < 3; i++) {
            if (isEqual(arr[i][0], arr[i][1], arr[i][2])) {
                gameOver = true;
            } else if (isEqual(arr[0][i], arr[1][i], arr[2][i])) {
                gameOver = true;
            }
        }
        if (isEqual(arr[0][0], arr[1][1], arr[2][2])) {
            gameOver = true;
        } else if (isEqual(arr[1][2], arr[1][1], arr[2][1])) {
            gameOver = true;
        }
        return gameOver;
    }

    private static boolean isEqual(String str1, String str2, String str3) {
        return str1.equals(str2) && str1.equals(str3) && !(str1.equals(" "));
    }

    private static void putSignOnBoard(Player player, String[][] arr, int spot) throws Exception {
        String sign = player.getSign();
        switch (spot) {
            case 1:
                if (arr[0][0].equals(" ")) {
                    arr[0][0] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 2:
                if (arr[0][1].equals(" ")) {
                    arr[0][1] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 3:
                if (arr[0][2].equals(" ")) {
                    arr[0][2] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 4:
                if (arr[1][0].equals(" ")) {
                    arr[1][0] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 5:
                if (arr[1][1].equals(" ")) {
                    arr[1][1] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 6:
                if (arr[1][2].equals(" ")) {
                    arr[1][2] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 7:
                if (arr[2][0].equals(" ")) {
                    arr[2][0] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 8:
                if (arr[2][1].equals(" ")) {
                    arr[2][1] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            case 9:
                if (arr[2][2].equals(" ")) {
                    arr[2][2] = sign;
                } else{
                    throw new Exception("Spot is not empty.");
                }
                break;
            default:
                throw new Exception("Spot you entered is out of range.");

        }
    }

    private static void controlSpotEmptyOrNot(String spot, String sign) {
        if (spot.equals(" ")) {
            spot = sign;
        } else {
            System.out.println("This spot is filled.");
        }
    }


    private static void controlNumberOfTurn(int numberOfTurn, boolean isTurnsOver) {
        if (numberOfTurn == 9) {
            isTurnsOver = true;
        }
    }
}
