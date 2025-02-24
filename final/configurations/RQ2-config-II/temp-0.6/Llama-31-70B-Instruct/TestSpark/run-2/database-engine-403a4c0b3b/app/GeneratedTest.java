package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    private DBApp dbApp = new DBApp();

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void testCreateTableWithNullTableName() throws DBAppException {
        dbApp.createTable(null, "clusteringKeyColumn", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void testCreateTableWithNullClusteringKeyColumn() throws DBAppException {
        dbApp.createTable("tableName", null, new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void testCreateTableWithNullColumnNameType() throws DBAppException {
        dbApp.createTable("tableName", "clusteringKeyColumn", null, new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void testCreateTableWithNullColumnNameMin() throws DBAppException {
        dbApp.createTable("tableName", "clusteringKeyColumn", new Hashtable<>(), null, new Hashtable<>());
    }

}