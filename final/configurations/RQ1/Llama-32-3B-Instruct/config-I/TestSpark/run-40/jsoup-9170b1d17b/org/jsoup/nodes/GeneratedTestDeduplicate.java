package org.jsoup.nodes;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        attributes.put("key1", "newValue"); // duplicate key
        assertEquals(2, attributes.deduplicate());
    }

}