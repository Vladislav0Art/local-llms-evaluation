package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        String key = "Key";
        attribute1 = new Attributes().put("attr1", "value1");
        attribute2 = new Attributes().put("attr2", "value2");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("key"));
    }

}