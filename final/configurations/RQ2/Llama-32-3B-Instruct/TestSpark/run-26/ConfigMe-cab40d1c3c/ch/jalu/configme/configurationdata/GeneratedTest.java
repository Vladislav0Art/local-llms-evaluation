package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String key;
    private String value;

    public Property() {
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class ConfigMeBuilder {
    private List<Property> properties;

    public ConfigMeBuilder() {
        this.properties = new ArrayList<>();
    }

    public void add(String key, String value) {
        Property property = new Property();
        property.keySet(key);
        property.setValue(value);
        properties.add(property);
    }

    public List<Property> getProperties() {
        return properties;
    }
}

public class GeneratedTest {

    @Test
    public void getRootEntriesEmptyMapTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertTrue(builder.getRootEntries().isEmpty());
    }

}