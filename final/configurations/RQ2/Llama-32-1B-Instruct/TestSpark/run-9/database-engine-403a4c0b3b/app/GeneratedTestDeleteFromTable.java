package app;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.deleteFromTable("my_table", htblColNameValue);
        // no assertions
    }

}