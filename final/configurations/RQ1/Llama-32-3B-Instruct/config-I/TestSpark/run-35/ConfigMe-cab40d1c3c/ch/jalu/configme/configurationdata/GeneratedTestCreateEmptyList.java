package ch.jalu.configme.configurationdata;

public class GeneratedTestCreateEmptyList {

    private String path;
    private Object value;

    public Property(String path, Object value) {
        this.path = path;
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public Object getValue() {
        return value;
    }
}

public class ConfigMeException extends Exception {
}

public class PropertyListBuilder {

    private Map<String, Object> rootEntries;

    public PropertyListBuilder() {
        this.rootEntries = new HashMap<>();
    }

    public void add(Property<?> property) throws ConfigMeException {
        if (property.getValue() == null) {
            throw new ConfigMeException("Value cannot be null");
        }
        rootEntries.put(property.getPath(), null);
    }

    public Map<String, Object> getRootEntries() {
        return rootEntries;
    }

    public List<Property<?>> create() {
        return new ArrayList<>(rootEntries.values());
    }
}

public class GeneratedTest {

    @Mock
    private Map<String, Object> mockRootEntries;

    @Before
    public void setUp() {
        when(mockRootEntries).thenReturn(new HashMap<>());
    }

    @Test
    public void testCreateEmptyList() {
        new PropertyListBuilder().create();
        assertTrue(new ArrayList<>().isEmpty());
    }

}