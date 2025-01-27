package ch.jalu.configme.configurationdata;

public class GeneratedTestPut {

    private Map<String, Object> entries = new LinkedHashMap<>();

    public static Map<String, Object> getRootEntries() {
        return new LinkedHashMap<>();
    }

    public static void put(String key, Object value) {
        // no-op implementation
    }
}

public class TestPropertyListBuilder {

    @Test
    public void testPut() {
        PropertyListBuilder builder = new PropertyListBuilder();
        PropertyListBuilder.put("key1", "value1");
        Map<String, Object> result = PropertyListBuilder.getRootEntries();
        assertEquals(1, result.size());
    }

}