package app;

public class GeneratedUpdateTable_UpdatesRecordInTable {

    @Test
    public void updateTable_UpdatesRecordInTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        htblColNameValue.put("age", 31);
        dbApp.updateTable("myTable", "id=1", htblColNameValue);
    }

}