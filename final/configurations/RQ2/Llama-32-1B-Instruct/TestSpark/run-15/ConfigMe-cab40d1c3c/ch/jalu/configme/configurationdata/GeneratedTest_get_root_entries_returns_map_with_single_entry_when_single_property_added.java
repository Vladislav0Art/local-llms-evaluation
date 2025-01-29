package ch.jalu.configme.configurationdata;

public class GeneratedTest_get_root_entries_returns_map_with_single_entry_when_single_property_added {

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
    public void test_get_root_entries_returns_map_with_single_entry_when_single_property_added() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property("property1"));
        when(configurationProperties.getRootEntries()).thenReturn(rootEntries);
        subject.setup();
        assertEquals(Map.of("property1", "value1"), subject.getRootEntries());
    }

}