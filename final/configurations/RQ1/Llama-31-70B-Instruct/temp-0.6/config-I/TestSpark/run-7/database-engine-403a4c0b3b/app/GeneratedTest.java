package app;

public class GeneratedTest {

    @Mock
    private HashSet<String> tables;
    @Mock
    private CsvReader reader;
    @Mock
    private CsvWriter writer;
    @Mock
    private Object clusteringKey;

    @InjectMocks
    private DBApp dbApp;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> actualTables = dbApp.getMyTables();
        assertEquals(tables, actualTables);
    }

    @Test
    public void testGetReader() {
        CsvReader actualReader = dbApp.getReader();
        assertEquals(reader, actualReader);
    }

    @Test
    public void testGetWriter() {
        CsvWriter actualWriter = dbApp.getWriter();
        assertEquals(writer, actualWriter);
    }

    @Test
    public void testInit() {
        dbApp.init();
        verify(reader).readAllTables();
    }

    @Test
    public void testCreateTable() {
        String strTableName = "tableName";
        String strClusteringKeyColumn = "keyColumn";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail("Unexpected Exception");
        }
        verify(writer).write(any());
    }

}