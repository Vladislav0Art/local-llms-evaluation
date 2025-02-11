package app;

public class GeneratedSelectFromTable_SimpleQuery {

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
    public void selectFromTable_SimpleQuery() {
        init();
        Table table = (Table) db.getMyTables().get(0);
        Hashtable<String, Object> result = new Hashtable<>();
        result.put("term", "simpleTerm");
        assertTrue(table.getRecords().contains(result));
    }
}

public class DBAppAction {

    public static final String DELETE = "DELETE";

    public void delete(String tableName, Hashtable<String, Object> values) {
        // implement the logic here
    }

}