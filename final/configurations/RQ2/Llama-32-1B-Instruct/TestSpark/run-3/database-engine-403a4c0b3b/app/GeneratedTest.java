package app;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedTest {

    private IDatabase database;
    private Serializer serializer;
    private TypeCaster typeCaster;

    @BeforeEach
    public void setUp() {
        database = new DBApp();
        serializer = new Serializer();
        typeCaster = new TypeCaster();
    }

    @Test
    public void testGetMyTables() throws DBAppException {
        HashSet<String> result = database.getMyTables();
        assertEquals(0, result.size());
    }

    @Test
    public void testGetReader() {
        CsvReader reader = new CsvReader(database);
        assertNotNull(reader);
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter(database);
        assertNotNull(writer);
    }

    @Test
    public void testInit() throws DBAppException {
        database.init();
        assert !database.isInitialized();
    }

    @Test
    public void testCreateTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("type", "int");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("minValue", "10");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("maxValue", "100");
        database.createTable("my_table", "id", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(1, database.insertIntoTable("my_table", Collections.singletonMap("id", 10)));
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", "11");
        database.insertIntoTable("my_table", htblColNameValue);
        assertEquals(1, database.selectFromTable(new SQLTerm[]{new SQLTerm("id", 10)}, new String[]{"=", "id", 11}).size());
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", "12");
        database.updateTable("my_table", "id", htblColNameValue);
        assertEquals(1, database.selectFromTable(new SQLTerm[]{new SQLTerm("id", 10)}, new String[]{"=", "id", 11}).size());
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        database.deleteFromTable("my_table", htblColNameValue);
        assertEquals(0, database.selectFromTable(new SQLTerm[]{new SQLTerm("id", 10)}, new String[]{"=", "id", 11}).size());
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        ArrayList<SQLTerm> result = database.selectFromTable(new SQLTerm[]{new SQLTerm("id", 10)}, new String[]{"=", "id", 11});
        assertNotNull(result);
    }

}