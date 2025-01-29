package ch.jalu.configme.configurationdata;

public class GeneratedTest_add_property_returns_empty_list_when_no_properties_added {

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
    public void test_add_property_returns_empty_list_when_no_properties_added() {
        when(configurationProperties.getRootEntries()).thenReturn(null);
        List<Property<?>> properties = new ArrayList<>();
        subject.add(properties);
        verify(rootEntries, times(0)).put("property1", "value1");
        verify(rootEntries, times(0)).put("property2", "value2");
    }

}