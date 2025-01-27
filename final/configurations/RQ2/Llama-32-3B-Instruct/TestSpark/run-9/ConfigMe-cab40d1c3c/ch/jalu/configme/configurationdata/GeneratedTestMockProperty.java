package ch.jalu.configme.configurationdata;

public class GeneratedTestMockProperty {

    private String configuration;

    public static class Builder {
        private List<Property> properties = new ArrayList<>();

        public void addProperty(Property property) {
            properties.add(property);
        }

        public List<Property> create() {
            return properties;
        }
    }

    public ConfigMe(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }
}

public class Property {
    private String configuration;

    public Property(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }
}

public class ConfigMeException extends RuntimeException {

}

public class ConfigMeTest {

    @Test
    public void testMockProperty() {
        Property property = new Property("test");
        // Verify that the mock object is correctly set up.
        Assertions.assertEquals("test", property.getConfiguration());
    }

}