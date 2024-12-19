package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestGetReader {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetReader() {
        CSVReader csvReader = new CSVReader();
        csvReader.setTableName("testTable");
        csvReader.setClusterKeyColumn("clusterKey");
        csvReader.setColNameType(Arrays.asList("string", "int"));
        csvReader.setColNameMin(Arrays.asList("null", null));
        csvReader.setColNameMax(Arrays.asList(null, 1000));
        when(mockDatabase.getReader()).thenReturn(csvReader);
        DBApp dbApp = new DBApp();
        assertEquals(csvReader, dbApp.getReader());
    }

}