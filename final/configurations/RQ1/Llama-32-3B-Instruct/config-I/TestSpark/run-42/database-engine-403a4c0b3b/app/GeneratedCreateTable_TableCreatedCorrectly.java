package app;

public class GeneratedCreateTable_TableCreatedCorrectly {

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
    public void createTable_TableCreatedCorrectly() {
        init();
        Table table = (Table) db.getMyTables().get(0);
        assertNotNull(table);
        assertTrue(!table.getRecords().isEmpty());
    }

}