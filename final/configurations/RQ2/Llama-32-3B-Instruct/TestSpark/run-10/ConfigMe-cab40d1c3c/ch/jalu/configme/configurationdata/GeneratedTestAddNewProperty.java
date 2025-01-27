package ch.jalu.configme.configurationdata;

public class GeneratedTestAddNewProperty {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return Objects.equals(name, property.name) && Objects.equals(value, property.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}

public class PropertyListBuilderTest {

    @Test
    public void testAddNewProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property property1 = new Property("prop1", "value1");
        Property property2 = new Property("prop2", "value2");
        builder.add(property1);
        builder.clear();
        Property newProperty = new Property("newProp", "newValue");
        builder.add(newProperty);
        List<Property> actual = builder.create();
        assertEquals(1, actual.size());
    }
}

public class PropertyListBuilder {
    private List<Property> properties;

    public void add(Property property) {
        properties.add(property);
    }

    public void clear() {
        properties.clear();
    }

    public List<Property> create() {
        return properties;
    }

}