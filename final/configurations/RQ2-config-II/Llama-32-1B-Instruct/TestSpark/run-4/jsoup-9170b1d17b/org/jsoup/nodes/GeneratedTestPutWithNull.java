package org.jsoup.nodes;

public class GeneratedTestPutWithNull {

    @Test
    public void testPutWithNull() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

}