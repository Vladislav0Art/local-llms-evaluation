package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void constructorShouldCreateNewDB() {
        DBApp db = new DBApp();
        assertNotNull(db);
    }

    @Test
    public void getMyTablesShouldReturnValidTableNames() throws DBAppException {
        DBApp db = new DBApp();
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");
        assertEquals(tables, db.getMyTables());
    }

    @Test
    public void getReaderShouldReturnCsvReaderObject() throws IOException {
        DBApp db = new DBApp();
        CsvReader reader = Mockito.mock(CsvReader.class);
        assertNotNull(db.getReader());
        verify(reader).openFile(Mockito.anyString());
    }

    @Test
    public void getWriterShouldReturnCsvWriterObject() throws IOException {
        DBApp db = new DBApp();
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        assertNotNull(db.getWriter());
        verify(writer).openFile(Mockito.anyString());
    }

    @Test
    public void initShouldInitializeDBApp() throws DBAppException {
        DBApp db = new DBApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try (FileWriter writer = new FileWriter("output.csv")) {
            db.init();
            writer.write(outContent.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void createTableShouldCreateValidTable() throws DBAppException, IOException {
        DBApp db = new DBApp();
        Hashtable<String, String> tableDefinition = new Hashtable<>();
        tableDefinition.put("id", "int");
        tableDefinition.put("name", "string");
        db.createTable("table1", "id", tableDefinition, null, null);
    }

    @Test
    public void insertIntoTableShouldInsertValidData() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        data.put("age", 30);
        db.insertIntoTable("table1", data);
    }

    @Test
    public void updateTableShouldUpdateValidData() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        data.put("age", 31);
        db.updateTable("table1", null, data);
    }

    @Test
    public void deleteFromTableShouldDeleteValidData() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        db.deleteFromTable("table1", data);
    }

    @Test
    public void selectFromTableShouldReturnIterator() throws DBAppException {
        DBApp db = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[]{"select *"};
        String[] operators = new String[]{};
        Iterator iterator = db.selectFromTable(sqlTerms, operators);
        assertNotNull(iterator);
    }

    @Test
    public void selectFromTableShouldReturnValidData() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        data.put("age", 30);
        Iterator iterator = db.selectFromTable(new SQLTerm[]{"select *"}, new String[]{});
        assertEquals(1, iterator.next());
    }

    @Test
    public void selectFromTableShouldThrowException() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        Iterator iterator = db.selectFromTable(new SQLTerm[]{"select *"}, new String[]{});
        assertFalse(iterator.hasNext());
    }

}