package org.jsoup.nodes;

public class GeneratedTest {

    public void getUserData(String key, Object value) {
    }
}

public class AttributeImpl implements Attributes {
    public Map<String, Object> values = new HashMap<>();

    @Test
    public void testGetUserData() {
        AttributesImpl attributes = new AttributesImpl();
        attributes.getUserData("key", "value");
    }

    @Test
    public void testGetUserDataNoKeyFound() {
        AttributeImpl attribute = new AttributeImpl();
        assertTrue(attribute.values.isEmpty());
    }
}

@Test
public void testGetUserData() {
    AttributesImpl attributes = new AttributesImpl();
    Map<String, Object> map = new HashMap<>();
    map.put("key", "value");
    values.put("key", map);
    attribute.values.get("key").put("testValue", null);
    attributes.getUserData("key", values.get("key"));
}

@Test
public void testGetUserDataNoKeyFound() {
    AttributesImpl attributes = new AttributesImpl();
    assertTrue(attribute.values.isEmpty());
}
	}

@Test
public void testGetUserData() {
    AttributeImpl attribute = new AttributeImpl();
    Map<String, Object> map = new HashMap<>();
    map.put("key", "value");
    value.put("testValue", null);
    attributes.getUserData("key", value.get("key"));
}

@Test
public void testGetUserDataNoKeyFound() {
    AttributeImpl attribute = new AttributeImpl();
    assertTrue(attribute.values.isEmpty());
}

}