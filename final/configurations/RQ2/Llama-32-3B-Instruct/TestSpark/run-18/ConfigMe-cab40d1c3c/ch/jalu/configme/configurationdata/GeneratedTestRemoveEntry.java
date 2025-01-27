package ch.jalu.configme.configurationdata;

public class GeneratedTestRemoveEntry {

    private Map<String, Object> rootEntries = new LinkedHashMap<>();

    public void addEntry(String key, String value) {
        rootEntries.put(key, value);
    }

    public String getEntry(String key) {
        return (String) rootEntries.get(key);
    }

    public boolean removeEntry(String key) {
        return rootEntries.remove(key) != null;
    }

    public Map<String, Object> getRootEntries() {
        return new HashMap<>(rootEntries);
    }
}

public class TestConfig {

    @Test
    public void testRemoveEntry() {
        Config config = new Config();
        String key1 = "key1";
        String value1 = "value1";
        config.addEntry(key1, value1);
        config.removeEntry(key1);
        assertEquals(0, config.getRootEntries().size());
    }

}