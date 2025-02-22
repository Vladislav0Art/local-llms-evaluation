package app;

public class GeneratedTestGetWriter {

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
    public void testGetWriter() {
        CsvWriter actualWriter = dbApp.getWriter();
        assertEquals(writer, actualWriter);
    }

}