package ch.jalu.configme.configurationdata;

public class GeneratedTest_get_root_entries_Returns_null_if_root_entries_are_none {

    private ConfigurationProperties configurationProperties;
    private Map<String, Object> rootEntries;

    @Mock
    private PropertyListBuilder subject;

    @Before
    public void setup() throws Exception {
        configurationProperties = new ConfigurationProperties();
        rootEntries = new LinkedHashMap<>();
    }

    @Test
    public void test_get_root_entries_Returns_null_if_root_entries_are_none() {
        when(configurationProperties.getRootEntries()).thenReturn(null);
        subject.setup();
        assertEquals(null, subject.getRootEntries());
    }

}