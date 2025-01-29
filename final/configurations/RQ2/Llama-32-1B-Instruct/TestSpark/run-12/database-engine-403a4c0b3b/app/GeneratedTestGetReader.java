package app;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.*;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestGetReader {

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
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        when(csvReader.getRows()).thenReturn(null);
        CsvReader csvReaderMock = Mockito.mock(CsvReader.class);
        MockitoAnnotations.initMocks(this);
        dbApp.init();
        dbApp.getReader().setCsvReader(csvReaderMock);
        dbApp.createTable("my_table_name", null, null, null, null);
        String[] columns = {"column1", "column2"};
        when(csvReader.getRows()).thenReturn(columns);
        dbApp.init();
        String[] result = dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"", ""});
        assertEquals(columns, result);
    }

}