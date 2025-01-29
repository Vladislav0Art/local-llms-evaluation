package ch.jalu.configme.configurationdata;

public class GeneratedTestAddMultipleProperties {

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

}