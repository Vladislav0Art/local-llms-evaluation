package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries_success {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testGetRootEntries_success() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        rootEntries.put("key1", "value1");
        rootEntries.put("key2", "value2");
        subject.getRootEntries().putAll(rootEntries);
        assertEquals(2, subject.getRootEntries().size());
    }

}