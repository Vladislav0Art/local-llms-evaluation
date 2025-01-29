package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    private static final Document document = new Document();

    @Test
    public void testHasDeclaredValueForKey() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.put("key", "value");
        assertFalse(attributes.hasDeclaredValueForKey(key));
        attributes.add("key", "value2");
        assertTrue(attributes.hasDeclaredValueForKey(key));
    }

}