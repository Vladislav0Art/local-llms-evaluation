package app;

public class GeneratedCreateTable_InvalidTableName {

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
    public void createTable_InvalidTableName() throws DBAppException {
        db.createTable("", "clusteringKeyColumn", null, null, null);
    }

}