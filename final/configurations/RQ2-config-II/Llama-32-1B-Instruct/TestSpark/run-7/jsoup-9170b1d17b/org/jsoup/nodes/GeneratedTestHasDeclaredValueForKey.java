package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        String key = "key";
        attribute1 = new Attributes().put("attr1", "value1");
        attribute2 = new Attributes().put("attr2", "value2");
        assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

}