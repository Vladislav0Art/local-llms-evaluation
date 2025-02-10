package ch.jalu.configme.configurationdata;

public class GeneratedCreate_ReturnsEmptyMap {

    private String name;
    private Object value;

    public Property(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}

public class RootEntries {
    private Map<String, Object> entries;

    public RootEntries() {
        this.entries = new LinkedHashMap<>();
    }

    public Map<String, Object> getEntries() {
        return entries;
    }

    public void setEntries(Map<String, Object> entries) {
        this.entries = entries;
    }
}

public class PropertyListBuilderTest {

    @Mock
    private Property property;

    @Mock
    private RootEntries rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void create_ReturnsEmptyMap() {
        List<Property> expectedProperties = Arrays.asList();
        when(rootEntries.getEntries()).thenReturn(new LinkedHashMap<>());
        List<Property> actualProperties = propertyListBuilder.create();
        assertEquals(expectedProperties, actualProperties);
    }
}

public class PropertyListBuilder {

    private RootEntries rootEntries;

    public PropertyListBuilder() {
        this.rootEntries = new RootEntries();
    }

    public boolean add(Property property) {
        rootEntries.setEntries(rootEntries.getEntries());
        rootEntries.getEntries().put(property.getName(), property.getValue());
        return true;
    }

    public List<Property> create() {
        List<Property> properties = new ArrayList<>();
        for (Map.Entry<String, Object> entry : rootEntries.getEntries().entrySet()) {
            Property p = new Property(entry.getKey(), entry.getValue());
            properties.add(p);
        }
        return properties;
    }

}