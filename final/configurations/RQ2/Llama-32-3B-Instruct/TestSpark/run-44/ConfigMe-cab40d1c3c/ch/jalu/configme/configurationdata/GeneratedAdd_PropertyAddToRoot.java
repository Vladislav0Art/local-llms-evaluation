package ch.jalu.configme.configurationdata;

public class GeneratedAdd_PropertyAddToRoot {

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
    public void add_PropertyAddToRoot() {
        List<Property> expectedProperties = Arrays.asList(property);
        when(rootEntries.getEntries()).thenReturn(new LinkedHashMap<>());
        boolean result = propertyListBuilder.add(property);
        assertTrue(result);
        assertEquals(1, ((LinkedHashMap<String, Object>) rootEntries.getEntries()).size());
    }

}