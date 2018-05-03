import java.util.ArrayList;

class Matrix {
    private String matrixAsString;

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
            String[] newArray = matrixAsString.split("\\n");
            String[] arrayIndex = newArray[rowNumber].split(" ");
            int[] row = new int[arrayIndex.length];
            for(int i = 0; i < arrayIndex.length; i++){
                row[i] = Integer.valueOf(arrayIndex[i]);
            }
            return row;
    }

    int[] getColumn(int columnNumber) {
        String[] newArray = matrixAsString.split("\\n");
        int rowCount = newArray.length;
        String[] newArrayIndexOne = newArray[0].split(" ");
        int columnsCount = newArrayIndexOne.length;
        ArrayList<String[]> action = new ArrayList<String[]>();
        for(int i = 0; i<rowCount; i++){
            action.add(newArray[i].split(" "));
        }
        int[] column = new int[columnsCount];
        for(int i = 0; i < action.size(); i++){
            String[] temp = action.get(i);
            column[i] = Integer.parseInt(temp[columnNumber]);
        }

      return column;

    }

    int getRowsCount() {
        String[] newArray = matrixAsString.split("\\n");
        int rowCount = newArray.length;
        return rowCount;
    }

    int getColumnsCount() {
        String[] newArray = matrixAsString.split("\\n");
        String[] newArrayIndexOne = newArray[0].split(" ");
        int columnsCount = newArrayIndexOne.length;
        return columnsCount;
    }

}
