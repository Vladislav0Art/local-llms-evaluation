package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedTest {

    @Test
    public void getMyTablesNormalFlowTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderNormalFlowTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterNormalFlowTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void initNormalFlowTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // Assert no error in execution
    }

    @Test
    public void createTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, "keyCol", new Hashtable<String, String>(), new Hashtable<String, String>(), new Hashtable<String, String>());
    }

    @Test
    public void insertIntoTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("tableName", new Hashtable<String, Object>());
        // Assert no error in execution
    }

    @Test
    public void updateTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, "keyValue", new Hashtable<String, Object>());
    }

    @Test
    public void deleteFromTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("tableName", new Hashtable<String, Object>());
        // Assert no error in execution
    }

    @Test
    public void selectFromTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, new String[]{"="});
    }

}