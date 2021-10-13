package tictactoe.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ScoreModel {

    private final ObservableList<String> winners;

    public ScoreModel() {
        winners = FXCollections.observableArrayList();
    }

    public ObservableList<String> getWinners() {
        return winners;
    }

    public void setNextWinner(String winner)
    {
        if(winner.equals("-1"))
        {
            winners.add("Draw");
        }
        else{
            winners.add("player " + winner + " won");
        }

    }

}