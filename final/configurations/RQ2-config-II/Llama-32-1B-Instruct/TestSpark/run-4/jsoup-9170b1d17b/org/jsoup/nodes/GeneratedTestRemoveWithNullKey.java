package org.jsoup.nodes;

public class GeneratedTestRemoveWithNullKey {

    @Test
    public void testRemoveWithNullKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.remove(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

}