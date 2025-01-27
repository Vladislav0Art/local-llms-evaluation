package app;

import java.util.Hashtable;
import java.util.HashMap;

public class GeneratedTestConstructor {

    private boolean dbInitialized = false;
    private IDatabase database;

    public DBApp(IDatabase database) {
        this.database = database;
        this.dbInitialized = true;
    }

    public void createTable(String tableName, String clusteringKeyColumn, Hashtable<String, Object> columnDefinitions, Hashtable<String, Object> indexDefinitions, Hashtable<String, Object> foreignKeys) {
    }

    public void insertIntoTable(String tableName, Hashtable<String, Object> values) {
    }

    public void updateTable(String tableName, String clusteringKeyValue, Hashtable<String, Object> columnValues) {
    }

    public void deleteFromTable(String tableName, Hashtable<String, Object> values) {
    }

    public void selectFromTable(SQLTerm[] sqlTerms, String[] values) {
    }

}

class IDatabase {
}

class SQLTerm {
}

public class GeneratedTest {

    @Test
    public void testConstructor() {
        DBApp app = new DBApp(new IDDatabase());
        assertNotNull(app);
    }

}