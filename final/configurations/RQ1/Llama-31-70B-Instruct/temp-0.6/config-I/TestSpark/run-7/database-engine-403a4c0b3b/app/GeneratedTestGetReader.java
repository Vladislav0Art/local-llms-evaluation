package app;

public class GeneratedTestGetReader {

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
    public void testGetReader() {
        CsvReader actualReader = dbApp.getReader();
        assertEquals(reader, actualReader);
    }

}