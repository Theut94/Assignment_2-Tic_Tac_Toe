package tictactoe.bll;

/**
 * The GameBoardTwoPlayer class is the mandatory implementation for the TicTacToe assignment.
 * It is used for games where there are two human players.
 */
public class GameBoardTwoPlayer implements IGameModel
{

    public int playerturn = 0;

    protected GameBoardTwoPlayer()
    {

    }


    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    @Override
    public int getNextPlayer()
    {
        return playerturn % 2;

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
        //TODO Implement this method
        playerturn++;
        return true;
    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */
    @Override
    public boolean isGameOver() {
        //TODO Implement this method
        return false;
    }

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    @Override
    public int getWinner() {
        //TODO Implement this method
        return -1;
    }

    /**
     * Resets the game to a new game state.
     */
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
        int[][] boardgame = new int[3][3];
        boardgame[0][0] = -1;
        boardgame[0][1] = -1;
        boardgame[0][2] = -1;
        boardgame[1][0] = -1;
        boardgame[1][1] = -1;
        boardgame[1][2] = -1;
        boardgame[2][0] = -1;
        boardgame[2][1] = -1;
        boardgame[2][2] = -1;

        // Her vil vi gerne kunne ændre værdierne inde i arrayet.. det er ikke gjort endnu,
        // men vi har forsøgt at gøre forskel på om det er player et eller player to
        for (int r = 0; r < boardgame.length; r++ ) {
            for (int c = 0; c < boardgame[0].length; c++) {
                if(playerturn == 0 )
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }

        }
        return -1;
    }
}