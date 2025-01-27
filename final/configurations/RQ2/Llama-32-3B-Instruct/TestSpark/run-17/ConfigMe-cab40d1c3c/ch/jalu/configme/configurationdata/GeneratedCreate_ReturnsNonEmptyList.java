package ch.jalu.configme.configurationdata;

public class GeneratedCreate_ReturnsNonEmptyList {

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