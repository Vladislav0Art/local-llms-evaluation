package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private DBApp app;

    @Before
    public void setup() {
        app = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
        expected.add("test1");
        expected.add("test2");

        HashSet<String> actual = app.getMyTables();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetReader() {
        CsvReader expected = Mockito.mock(CsvReader.class);
        CsvReader actual = app.getReader();

        assertSame(expected, actual);
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = Mockito.mock(CsvWriter.class);
        CsvWriter actual = app.getWriter();

        assertSame(expected, actual);
    }

    @Test
    public void testInit() {
        app.init();

        // TODO: Add assertions for init() method
    }

}