package org.jsoup.nodes;

public class GeneratedTestPut_UpdatesAttribute {

    private Attributes attributes;

    @Test
    public void testPut_UpdatesAttribute() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}