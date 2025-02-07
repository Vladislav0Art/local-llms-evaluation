package org.jsoup.nodes;

public class GeneratedTestRemoveAttribute {

    private Attributes attributes;

    @Test
    public void testRemoveAttribute() {
        String key = "test";
        Attribute attribute = new Attr("test", "value");
        Attributes attributes = new Attributes();
        attributes.put(key, attribute);
        attributes.remove(key);

        assertEquals(null, attributes.getUserData(key));
    }

}