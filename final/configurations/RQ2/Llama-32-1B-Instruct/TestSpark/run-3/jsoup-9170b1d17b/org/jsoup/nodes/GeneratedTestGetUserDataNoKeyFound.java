package org.jsoup.nodes;

public class GeneratedTestGetUserDataNoKeyFound {

    public void getUserData(String key, Object value) {
    }
}

public class AttributeImpl implements Attributes {
    public Map<String, Object> values = new HashMap<>();

    @Test
    public void testGetUserDataNoKeyFound() {
        AttributeImpl attribute = new AttributeImpl();
        assertTrue(attribute.values.isEmpty());
    }

}