package org.jsoup.nodes;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
    }

}