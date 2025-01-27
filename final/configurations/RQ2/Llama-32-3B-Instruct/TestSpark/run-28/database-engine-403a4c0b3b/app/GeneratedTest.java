package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedTest {

    @Test
    public void init_DoesNotThrowDBAppException() {
        new DBApp().init();
    }

    @Test
    public void getMyTables

    returnsAnEmptyHashSet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getReader

    returnsANonNullObject() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriter

    returnsANonNullObject() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void createTable_ThrowsDBAppExceptionWhenStrTableNameIsEmpty() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        new DBApp().createTable("", "strClusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void createTable_createsATableInTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("strTableName", "strClusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTable_insertsATableIntoTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.insertIntoTable("strTableName", htblColNameValue);
    }

    @Test
    public void updateTable_updatesATableInTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.updateTable("strTableName", "strClusteringKeyValue", htblColNameValue);
    }

    @Test
    public void deleteFromTable_deletesATableFromTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.deleteFromTable("strTableName", htblColNameValue);
    }

    @Test
    public void selectFromTable_selectsATableFromTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm("strClusteringKeyColumn");
        String[] strarrOperators = new String[0];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }
}

public class DBApp {
    private Serializer serializer;
    private Validator validator;

    public DBApp() {
        this.serializer = new Serializer();
        this.validator = new Validator();
    }

    @Override
    public void init() {
        // implementation
    }

    public HashSet<String> getMyTables() {
        return new HashSet<>();
    }

    public CsvReader getReader() {
        InputStream inputStream = new ByteArrayInputStream("reader content".getBytes());
        return new CsvReader(inputStream);
    }

    public CsvWriter getWriter() {
        return new CsvWriter();
    }

    @Override
    public void createTable(String strTableName, String strClusteringKeyColumn,
                            Hashtable<String, String> htblColNameType, Hashtable<String, String> htblColNameMin,
                            Hashtable<String, String> htblColNameMax) throws DBAppException {
        // implementation
    }

    @Override
    public void insertIntoTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws DBAppException {
        // implementation
    }

    @Override
    public void updateTable(String strTableName, String strClusteringKeyValue,
                            Hashtable<String, Object> htblColNameValue) throws DBAppException {
        // implementation
    }

    @Override
    public void deleteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws DBAppException {
        // implementation
    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws DBAppException {
        return null;
    }

}