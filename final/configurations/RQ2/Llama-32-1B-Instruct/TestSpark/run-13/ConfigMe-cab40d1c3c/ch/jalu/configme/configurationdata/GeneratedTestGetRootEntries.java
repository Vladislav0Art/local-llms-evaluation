package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.singletonMap("key", "value");
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key", properties.get(0).getKey());
        assertEquals("value", properties.get(0).getValue());
    }

}