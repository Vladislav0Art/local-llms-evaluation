package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries_emptyMap {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testGetRootEntries_emptyMap() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        subject.getRootEntries().putAll(new HashMap<>());
        assertEquals(0, subject.getRootEntries().size());
    }

}