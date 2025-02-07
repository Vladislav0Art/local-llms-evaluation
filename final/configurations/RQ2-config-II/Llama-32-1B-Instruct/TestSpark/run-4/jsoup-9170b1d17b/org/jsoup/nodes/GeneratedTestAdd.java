package org.jsoup.nodes;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attrs = new Attributes();
        String key = "key";
        String value = "value";
        attrs.add(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).get(key));
    }

}