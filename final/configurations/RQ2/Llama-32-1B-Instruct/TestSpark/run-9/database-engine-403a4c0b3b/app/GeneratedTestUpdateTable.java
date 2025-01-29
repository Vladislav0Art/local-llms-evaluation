package app;

public class GeneratedTestUpdateTable {

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.updateTable("my_table", "column1", htblColNameValue);
        // no assertions
    }

}