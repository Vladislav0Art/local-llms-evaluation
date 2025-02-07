package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCaseWithNullKey {

    @Test
    public void testRemoveIgnoreCaseWithNullKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.removeIgnoreCase(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

}