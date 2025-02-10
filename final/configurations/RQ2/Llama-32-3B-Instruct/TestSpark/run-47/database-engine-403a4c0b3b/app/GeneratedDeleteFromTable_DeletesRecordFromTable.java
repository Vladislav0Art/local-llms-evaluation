package app;

public class GeneratedDeleteFromTable_DeletesRecordFromTable {

    @Test
    public void deleteFromTable_DeletesRecordFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1L);
        dbApp.deleteFromTable("myTable", htblColNameValue);
    }

}