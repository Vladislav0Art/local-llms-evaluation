package org.jsoup.safety;

public class GeneratedTestEnforcedAttributesGetAll {

    private final Attributes enforced;

    public EnforcedAttributes(Attributes attributes) {
        this.enforced = new Attributes();
        for (AttributeKey key : attributes.keys()) {
            if (!key.toString().equals("all") && !enforced.containsKey(key)) {
                enforced.put(key, attributes.get(key));
            }
        }
    }

    public String get(String key) {
        return enforced.get(key);
    }

    public boolean has(String key) {
        return enforced.containsKey(key);
    }
}

public class Attributes {
    private final Map<AttributeKey, AttributeValue> attributes = new HashMap<>();

    public void put(AttributeKey key, AttributeValue value) {
        attributes.put(key, value);
    }

    public String get(String key) {
        return attributes.get(key).toString();
    }

    public boolean has(String key) {
        return attributes.containsKey(key);
    }

    public Set<AttributeKey> keys() {
        return attributes.keySet();
    }
}

public class TestEnforcedAttributes {

    @Test
    public void testEnforcedAttributesGetAll() {
        Attributes attributes = new Attributes();
        EnforcedAttributes enforcedAttributes = new EnforcedAttributes(attributes);
        assertEquals(0, Integer.parseInt(enforcedAttributes.get("all")));
    }

}