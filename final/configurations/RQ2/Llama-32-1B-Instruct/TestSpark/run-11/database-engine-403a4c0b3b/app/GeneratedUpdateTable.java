package app;

public class GeneratedUpdateTable {

    @Test
    public void updateTable() {
        DBApp dbApp = new DBApp();
        String[] testStr = {"Table1", "Table2"};
        String strClusteringKeyValue = "Key1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        when(this.getDBApp().updateTable(testStr[0], strClusteringKeyValue, htblColNameValue)).thenReturn(true);
        assertUpdateTable();
    }

}