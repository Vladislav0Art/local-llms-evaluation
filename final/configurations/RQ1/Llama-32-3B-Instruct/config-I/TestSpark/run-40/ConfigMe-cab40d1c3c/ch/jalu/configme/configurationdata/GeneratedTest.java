package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void add_ValidProperty_ReturnsNoException() {
        Property property = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        assertNotNull(builder.getRootEntries());
    }

    @Test
    public void add_DuplicatePath_ThrowsConfigMeException() {
        Property property1 = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);

        Property property2 = new Property("mysql.DataSource");
        try {
            builder.add(property2);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Pass
        }
    }

    @Test
    public void add_InvalidPath_ThrowsConfigMeException() {
        Property property = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Pass
        }
    }

    @Test
    public void add_UnexpectedValue_ThrowsConfigMeException() {
        Property property = new Property("InvalidPath");
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Pass
        }
    }

    @Test
    public void create_ValidPropertyReturnsProperties() {
        Property property = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        List<Property> result = builder.create();
        assertEquals(1, result.size());
    }

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

    @Test
    public void create_InvalidPath_ReturnsProperties() {
        Property property = new Property("DataSource(mysql)");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(builder.create(), builder.create());
    }

    @Test
    public void create_UnexpectedValue_ReturnsProperties() {
        Property property = new Property("InvalidPath");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(builder.create(), builder.create());
    }

}