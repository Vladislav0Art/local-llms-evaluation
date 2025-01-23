package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void initTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}