package app;

public class GeneratedTestInsertIntoTable {

    private String db;

    public Database(String db) {
        this.db = db;
    }

    public boolean init() {
        return true;
    }

    public boolean createTable(String tableName, String type, Hashtable<String, String> columns, Hashtable<String, String> constraints, Hashtable<String, Object> primaryKeys) {
        // implement table creation logic
        return true;
    }

    public boolean insertIntoTable(String tableName, Hashtable<String, Object> data) {
        // implement insert into table logic
        return true;
    }

    public boolean updateTable(String tableName, String type, Hashtable<String, Object> data) {
        // implement update table logic
        return true;
    }

    public boolean deleteFromTable(String tableName, Hashtable<String, Object> data) {
        // implement delete from table logic
        return true;
    }

    public Iterator<SQLTerm> selectFromTable(List<SQLTerm> sqlTerms, String[] strarrOperators) {
        // implement select from table logic
        return null;
    }
}

public class SQLTerm {
    private String query;

    public SQLTerm(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "SQLTerm{" +
                "query='" + query + '\'' +
                '}';
    }
}

public class DatabaseEngine {
    private Database db;

    public DatabaseEngine(Database db) {
    }

    public void init() {
        this.db.init();
    }

    public boolean createTable(String tableName, String type, List<String> columns, List<String> constraints, List<String> primaryKeys) {
        return this.db.createTable(tableName, type, new Hashtable<>(), new Hashtable<>(), new Hashtable<>(primaryKeys));
    }

    public boolean insertIntoTable(String tableName, List<List<Object>> data) {
        for (List<Object> row : data) {
            this.db.insertIntoTable(tableName, new Hashtable<>((Hashtable) row));
        }
        return true;
    }

    public boolean updateTable(String tableName, String type, List<List<Object>> data) {
        for (List<Object> row : data) {
            this.db.updateTable(tableName, type, new Hashtable<>((Hashtable) row));
        }
        return true;
    }

    public boolean deleteFromTable(String tableName, List<List<Object>> data) {
        for (List<Object> row : data) {
            this.db.deleteFromTable(tableName, new Hashtable<>((Hashtable) row));
        }
        return true;
    }

    public Iterator<SQLTerm> selectFromTable(List<SQLTerm> sqlTerms, String[] strarrOperators) {
        List<Iterator<SQLTerm>> iterators = new ArrayList<>();
        for (SQLTerm term : sqlTerms) {
            iterators.add(this.db.selectFromTable(Arrays.asList(term), strarrOperators));
        }
        return null;
    }

    public static DatabaseEngine createDatabaseEngine(Database db) {
        return new DatabaseEngine(db);
    }
}

public class TestDatabaseEngine {

    @Test
    public void testInsertIntoTable() {
        Database db = new Database("db");
        DatabaseEngine engine = DatabaseEngine.createDatabaseEngine(db);
        engine.init();
        List<List<Object>> data = Arrays.asList(
                Arrays.asList(1, "John Doe"),
                Arrays.asList(2, "Jane Doe")
        );
        engine.insertIntoTable("test_table", data);
    }

}