package org.jsoup.nodes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.remove(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

}