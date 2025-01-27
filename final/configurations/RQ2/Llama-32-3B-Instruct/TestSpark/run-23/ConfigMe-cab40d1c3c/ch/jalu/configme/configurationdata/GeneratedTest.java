package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String key;

    public Property(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "key=" + key;
    }
}

public class PropertyBuilder {
    private Map<String, Object> entries = new HashMap<>();

    public Property add(String key, Object value) {
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        entries.put(key, value);
        return this;
    }

    public List<Property> getProperties() {
        return new ArrayList<>(entries.values());
    }

    public static PropertyBuilder createPropertyBuilder() {
        return new PropertyBuilder();
    }
}

public class PropertyBuilderTest {

    private static final String EXPECTED_ERROR_MESSAGE = "Value cannot be null";
    private PropertyBuilder propertyBuilder = PropertyBuilder.createPropertyBuilder();

}