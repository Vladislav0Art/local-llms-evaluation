package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("key", "value"));
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key", properties.get(0).getKey());
        assertEquals("value", properties.get(0).getValue());
    }

}