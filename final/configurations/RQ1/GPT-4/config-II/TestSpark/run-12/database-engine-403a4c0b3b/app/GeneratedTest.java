package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addnGetMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");
        dbApp.getMyTables().addAll(tables);
        assertTrue(dbApp.getMyTables().containsAll(tables));
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = mock(CsvReader.class);
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");
        when(reader.readAllTables()).thenReturn(expectedTables);
        dbApp.setReader(reader);
        dbApp.init();
        assertTrue(dbApp.getMyTables().equals(expectedTables));
    }

    @Test
    public void insertIntoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.insertIntoTable("table1", nameValues);
    }

    @Test
    public void deleteFromTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.deleteFromTable("table1", nameValues);
    }

    @Test
    public void updateTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.updateTable("table1", "1", nameValues);
    }

    @Test
    public void createTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();
        nameType.put("name", "String");
        nameMin.put("name", "a");
        nameMax.put("name", "z");
        dbApp.createTable("table1", "name", nameType, nameMin, nameMax);
    }

    @Test
    public void selectFromTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[2];
        String[] strarrOperators = new String[1];
        arrSQLTerms[0] = new SQLTerm("table1", "column1", "=", "1");
        arrSQLTerms[1] = new SQLTerm("table1", "column2", "=", "2");
        strarrOperators[0] = "OR";
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}