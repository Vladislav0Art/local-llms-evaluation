package ch.jalu.configme.configurationdata;

public class GeneratedCreateRootEntries {

    @Test
    public void createRootEntries() {
        Map<String, Object> rootEntries = new HashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(rootEntries, builder.getRootEntries());
    }

}