package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    public static class Property {
        // Add properties here
    }

    public static class Map {
        // Add map entries here
    }

    @Test
    public void testGetRootEntriesEmptyMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, builder.getRootEntries().size());
    }

}