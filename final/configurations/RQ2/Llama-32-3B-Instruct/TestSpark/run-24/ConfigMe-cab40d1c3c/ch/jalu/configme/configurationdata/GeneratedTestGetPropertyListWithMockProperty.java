package ch.jalu.configme.configurationdata;

public class GeneratedTestGetPropertyListWithMockProperty {

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
    public void testGetPropertyListWithMockProperty() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = mock(Property.class);

        when(mockProperty.getKey()).thenReturn("mockKey");
        when(mockProperty.getValue()).thenReturn("mockValue");

        List<Property> properties = propertyListBuilder.getProperties();

        assertEquals(1, properties.size());
        assertNotNull(properties.get(0));

        assertEquals("mockKey", ((Property) properties.get(0)).getKey());
        assertEquals("mockValue", ((Property) properties.get(0)).getValue());

        assertTrue(propertyListBuilder.getProperties().contains(mockProperty));
    }

}