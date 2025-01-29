package app;

import app.DBApp;
import app.DBError;
import app.DBAppException;
import app.TypeCaster;
import app.TypeCasterFactory;
import app.Serializer;
import storage.StorageManager;
import exceptions.DBAppException;
import exceptions.DBAppValidationException;

import java.util.Collections;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(0, tables.size(), "Expected 0");
    }

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CsvReader csvReader = dbApp.getReader();
        assertNotNull(csvReader, "Expected not null");
    }

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CsvWriter csvWriter = dbApp.getWriter();
        assertNotNull(csvWriter, "Expected not null");
    }

    @Test
    public void testInit() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(dbApp.isValid(), "Expected true");
    }

    @Test
    public void testCreateTable() throws DBAppValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        dbApp.createTable("test", "column1", Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());
        assertEquals(0, tables.size(), "Expected 0");
    }

    @Test
    public void testInsertIntoTable() throws DBAppValidationException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        HashMap<String, Object> values = new HashMap<>();
        values.put("value1", TypeCasterFactory.getTypes()[0]);
        dbApp.insertIntoTable("test", values);
        assertEquals(1, tables.size(), "Expected 1");
    }

    @Test
    public void testUpdateTable() throws DBAppValidationException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        HashMap<String, Object> values = new HashMap<>();
        values.put("value1", TypeCasterFactory.getTypes()[0]);
        dbApp.insertIntoTable("test", values);
        dbApp.updateTable("test", "column1", values);

        HashSet<String> selectResult = dbApp.selectFromTable(new String[]{"table_name"}, new String[]{"column1"});
        assertNotNull(selectResult, "Expected not null");
    }

    @Test
    public void testDeleteFromTable() throws DBAppValidationException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        HashMap<String, Object> values = new HashMap<>();
        values.put("value1", TypeCasterFactory.getTypes()[0]);
        dbApp.insertIntoTable("test", values);
        dbApp.deleteFromTable("test", values);

        HashSet<String> selectResult = dbApp.selectFromTable(new String[]{"table_name"}, new String[]{"column1"});
        assertEquals(0, selectResult.size(), "Expected 0");
    }

    @Test
    public void testSelectFromTable() {
        DBApp dbApp = new DBApp();
        StorageContext context = new StorageContext();
        StorageManager manager = new StorageManager(context);
        CSVReader reader = new CsvReader(manager.getCSVReader());
        String[] columns = {"column1"};
        HashSet<String> selectResult = dbApp.selectFromTable(reader, columns);

        assertNotNull(selectResult, "Expected not null");
    }

}