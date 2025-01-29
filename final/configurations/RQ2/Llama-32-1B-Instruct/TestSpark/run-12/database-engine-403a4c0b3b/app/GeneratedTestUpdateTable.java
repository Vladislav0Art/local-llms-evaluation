package app;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.*;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestUpdateTable {

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
    public void testUpdateTable() throws Exception {
        DBApp dbApp = new DBApp();
        TreeSet<String> columns = new TreeSet<>();
        columns.add("column1");
        columns.add("column2");
        when(csvReader.getRows()).thenReturn(null);
        when(csvWriter.getRows()).thenReturn(null);
        String[] columnNames = {"column1", "column2"};
        dbApp.init();
        dbApp.createTable("my_table_name", columnNames, null, null, null);
        List<Object> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        dbApp.insertIntoTable("my_table_name", values);
        when(dbApp.updateTable("my_table_name", "column1", values)).thenReturn(true);
        dbApp.updateTable("my_table_name", "column1", values);
        assertEquals(1, dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"", ""}).size());
    }

}