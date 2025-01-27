package ch.jalu.configme.configurationdata;

public class GeneratedTestAddNullProperty {

}

public class PropertyListBuilder {

    private java.util.List<Property> properties = new java.util.ArrayList<>();

    public void add(Property property) {
        if (property == null) {
            throw new ConfigMeException();
        }
        properties.add(property);
    }

    public java.util.List<Property> getProperties() {
        return properties;
    }
}

public class Property {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void testAddNullProperty() {
        ConfigMeException exception = assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().add(null));
        // Assert that the exception is thrown
    }

}