package ch.jalu.configme.configurationdata;

public class GeneratedTest_add_property_gets_added_to_root_entries {

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
    public void test_add_property_gets_added_to_root_entries() {
        List<Property<?>> properties = List.of(new Property("property1"), new Property("property2"));
        when(configurationProperties.getRootEntries()).thenReturn(rootEntries);
        subject.add(properties.get(0));
        verify(rootEntries, times(1)).put("property1", "value1");
        verify(rootEntries, times(1)).put("property2", "value2");
    }

}