package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntriesFromConfig {

    @Test
    public void testGetRootEntriesFromConfig() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.singletonMap("key1", "value1");
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals("key1", properties.get(0).getKey());
        assertEquals("value1", properties.get(0).getValue());
    }

}