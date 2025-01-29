package app;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.*;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestCreateTable {

    @Mock
    private CSVReader csvReader;

    @Mock
    private CSVWriter csvWriter;

    public void testGetMyTables() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = new HashSet<>();
        myTables.add("table1");
        when(csvReader.getRows()).thenReturn(myTables);
        String[] columns = {"column1", "column2"};
        dbApp.init();
        dbApp.createTable("my_table_name", columns, null, null, null);
        TreeSet<String> result = new TreeSet<>(dbApp.getMyTables());
        assertEquals(myTables, result);
    }

    @Test
    public void testCreateTable() throws Exception {
        DBApp dbApp = new DBApp();
        TreeSet<String> columns = new TreeSet<>();
        columns.add("column1");
        columns.add("column2");
        when(csvReader.getRows()).thenReturn(null);
        when(csvWriter.getRows()).thenReturn(null);
        String[] columnNames = {"column1", "column2"};
        dbApp.init();
        dbApp.createTable("my_table_name", columnNames, null, null, null);
        HashSet<String> result = new HashSet<>();
        for (String column : columns) {
            result.add(column);
        }
        assertEquals(columns, result);
    }

}