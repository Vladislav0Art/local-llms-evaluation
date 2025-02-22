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

public class GeneratedTest {

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

    @Test
    public void testCreateTable() throws DBAppException, IOException {
        // Setup
        DBApp dbApp = new DBApp();
        String strTableName = "tableName";
        String strClusteringKeyColumn = "clusteringKeyColumn";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        // Run test
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        // Verify results
        assertEquals(new HashSet<>(Arrays.asList(strTableName)), dbApp.getMyTables());
        // TODO: Verify additional results
    }

}