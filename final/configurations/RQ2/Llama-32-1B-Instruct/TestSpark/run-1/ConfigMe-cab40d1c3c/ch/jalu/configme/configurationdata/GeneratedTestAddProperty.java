package ch.jalu.configme.configurationdata;

import java.util.function.Function;

public class GeneratedTestAddProperty {

    public ConfigMeException(String message) {
        super(message);
    }
}

public interface Property {
    String getValue();

    void setValue(String value);
}

public class ConfigMeBuilder {
    private final Function<ConfigMeException, Property> createProperty;

    public ConfigMeBuilder(Function<ConfigMeException, Property> createProperty) {
        this.createProperty = createProperty;
    }

    public <T extends ConfigMeException> T add(T property) throws ConfigMeException {
        return (T) createProperty.apply(property);
    }
}

public class ConfigMe implements ConfigMeException {
    private final String message;

    public ConfigMe(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

class TestConfigMeBuilder extends ConfigMeBuilder {
    @Override
    public Property addProperty(Function<ConfigMeException, Property> createProperty) {
        return (property) -> createProperty.apply(new ConfigMe("Hello"));
    }

    @Override
    public boolean isReady() {
        return true;
    }
}

public class TestConfigMe {

    private final TestConfigMeBuilder builder;

    public TestConfigMe(TestConfigMeBuilder builder) {
        this.builder = builder;
    }

    public void addProperty(Function<ConfigMeException, Property> createProperty) throws ConfigMeException {
        builder.addProperty(createProperty);
    }

    @Test
    public void testAddProperty() throws ConfigMeException {
        TestConfigMeBuilder builder = new TestConfigMeBuilder(() -> new TestConfigMe());
        String message = "Hello";
        Property property = builder.addProperty(message);
        System.out.println(property.getValue()); // prints: Hello
    }

}