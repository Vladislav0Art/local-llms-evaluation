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

public class GeneratedTestGetWriter {

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
    public void testGetWriter() {
        dbApp.writer = Mockito.mock(CsvWriter.class);
        CsvWriter actual = dbApp.getWriter();
        assertEquals(dbApp.writer, actual);
    }

}