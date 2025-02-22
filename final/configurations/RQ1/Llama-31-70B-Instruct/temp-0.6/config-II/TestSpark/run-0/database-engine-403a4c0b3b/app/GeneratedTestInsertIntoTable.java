package app;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() throws DBAppException, CsvValidationException, IOException, ClassNotFoundException, ParseException {
        DBApp app = new DBApp();
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.insertIntoTable(strTableName, htblColNameValue);
        assertTrue(app.getMyTables().contains(strTableName));
    }

}