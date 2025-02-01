package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        HashSet<String> tables = app.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        CsvReader reader = app.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        CsvWriter writer = app.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void initTest() {
        DBApp app = Mockito.spy(new DBApp());
        CsvReader reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.getReader()).thenReturn(reader);
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());
        app.init();
        Mockito.verify(reader, Mockito.times(1)).readAllTables();
    }

    @Test
    public void createTableTest() throws IOException, ParseException, DBAppException {
        DBApp app = Mockito.spy(new DBApp());
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        Mockito.when(app.getWriter()).thenReturn(writer);
        app.createTable("Employee", "id", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        Mockito.verify(writer, Mockito.times(1)).write(Mockito.any());
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable("Employee", new Hashtable<>());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable("Employee", "1", new Hashtable<>());
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable("Employee", new Hashtable<>());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = new SQLTerm();
        String[] operators = new String[1];
        operators[0] = "AND";
        Iterator iterator = app.selectFromTable(sqlTerms, operators);
        assertNotNull(iterator);
    }

}