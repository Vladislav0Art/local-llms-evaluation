package app;

public class GeneratedInsertIntoTable_InsertsRecordIntoTable {

    @Test
    public void insertIntoTable_InsertsRecordIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        htblColNameValue.put("age", 30);
        dbApp.insertIntoTable("myTable", htblColNameValue);
    }

}