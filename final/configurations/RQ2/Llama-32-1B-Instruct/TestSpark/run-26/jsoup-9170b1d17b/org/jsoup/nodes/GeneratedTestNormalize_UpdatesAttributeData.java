package org.jsoup.nodes;

public class GeneratedTestNormalize_UpdatesAttributeData {

    private Attributes attributes;

    @Test
    public void testNormalize_UpdatesAttributeData() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertTrue(attributes.normalize());
        assertEquals(value, attributes.get(key));
    }

}