package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries {

    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

public class ConfigMeException extends Exception {
}

public class GeneratedTest {

    @Mock
    private List<Property> properties;

    @Test
    public void testGetRootEntries() {
        Property property = new Property("key", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        assertEquals(0, builder.getRootEntries());
    }
}

public class PropertyListBuilder {

    private List<Property> properties;

    public PropertyListBuilder() {
        this.properties = new ArrayList<>();
    }

    public PropertyListBuilder add(Property property) {
        this.properties.add(property);
        return this;
    }

    public List<Property> build() {
        return Collections.unmodifiableList(properties);
    }

    public Map<String, Object> getRootEntries() {
        // implement logic to get root entries
        return Collections.emptyMap();
    }

}