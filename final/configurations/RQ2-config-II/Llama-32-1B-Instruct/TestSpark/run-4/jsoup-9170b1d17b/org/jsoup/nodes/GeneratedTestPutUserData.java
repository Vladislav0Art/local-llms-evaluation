package org.jsoup.nodes;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putUserData(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).getUserData(key));
    }

}