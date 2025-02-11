package ch.jalu.configme.configurationdata;

public class GeneratedCreate_UnexpectedValue_ReturnsProperties {

    private String path;

    public String getPath() {
        return path;
    }

    public Property(String path) {
        this.path = path;
    }
}

public class ConfigMeException extends Exception {
    public ConfigMeException(String message) {
        super(message);
    }
}

public class PropertyListBuilder {

    private List<Property> rootEntries;

    public PropertyListBuilder() {
        this.rootEntries = new ArrayList<>();
    }

    public void add(Property property) {
        if (property.getPath().split("\\.").length != 1) {
            throw new ConfigMeException("Invalid path: " + property.getPath());
        }
        rootEntries.add(property);
    }

    public List<Property> getRootEntries() {
        return rootEntries;
    }

    public List<Property> create() {
        return Collections.unmodifiableList(rootEntries);
    }
}

public class PropertyListBuilderTest {

    @Test
    public void create_UnexpectedValue_ReturnsProperties() {
        Property property = new Property("InvalidPath");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(builder.create(), builder.create());
    }

}