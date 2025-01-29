package app;

public class GeneratedCreateTable {

    @Test
    public void createTable() {
        DBApp dbApp = new DBApp();
        String[] testStr = {"Table1", "Table2"};
        String strClusteringKeyColumn = "ClusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        when(this.getDBApp().createTable(testStr[0], strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax)).thenReturn(true);
        assertCreateTable();
    }

}