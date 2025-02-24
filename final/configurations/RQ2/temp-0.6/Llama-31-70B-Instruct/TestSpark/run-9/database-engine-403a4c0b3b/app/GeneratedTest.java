package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.IDatabase;
import util.TypeCaster;
import util.search.SQLTerm;
import sql.CsvReader;
import sql.CsvWriter;
import util.validation.Validator;

public class GeneratedTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() throws Exception {
        dbApp = new DBApp();
        Set<String> tableNames = dbApp.getMyTables();
        assertEquals(2, tableNames.size());
    }

    @Test
    public void getReaderTest() throws Exception {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotEquals(null, reader);
    }

    @Test
    public void getWriterTest() throws Exception {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotEquals(null, writer);
    }

}