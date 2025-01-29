package app;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("my_table", htblColNameValue);
        // no assertions
    }

}