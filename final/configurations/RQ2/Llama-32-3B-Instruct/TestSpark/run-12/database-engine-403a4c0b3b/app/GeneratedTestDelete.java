package app;

public class GeneratedTestDelete {

    private Database db;

    @Before
    public void setup() {
        db = new Database();
        // Setup database
    }

    @Test
    public void testDelete() {
        // Arrange
        String[] values = {"1", "2", "3"};
        // Act
        db.deleteFromTable("testTable", values);
        // Assert
        assertEquals(0, db.countRows("testTable"));
    }
}

public class Database {
    private Map<String, Map<String, Object>> tables;

    public void insert(String tableName, String columnName, Object[] values) {
        if (!tables.containsKey(tableName)) {
            tables.put(tableName, new HashMap<>());
        }
        tables.get(tableName).put(columnName, values);
    }

    public int countRows(String tableName) {
        return tables.containsKey(tableName) ? tables.get(tableName).size() : 0;
    }

    public void update(String tableName, String columnName, Object[] values) {
        if (tables.containsKey(tableName)) {
            for (Map.Entry<String, Object> entry : (Map<String, Object>) tables.get(tableName).entrySet()) {
                if (entry.getKey().equals(columnName)) {
                    entry.setValue(values);
                }
            }
        }
    }

    public void deleteFromTable(String tableName, Object[] values) {
        if (tables.containsKey(tableName)) {
            tables.remove(tableName);
        }
    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) {
        // Select implementation
    }
}

public class SQLTerm implements Comparable<SQLTerm> {
    private String value;

    public SQLTerm(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(SQLTerm o) {
        return this.value.compareTo(o.value);
    }

}