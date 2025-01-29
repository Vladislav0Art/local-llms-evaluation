package ch.jalu.configme.configurationdata;

public class GeneratedTest_get_root_entries_returns_map_with_empty_list_when_no_root_entries {

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
    public void test_get_root_entries_returns_map_with_empty_list_when_no_root_entries() {
        Map<String, Object> rootMap = new LinkedHashMap<>();
        configurationProperties.setRootEntries(rootMap);
        when(configurationProperties.getRootEntries()).thenReturn(rootMap);
        subject.setup();
        assertEquals(Map.of(), subject.getRootEntries());
    }

}