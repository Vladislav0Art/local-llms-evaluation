package app;

public class GeneratedDeleteFromTable_DeleteRecordCorrectly {

    protected DBApp db;

    public TestBase(DBApp db) {
        this.db = db;
    }

    public void init() throws DBAppException {
        db.init();
    }
}

public class DBAppTest extends TestBase {

    @Test
    public void deleteFromTable_DeleteRecordCorrectly() throws DBAppException {
        init();
        Table table = (Table) db.getMyTables().get(0);
        Hashtable<String, Object> values = new Hashtable<>();
        values.put("value", "deleteValue");
        db.updateTable("table", "clusteringKeyValue", values);
        db.takeAction(DBApp.Action.DELETE, "table", values);
        assertTrue(table.getRecords().isEmpty());
    }

}