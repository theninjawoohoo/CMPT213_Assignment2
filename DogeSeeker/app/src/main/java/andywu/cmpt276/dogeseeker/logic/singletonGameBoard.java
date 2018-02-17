package andywu.cmpt276.dogeseeker.logic;

public class singletonGameBoard {

    //Member variables for the singleton class
    private int row;
    private int col;
    private int numberOfMines;

    //Setters and getters for the private field.
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getNumberOfMines() {
        return numberOfMines;
    }

    public void setNumberOfMines(int numberOfMines) {
        this.numberOfMines = numberOfMines;
    }


}
