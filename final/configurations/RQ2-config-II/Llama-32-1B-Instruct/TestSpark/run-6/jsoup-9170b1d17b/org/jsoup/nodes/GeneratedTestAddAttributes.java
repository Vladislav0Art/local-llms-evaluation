package org.jsoup.nodes;

public class GeneratedTestAddAttributes {

    private Attributes attributes;

    @Test
    public void testAddAttributes() {
        String key1 = "key1";
        String key2 = "key2";
        Attribute attribute1 = new Attr("attr1", "value1");
        Attribute attribute2 = new Attr("attr2", "value2");

        Attributes attributes3 = new Attributes();
        attributes3.add(key1, attribute1);
        attributes3.add(key2, attribute2);

        List<Attribute> list = attributes3.asList();

        assertEquals(2, list.size());
    }

}