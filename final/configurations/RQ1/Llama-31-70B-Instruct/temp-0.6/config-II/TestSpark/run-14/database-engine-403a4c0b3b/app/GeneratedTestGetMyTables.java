package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.Table;
import util.search.*;
import sql.SQLTerm;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @After
    public void tearDown() {
        dbApp = null;
    }

    @Test
    public void testGetMyTables() {
        Set<String> expected = new HashSet<>();
        expected.add("test");
        dbApp.myTables = expected;
        Set<String> actual = dbApp.getMyTables();
        assertEquals(expected, actual);
    }

}