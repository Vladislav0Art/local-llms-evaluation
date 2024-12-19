package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestGetWriter {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetWriter() {
        CSVWriter csvWriter = new CSVWriter();
        csvWriter.setTableName("testTable");
        csvWriter.setClusterKeyColumn("clusterKey");
        csvWriter.setColNameType(Arrays.asList("string", "int"));
        csvWriter.setColNameMin(Arrays.asList("null", null));
        csvWriter.setColNameMax(Arrays.asList(null, 1000));
        when(mockDatabase.getWriter()).thenReturn(csvWriter);
        DBApp dbApp = new DBApp();
        assertEquals(csvWriter, dbApp.getWriter());
    }

}