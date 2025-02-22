package app;

public class GeneratedTestCreateTable {

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