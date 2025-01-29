package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void testAddProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("key", "value"));
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key", properties.get(0).getKey());
        assertEquals("value", properties.get(0).getValue());
    }

    @Test
    public void testAddMultipleProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> properties = Arrays.asList(
                new Property("key1", "value1"),
                new Property("key2", "value2")
        );
        List<Property<?>> propertiesCopy = new ArrayList<>(properties);
        properties.add(new Property("key3", "value3"));
        builder.add(properties.get(0));
        builder.add(properties.get(1));
        List<Property<?>> propertiesFinal = builder.create();
        assertEquals(4, properties.size());
        for (int i = 0; i < propertiesFinal.size(); i++) {
            assertEquals(propertiesCopy.get(i).getKey(), propertiesFinal.get(i).getKey());
            assertEquals(propertiesCopy.get(i).getValue(), propertiesFinal.get(i).getValue());
        }
    }

    @Test
    public void testGetRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.singletonMap("key", "value");
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key", properties.get(0).getKey());
        assertEquals("value", properties.get(0).getValue());
    }

    @Test
    public void testGetRootEntriesFromConfig() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.singletonMap("key1", "value1");
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key1", properties.get(0).getKey());
        assertEquals("value1", properties.get(0).getValue());
    }

    @Test
    public void testGetEmptyConfig() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.emptyMap();
        List<Property<?>> properties = builder.create();
        assertNull(properties);
    }

}