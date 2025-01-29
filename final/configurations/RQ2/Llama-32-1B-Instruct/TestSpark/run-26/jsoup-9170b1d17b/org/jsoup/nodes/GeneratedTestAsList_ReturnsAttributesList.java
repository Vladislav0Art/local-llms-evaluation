package org.jsoup.nodes;

public class GeneratedTestAsList_ReturnsAttributesList {

    private Attributes attributes;

    @Test
    public void testAsList_ReturnsAttributesList() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
        assertTrue(list.containsValue("value1"));
    }

}