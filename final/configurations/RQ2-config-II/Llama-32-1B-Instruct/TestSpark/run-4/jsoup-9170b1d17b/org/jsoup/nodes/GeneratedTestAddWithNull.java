package org.jsoup.nodes;

public class GeneratedTestAddWithNull {

    @Test
    public void testAddWithNull() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.add(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

}