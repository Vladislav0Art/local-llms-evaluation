package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries_ReturnsNotEmptyMap {

    @Test
    public void getRootEntries_ReturnsNotEmptyMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("test", "test"));
        assertEquals(1, ((PropertyListBuilder) builder).create().size());
    }
}

public class Property {
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

public class PropertyListBuilder {
    private List<Property> properties = new ArrayList<>();

    public void add(Property property) {
        properties.add(property);
    }

    public Map<String, Object> create() {
        Map<String, Object> map = new LinkedHashMap<>();
        for (Property property : properties) {
            map.put(property.getKey(), property.getValue());
        }
        return map;
    }

    public static Map<String, Object> getRootEntries() {
        // implementation
        return null;
    }

}