package in.pavithra.tictactoe;

public class Position {
    public int getRow() {
        return row;
    }

    public Position setRow(int row) {
        this.row = row;
        return this;
    }

    public int getColumn() {
        return column;
    }

    public Position setColumn(int column) {
        this.column = column;
        return this;
    }

    public  int row;
    public  int column;
}
