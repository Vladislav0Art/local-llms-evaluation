package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty {

    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

public class ConfigMeException extends Exception {
}

public class GeneratedTest {

    @Mock
    private List<Property> properties;

    @Test
    public void testAddProperty() {
        Property property = new Property("key", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        assertEquals(1, builder.build().size());
    }

}