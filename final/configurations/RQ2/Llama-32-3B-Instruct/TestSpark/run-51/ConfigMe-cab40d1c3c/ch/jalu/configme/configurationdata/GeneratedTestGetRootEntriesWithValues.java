package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntriesWithValues {

    @Test
    public void testGetRootEntriesWithValues() {
        Map<String, Object> rootEntries = new HashMap<>();
        rootEntries.put("key1", "value1");
        rootEntries.put("key2", "value2");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> actualRootEntries = propertyListBuilder.getRootEntries();
        assertEquals(rootEntries, actualRootEntries);
    }

    public class PropertyListBuilder {
        private Map<String, Object> rootEntries;

        public Map<String, Object> getRootEntries() {
            return rootEntries;
        }
    }

}