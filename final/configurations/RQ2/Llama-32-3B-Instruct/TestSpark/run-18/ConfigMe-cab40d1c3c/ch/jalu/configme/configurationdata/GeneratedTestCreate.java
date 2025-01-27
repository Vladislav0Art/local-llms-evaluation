package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate {

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
    public void testCreate() {
        Config config = new Config();
        assertEquals(0, config.getRootEntries().size());
    }

}