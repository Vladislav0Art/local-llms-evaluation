package ch.jalu.configme.configurationdata;

public class GeneratedCreate_DuplicatePath_ReturnsProperties {

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
    public void create_DuplicatePath_ReturnsProperties() {
        Property property1 = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);

        Property property2 = new Property("mysql.DataSource");
        PropertyListBuilder expected = new PropertyListBuilder();
        expected.add(property2); // Expected exception
        assertEquals(expected.create(), builder.create());
    }

}