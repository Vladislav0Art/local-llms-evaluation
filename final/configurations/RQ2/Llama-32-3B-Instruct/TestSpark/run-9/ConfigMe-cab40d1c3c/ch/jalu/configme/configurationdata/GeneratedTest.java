package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String configuration;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<Property> properties = new ArrayList<>();

        public Builder addProperty(Property property) {
            properties.add(property);
            return this;
        }

        public List<Property> create() {
            return properties;
        }
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

}