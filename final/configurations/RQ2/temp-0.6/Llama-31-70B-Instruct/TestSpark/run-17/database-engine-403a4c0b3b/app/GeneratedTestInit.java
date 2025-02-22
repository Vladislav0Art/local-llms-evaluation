package app;

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

public class GeneratedTestInit {

    @Before
    public void setUp() throws Exception {
        // Set up test fixtures, if any.
    }

    @After
    public void tearDown() throws Exception {
        // Tear down test fixtures, if any.
    }

    @Test
    public void testInit() {
        // Setup
        DBApp dbApp = new DBApp();

        // Run test
        dbApp.init();

        // Verify results
        assertEquals(new HashSet<>(), dbApp.getMyTables());
    }

}