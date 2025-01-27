package ch.jalu.configme.configurationdata;

public class GeneratedTestConfigMeBuilder {

    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class ConfigMeBuilder {
    private List<Property> properties;

    public ConfigMeBuilder() {
        this.properties = new ArrayList<>();
    }

    public void add(String key, String value) {
        properties.add(new Property(key, value));
    }

    public List<Property> getProperties() {
        return properties;
    }
}

public class GeneratedTest {

    @Test
    public void testConfigMeBuilder() {
        // Arrange
        ConfigMeBuilder builder = new ConfigMeBuilder();
        List<Property> properties = new ArrayList<>();

        // Act
        builder.add("Property1", "Value1");
        builder.add("Property2", "Value2");

        // Assert
        assertEquals(2, builder.getProperties().size());
    }

}