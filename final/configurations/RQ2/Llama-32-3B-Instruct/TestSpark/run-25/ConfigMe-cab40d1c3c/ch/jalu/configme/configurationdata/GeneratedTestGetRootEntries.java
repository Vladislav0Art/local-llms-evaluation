package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries {

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
    public void testGetRootEntries() {
        Map<String, Object> result = PropertyListBuilder.getRootEntries();
        assertEquals(0, result.size());
    }

}