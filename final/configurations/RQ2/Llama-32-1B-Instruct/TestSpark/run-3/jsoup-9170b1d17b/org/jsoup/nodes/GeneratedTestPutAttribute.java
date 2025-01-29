package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    // ...

    @Test
    public void testPutAttribute() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        Attribute attribute = new Attribute("testAttribute", "testValue");
        attributes.put(attribute);
        assertEquals(attribute, attributes.getUserData(key));
    }
}

public class AttributeImpl implements Attributes {
    private final String value;

    public AttributeImpl(String value) {
        this.value = value;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public String getIgnoreCase(String key) {
        return null;
    }

    @Nullable
    public Object getUserData(String key) {
        return null;
    }
}

public class AttributesImpl implements Attributes {
    private final Map<String, Object> values = new HashMap<>();

    @Override
    public void put(String key, boolean value) {
        this.values.put(key, value);
    }

    @Override
    public void put(String key, String value) {
        this.values.put(key, value);
    }

    @Override
    public int size() {
        return values.size();
    }

}