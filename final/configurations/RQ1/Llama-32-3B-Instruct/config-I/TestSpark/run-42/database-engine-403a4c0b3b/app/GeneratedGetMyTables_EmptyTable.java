package app;

public class GeneratedGetMyTables_EmptyTable {

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
    public void getMyTables_EmptyTable() {
        assertTrue(db.getMyTables().isEmpty());
    }

}