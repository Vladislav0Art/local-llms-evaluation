package ch.jalu.configme.configurationdata;

public class GeneratedTestRootEntries {

    private Map<String, Object> entries = new LinkedHashMap<>();

    public Map<String, Object> getRootEntries() {
        return entries;
    }

    public void put(String key, Object value) {
        this.entries.put(key, value);
    }
}

public class TestPropertyListBuilder {

    @Test
    public void testRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> result = builder.getRootEntries();
        assertEquals(0, result.size());
    }

}