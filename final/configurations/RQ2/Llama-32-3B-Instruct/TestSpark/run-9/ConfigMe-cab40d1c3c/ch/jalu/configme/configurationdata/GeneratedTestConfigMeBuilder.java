package ch.jalu.configme.configurationdata;

public class GeneratedTestConfigMeBuilder {

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
    public void testConfigMeBuilder() {
        ConfigMe.Builder builder = new ConfigMe.Builder();
        List<Property> properties = builder.addProperty(new Property("test")).create();
        Assertions.assertNotNull(properties);
    }

}