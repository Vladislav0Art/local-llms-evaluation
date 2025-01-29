package ch.jalu.configme.configurationdata;

public class GeneratedTest_get_root_entries Returns_null_if_root_entries_are_none {

    private PropertyListBuilder subject;

    @Mock
    private ConfigurationProperties configurationProperties;

    @Spy
    private Map<String, Object> rootEntries;

    public void setup() throws Exception {
        subject = new PropertyListBuilder();
    }

    @Test
    public void test_get_root_entries

    Returns_null_if_root_entries_are_none() {
        when(rootEntries).isEmpty().thenReturn(true);
        assertEquals(null, subject.getRootEntries());
    }

}