package app;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    private DBApp dbApp;
    private CsvReader csvReader;
    private CsvWriter csvWriter;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        csvReader = mock(CsvReader.class);
        csvWriter = mock(CsvWriter.class);
    }

    @Test
    public void testGetMyTables() {
        Set<String> expectedTableNames = new HashSet<>();
        expectedTableNames.add("table1");
        expectedTableNames.add("table2");
        when(csvReader.getTableNames()).thenReturn(expectedTableNames);
        dbApp.setCsvReader(csvReader);

        Set<String> actualTableNames = dbApp.getMyTables();
        assertEquals(expectedTableNames, actualTableNames);
    }

    @Test
    public void testInit() {
        dbApp.init();
        verify(csvReader, times(1)).init();
        verify(csvWriter, times(1)).init();
    }

}