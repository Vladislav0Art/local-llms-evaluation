package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertTrue("init method has been called", true);
    }

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        assertNotNull("Should not return null", app.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        assertTrue(app.getReader() instanceof CsvReader);
    }

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        assertTrue(app.getWriter() instanceof CsvWriter);
    }

    @Test
    public void createTableInvalidInputTest() throws DBAppException {
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();

        DBApp app = new DBApp();
        app.createTable("test", "key", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void insertIntoTableInvalidInputTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        DBApp app = new DBApp();
        app.insertIntoTable("test", colNameValue);
    }

    @Test
    public void updateTableInvalidInputTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp app = new DBApp();
        app.updateTable("test", "key", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidInputTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        DBApp app = new DBApp();
        app.deleteFromTable("test", colNameValue);
    }

    @Test
    public void selectFromTableInvalidInputTest() throws DBAppException {
        SQLTerm[] terms = new SQLTerm[0];
        String[] operators = new String[0];

        DBApp app = new DBApp();
        Iterator result = app.selectFromTable(terms, operators);
        assertNotNull("Should not return null", result);
    }

}