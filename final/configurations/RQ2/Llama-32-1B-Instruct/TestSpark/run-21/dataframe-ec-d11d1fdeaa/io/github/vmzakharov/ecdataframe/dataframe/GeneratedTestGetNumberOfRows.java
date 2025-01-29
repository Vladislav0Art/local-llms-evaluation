package io.github.vmzakharov.ecdataframe.dataframe;

public class GeneratedTestGetNumberOfRows {

    @Override
    protected void setUp() throws Exception {
        // Initialize test data
        List<String> columnNames1 = Arrays.asList("column1", "column2");
        String[] data1 = {"data1", "data2", "data3"};
        List<String> rowIds1 = new ArrayList<>(Arrays.asList(0, 1, 2));

        List<String> columnNames2 = Arrays.asList("column4", "column5");
        String[] data2 = {"data4", "data5", "data6"};

        int columnsCount1 = 3;
        int rowsCount1 = 2;

        // Initialize DataFrames
        DataFrame df1 = new DataFrame();
        df1.setRowIds(rowIds1);
        df1.setNumberOfColumns(columnNames1, columnsCount1);

        DataFrame df2 = new DataFrame();
        df2.setRowIds(new ArrayList<>());
        df2.setNumberOfColumns(new HashMap<>(), columnsCount2);
    }

    @Test
    public void testGetNumberOfRows() {
        String result = cursor.procedure(df1, data1);
        System.out.println(result); // "df1"
    }

}