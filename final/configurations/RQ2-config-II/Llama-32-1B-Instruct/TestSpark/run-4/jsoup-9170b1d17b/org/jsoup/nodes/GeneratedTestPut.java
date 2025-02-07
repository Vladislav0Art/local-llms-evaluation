package org.jsoup.nodes;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = "value";
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).getUserData(key));
    }

}