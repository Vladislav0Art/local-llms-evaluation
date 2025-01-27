package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String value;

    public Property(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return value.equals(property.value);
    }
}

public class ConfigMeException extends Exception {
}

class PropertyListBuilderTest {

    @Test
    public void addProperty_EmptyList_ReturnsNewList() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property p1 = new Property("test");
        Property p2 = new Property("test");
        builder.add(p1);
        builder.add(p2);
        assertEquals(1, builder.create().size());
    }

    @Test
    public void addProperty_DuplicateProperty_IgnoresDuplicate() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("test"));
        builder.add(new Property("test"));
        assertEquals(1, builder.create().size());
    }

    @Test
    public void getRootEntries_ThrowsConfigMeException() {
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().getRootEntries());
    }

    @Test
    public void create_ReturnsNonEmptyList() {
        List<Property> list = new ArrayList<>();
        Property p1 = new Property("test");
        builder.add(p1);
        PropertyListBuilder b = new PropertyListBuilder();
        assertEquals(1, b.create().size());
    }
}

public class PropertyListBuilder {

    private List<Property> properties;

    public PropertyListBuilder() {
        this.properties = new ArrayList<>();
    }

    public void add(Property property) {
        if (!properties.contains(property)) {
            properties.add(property);
        }
    }

    public List<Property> create() {
        return new ArrayList<>(properties);
    }

    public Map<String, Object> getRootEntries() {
        throw new ConfigMeException();
    }

}