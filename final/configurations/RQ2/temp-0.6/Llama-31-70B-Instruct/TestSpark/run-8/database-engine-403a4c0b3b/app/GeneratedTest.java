package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

    @Test
    public void testCreateTable() {
        dbApp.createTable("tableName", "clusteringKeyColumn", null, null, null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void testInsertIntoTable() {
        dbApp.insertIntoTable("tableName", null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void testUpdateTable() {
        dbApp.updateTable("tableName", "clusteringKeyValue", null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void testDeleteFromTable() {
        dbApp.deleteFromTable("tableName", null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void testSelectFromTable() {
        dbApp.selectFromTable(null, null);
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}

public class SerializerTest {

    private Serializer serializer;

    @Before
    public void setUp() {
        serializer = new Serializer();
    }

    @Test
    public void testSerializeTable() {
        // TODO: implement test
    }

    @Test
    public void testDeserializeTable() {
        // TODO: implement test
    }

}