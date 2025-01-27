package ch.jalu.configme.configurationdata;

public class GeneratedTestGetPropertyList {

    private List<Property> properties = new ArrayList<>();

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public List<Property> getProperties() {
        return properties;
    }
}

public class Property {
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

public class TestPropertyListBuilder {

    @Test
    public void testGetPropertyList() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property1 = new Property("key1", "value1");
        Property property2 = new Property("key2", 123);

        propertyListBuilder.addProperty(property1);
        propertyListBuilder.addProperty(property2);

        List<Property> properties = propertyListBuilder.getProperties();

        assertEquals(2, properties.size());
        assertNotNull(properties.get(0));
        assertNotNull(properties.get(1));

        assertEquals("value1", ((Property) properties.get(0)).getValue());
        assertEquals(123, ((Property) properties.get(1)).getValue());

        assertTrue(propertyListBuilder.getProperties().contains(property1));
        assertTrue(propertyListBuilder.getProperties().contains(property2));
    }

}