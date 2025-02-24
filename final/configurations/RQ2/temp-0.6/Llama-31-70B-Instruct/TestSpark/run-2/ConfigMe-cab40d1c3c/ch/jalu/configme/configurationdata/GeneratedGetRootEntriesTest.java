package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntriesTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void getRootEntriesTest() throws Exception {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertTrue(rootEntries instanceof LinkedHashMap);
    }

}