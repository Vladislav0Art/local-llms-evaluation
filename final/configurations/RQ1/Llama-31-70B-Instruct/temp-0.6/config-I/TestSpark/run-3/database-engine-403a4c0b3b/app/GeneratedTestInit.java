package app;

import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestInit {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
    }

    @Test
    public void testInit() {
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());
        dbApp.init();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}