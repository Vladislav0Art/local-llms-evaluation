package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

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

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUpdateTable {

    @Mock
    private Serializer serializer;

    @Mock
    private Validator validator;

    public void testGetMyTables() {
        HashSet<String> myTables = new HashSet<>();
        Mockito.when(validator.isValidName("my_table1")).thenReturn(true);
        Mockito.when(validator.isValidName("my_table2")).thenReturn(false);

        DBApp dbApp = new DBApp();
        dbApp.setSerializer(serializer);
        dbApp.setValidator(validator);

        HashSet<String> result = dbApp.getMyTables();
        Mockito.verify(serializer).isValidName("my_table1");
        Mockito.verify(serializer).isValidName("my_table2");

        assertEquals(1, myTables.size());
    }

    public void testGetReader() {
        CsvReader csvReader = new CsvReader();

        DBApp dbApp = new DBApp();
        dbApp.setSerializer(csvReader);

        CSVRecord[] records = {{"name", "John"}, {"age", "25"}};
        csvReader.addRecord(records);
        csvReader.deleteRecord(0, 1);

        assertEquals("John", csvReader.getRecord(0).get("name"));
    }

    public void testGetWriter() {
        CsvWriter csvWriter = new CsvWriter();

        DBApp dbApp = new DBApp();
        dbApp.setSerializer(csvWriter);

        CSVRecord[] records = {{"name", "John"}, {"age", "25"}};
        csvWriter.addRecord(records);
        csvWriter.deleteRecord(0, 1);

        assertEquals("John", csvWriter.getRecord(0).get("name"));
    }

    public void testInit() {
        DBApp dbApp = new DBApp();
        dbApp.init();

        Mockito.when(serializer.validate()).thenReturn(true);
        Mockito.when(validator.isValidName("my_table")).thenReturn(true);

        testGetMyTables();
        testGetReader();
        testGetWriter();
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();

        dbApp.init();
        String tableName = "my_table";
        Hashtable<String, Object> tableColNameValue = new Hashtable<>();
        tableColNameValue.put("field1", 25);
        String strTableName = "my_table";

        dbApp.updateTable(strTableName, null, tableColNameValue);

        Mockito.when(serializer.validate()).thenReturn(true);
    }

}