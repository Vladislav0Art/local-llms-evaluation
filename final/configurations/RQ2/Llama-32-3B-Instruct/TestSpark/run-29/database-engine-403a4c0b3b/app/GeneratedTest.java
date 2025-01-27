package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.IOException;
import java.text.ParseException;

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

    @Test
    public void DBAppConstructorTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        assertTrue(myTables.isEmpty());
    }

    @Test
    public void getReaderTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void initTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableTestSuccessTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("test_table", "id", htblColNameType, htblClusteringKeyColumn, htblColNameMin);
    }

    @Test
    public void createTableTestFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        try {
            dbApp.createTable("test_table", "", "", new Hashtable<>(), new Hashtable<>());
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

    @Test
    public void insertIntoTableSuccessTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("test_table", htblColNameValue);
    }

    @Test
    public void insertIntoTableFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        try {
            dbApp.insertIntoTable("test_table", null);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

    @Test
    public void updateTableSuccessTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("test_table", "id", htblColNameValue);
    }

    @Test
    public void updateTableFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        try {
            dbApp.updateTable("test_table", "", null);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

    @Test
    public void deleteFromTableSuccessTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("test_table", htblColNameValue);
    }

    @Test
    public void deleteFromTableFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        try {
            dbApp.deleteFromTable("test_table", null);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

    @Test
    public void selectFromTableSuccessTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

    @Test
    public void selectFromTableFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        try {
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

}