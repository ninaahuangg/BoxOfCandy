public class BoxOfCandy
{
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;
    public BoxOfCandy(Candy[][] b){
        box = b;
    }
    public String toString() 
    {
        String s = "";
        for (int row = 0; row < box.length; row++) 
        {
            for (int col = 0; col < box[0].length; col++)
            {
                s += box[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }
    /**
    * Moves one piece of candy in column col, if necessary and possible, so that the box
    * element in row 0 of column col contains a piece of candy, as described in part (a).
    * Returns false if there is no piece of candy in column col and returns true otherwise.
    * Precondition: col is a valid column index in box.
    */
    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) return true;
        for (int i = 1; i < box.length; i++) {
            if (box[i][col] != null) {
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }
        return false;
    }
    public Candy removeNextByFlavor(String flavor)
    {
        for (int row = box.length - 1; row >= 0; row--){
            for (int col = 0; col < box[0].length; col++){ 
                Candy c = box[row][col];
                if (c != null && c.getFlavor().equals(flavor)){
                    box[row][col] = null;
                    return c;
                }
            }
        }
        return null;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
