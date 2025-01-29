package ch.jalu.configme.configurationdata;

public class GeneratedTestGetEmptyConfig {

    @Test
    public void testGetEmptyConfig() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = Collections.emptyMap();
        List<Property<?>> properties = builder.create();
        assertNull(properties);
    }

}