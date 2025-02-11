package app;

public class GeneratedUpdateTable_UpdateRecordCorrectly {

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
    public void updateTable_UpdateRecordCorrectly() throws DBAppException {
        init();
        Table table = (Table) db.getMyTables().get(0);
        Hashtable<String, Object> values = new Hashtable<>();
        values.put("value", "updateValue");
        db.updateTable("table", "clusteringKeyValue", values);
        assertTrue(table.getRecords().contains(values));
    }

}