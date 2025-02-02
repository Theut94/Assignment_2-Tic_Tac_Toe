package tictactoe.bll;

/**
 * The GameBoardTwoPlayer class is the mandatory implementation for the TicTacToe assignment.
 * It is used for games where there are two human players.
 */
// Here we implement our interface, which is IGameModel
public class GameBoardTwoPlayer implements IGameModel
{
//Player data
    public int playerturn = 0;

//Gameboard data
    private final String[][] grid;


// Her definerer vi vores grid til at være [3][3], da TicTacToe Gameboard er 3x3.
    protected GameBoardTwoPlayer()
    {
        grid = new String[3][3];
        resetBoard();

    }


    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    //Method that swaps between the two players
    @Override
    public int getNextPlayer()
    {
        return playerturn % 2;

    }

    // Method to reset the gameBoard
    public void resetBoard() {
        for (int i = 0; i < grid.length;  i++) {
            for (int j = 0; j < grid.length; j++){
                grid[i][j] = "";
            }
        }

    }
// Metode vi bruger til at sætte vores grid, col & row er int, da parameteren er et heltal. Resultatet er en String.
    public void setGrid(int col, int row, String text){
        grid[col][row] = text;
    }
    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is successful the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */

    @Override
    public boolean play(int col, int row) {
        return (!isGameOver() && grid[col][row].matches(""));
    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */


    @Override
    // Method to check wether the game is over or not
    public boolean isGameOver() {
        boolean isGameOver = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j].equals("")) {
                    isGameOver = false;
                }
            }
        }
        if (checkOWin()) {
            return checkOWin();
        }
        else if(checkXWin())
        {
            return checkXWin();
        }

        return isGameOver;
    }


    // Method that checks if player X has won by checking every possible way X can win, if matches returns true
    private boolean checkXWin() {
        return (grid[0][0].matches("[X]") && grid[1][0].matches("[X]") && grid[2][0].matches("[X]") ||
                grid[0][1].matches("[X]") && grid[1][1].matches("[X]") && grid[2][1].matches("[X]") ||
                grid[0][2].matches("[X]") && grid[1][2].matches("[X]") && grid[2][2].matches("[X]") ||
                //Lodret
                grid[0][0].matches("[X]") && grid[0][1].matches("[X]") && grid[0][2].matches("[X]") ||
                grid[1][0].matches("[X]") && grid[1][1].matches("[X]") && grid[1][2].matches("[X]") ||
                grid[2][0].matches("[X]") && grid[2][1].matches("[X]") && grid[2][2].matches("[X]") ||
                //kryds
                grid[0][0].matches("[X]") && grid[1][1].matches("[X]") && grid[2][2].matches("[X]") ||
                grid[0][2].matches("[X]") && grid[1][1].matches("[X]") && grid[2][0].matches("[X]"));
    }

    // Method that checks if player O has won by checking every possible way X can win, if matches returns true
    private boolean checkOWin() {
        return (grid[0][0].matches("[O]") && grid[1][0].matches("[O]") && grid[2][0].matches("[O]") ||
                grid[0][1].matches("[O]") && grid[1][1].matches("[O]") && grid[2][1].matches("[O]") ||
                grid[0][2].matches("[O]") && grid[1][2].matches("[O]") && grid[2][2].matches("[O]") ||
                //Lodret
                grid[0][0].matches("[O]") && grid[0][1].matches("[O]") && grid[0][2].matches("[O]") ||
                grid[1][0].matches("[O]") && grid[1][1].matches("[O]") && grid[1][2].matches("[O]") ||
                grid[2][0].matches("[O]") && grid[2][1].matches("[O]") && grid[2][2].matches("[O]") ||
                //kryds
                grid[0][0].matches("[O]") && grid[1][1].matches("[O]") && grid[2][2].matches("[O]") ||
                grid[0][2].matches("[O]") && grid[1][1].matches("[O]") && grid[2][0].matches("[O]"));
    }


     // This method is used to change player turn.

    public void incrementPlayer() {
        if (playerturn == 0) {
            playerturn++;
        }
        else {
            playerturn = 0;
        }
    }
    /**
     * Gets the id of the winner, -1 if its a draw.
     * Return 1 if X wins
     * Return 0 if O wins
     * @return int id of winner, or -1 if draw.
     */
    @Override
    public int getWinner() {
        if(checkOWin())
        {
            return 0;
        }
        else if (checkXWin())
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }


     // Resets the game to a new game state.

    @Override
    public void newGame()
    {
        //TODO Implement this method
    }

    /**
     * Returns the value representing which players has played the given field.
     *
     * @param col The column to look at.
     * @param row The row to look at.
     * @return Will return 0 if player 0 has played the field, 1 for player one, and -1 if no player has played the field.
     */
    @Override
    public int getPlayerAt(int col, int row)
    {
        return -1;
    }
}
