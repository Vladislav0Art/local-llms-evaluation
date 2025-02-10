package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate {

    private String value;

    public Property() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class List {
    public static <T> List<T> newArrayList(T... elements) {
        // implementation
        return null;
    }
}

public class Map {
    public static class LinkedHashMap extends java.util.HashMap<String, Object> {
    }
}

public interface ConfigMeException {
    class ConfigMeException extends Exception {
    }
}

public class PropertyListBuilder {

    private List<Property> properties = new ArrayList<>();

    public void add(Property property) {
        if (property == null) {
            throw new ConfigMeException(ConfigMeException.ConfigMeException);
        }
        this.properties.add(property);
    }

    public Map<String, Object> getRootEntries() {
        return new Map().entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()))
                .collect(Collectors.toMap(
                        SimpleEntry::getKey,
                        SimpleEntry::getValue,
                        (oldValue, newValue) -> oldValue, Collectors.toMap()));
    }

    public List<Property> create() {
        return properties;
    }
}

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testCreate() {
        List<Property> properties = propertyListBuilder.create();
        // implementation
    }

}