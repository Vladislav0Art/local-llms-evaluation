package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;
import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import sql.SQLTerm;

public class GeneratedTest {

    @Test
    public void initShouldRunWithoutExceptionsTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> columnTypes = new Hashtable<>();
        Hashtable<String, String> columnMins = new Hashtable<>();
        Hashtable<String, String> columnMaxs = new Hashtable<>();
        dbApp.createTable("InvalidName", "Key", columnTypes, columnMins, columnMaxs);
    }

    @Test
    public void insertIntoTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.insertIntoTable("InvalidName", values);
    }

    @Test
    public void updateTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.updateTable("InvalidName", "Key", values);
    }

    @Test
    public void deleteFromTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.deleteFromTable("InvalidName", values);
    }

    @Test
    public void selectFromTableShouldReturnIteratorTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {new SQLTerm("TableName", "ColumnName", "Operator", "Value")};
        String[] strarrOperators = {"and"};
        assertNotNull(dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

    @Test
    public void getMyTablesShouldReturnHashSetTest() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getMyTables() instanceof HashSet);
    }

    @Test
    public void getReaderShouldReturnCsvReaderTest() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getReader() instanceof CsvReader);
    }

    @Test
    public void getWriterShouldReturnCsvWriterTest() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getWriter() instanceof CsvWriter);
    }

}