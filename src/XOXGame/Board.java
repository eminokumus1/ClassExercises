package XOXGame;

public class Board {
    private String[][] boardArr = new String[3][3];

    public Board(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                boardArr[i][j] = " ";
            }
        }
    }

    public void printBoard(){
        System.out.println("------------");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+ boardArr[i][j]  );
            }
            System.out.println(" |");
            System.out.println("------------");
        }
    }

    public String[][] getBoardArr() {
        return boardArr;
    }

    public void setBoardArr(String[][] board) {
        this.boardArr = board;
    }
}
