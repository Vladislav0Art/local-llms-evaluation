package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        assertNotNull(app.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        assertNotNull(app.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        assertNotNull(app.getWriter());
    }

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull(app.getMyTables());
    }

    @Test
    public void createTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.createTable(null, "key", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void insertIntoTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable(null, new Hashtable<>());
    }

    @Test
    public void updateTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable(null, "key", new Hashtable<>());
    }

    @Test
    public void deleteFromTableWithoutKeyTest() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable("table", new Hashtable<>());
    }

    @Test
    public void selectFromTableWithEmptySQLTermsTest() throws DBAppException {
        DBApp app = new DBApp();
        app.selectFromTable(new SQLTerm[0], new String[0]);
    }

}