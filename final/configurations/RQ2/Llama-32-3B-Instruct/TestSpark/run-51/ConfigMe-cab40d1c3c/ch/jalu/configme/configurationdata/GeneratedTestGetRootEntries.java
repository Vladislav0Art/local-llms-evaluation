package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() {
        Map<String, Object> rootEntries = new HashMap<>();
        // setup here
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> actualRootEntries = propertyListBuilder.getRootEntries();
        assertEquals(rootEntries, actualRootEntries);
    }

}