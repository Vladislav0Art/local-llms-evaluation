package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedTest {

    private DBApp dbApp = new DBApp();

    @Test
    public void getMyTables_EmptySet() {
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getReader_ReaderReturned() throws IOException, CsvValidationException {
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriter_WriterReturned() throws IOException, CsvValidationException {
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void init_ThrowsDBAppException() {
        dbApp.init();
    }

    @Test
    public void createTable_ValidData() throws DBAppException, IOException, CsvValidationException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column2", "minValue");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column3", "maxValue");
        dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void createTable_InvalidData() throws DBAppException, IOException, CsvValidationException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column2", "");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column3", "maxValue");
        dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("tableName", htblColNameValue);
    }

    @Test
    public void insertIntoTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "");
        dbApp.insertIntoTable("tableName", htblColNameValue);
    }

    @Test
    public void updateTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value2");
        dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue);
    }

    @Test
    public void updateTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "");
        dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue);
    }

    @Test
    public void deleteFromTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value3");
        dbApp.deleteFromTable("tableName", htblColNameValue);
    }

    @Test
    public void selectFromTable_ValidData() throws DBAppException {
        ArrayList<SQLTerm> arrSQLTerms = new ArrayList<>();
        SQLTerm term1 = new SQLTerm("column1", "value4");
        arrSQLTerms.add(term1);
        String[] strarrOperators = new String[0];
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(result.hasNext());
    }

    @Test
    public void selectFromTable_InvalidData() throws DBAppException {
        ArrayList<SQLTerm> arrSQLTerms = new ArrayList<>();
        SQLTerm term1 = new SQLTerm("column1", "");
        arrSQLTerms.add(term1);
        String[] strarrOperators = new String[0];
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertFalse(result.hasNext());
    }

}