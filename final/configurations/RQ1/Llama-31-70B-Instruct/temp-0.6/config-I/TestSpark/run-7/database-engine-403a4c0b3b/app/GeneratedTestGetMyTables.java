package app;

public class GeneratedTestGetMyTables {

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

}