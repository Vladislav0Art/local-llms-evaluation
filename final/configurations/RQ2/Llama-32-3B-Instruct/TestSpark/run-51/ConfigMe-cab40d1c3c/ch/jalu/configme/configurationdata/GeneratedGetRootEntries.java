package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries {

    @Test
    public void getRootEntries() {
        Map<String, Object> rootEntries = new HashMap<>();
        rootEntries.put("key", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(rootEntries, builder.getRootEntries());
    }

}