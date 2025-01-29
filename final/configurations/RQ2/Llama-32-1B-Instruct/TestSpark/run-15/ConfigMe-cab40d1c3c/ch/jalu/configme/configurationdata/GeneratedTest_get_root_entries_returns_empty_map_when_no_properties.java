package ch.jalu.configme.configurationdata;

public class GeneratedTest_get_root_entries_returns_empty_map_when_no_properties {

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
    public void test_get_root_entries_returns_empty_map_when_no_properties() {
        List<Property<?>> properties = new ArrayList<>();
        when(configurationProperties.getRootEntries()).thenReturn(null);
        subject.setup();
        assertEquals(Map.of(), subject.getRootEntries());
    }

}