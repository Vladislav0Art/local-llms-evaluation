package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    private static final Document document = new Document();

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        String key = "TEST";
        Attributes attributes = new Attributes(document);
        attributes.put("key", "value");
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase(key));
        attributes.add("key", "value2");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

}