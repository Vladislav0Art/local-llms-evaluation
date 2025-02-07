package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCase {

    @Test
    public void testPutIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

}