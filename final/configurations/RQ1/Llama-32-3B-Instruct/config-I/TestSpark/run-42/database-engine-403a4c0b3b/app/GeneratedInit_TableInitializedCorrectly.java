package app;

public class GeneratedInit_TableInitializedCorrectly {

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
    public void init_TableInitializedCorrectly() {
        init();
        assertTrue(!db.getMyTables().isEmpty());
    }

}