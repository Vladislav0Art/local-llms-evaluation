package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(1, attributes.size());
        assertTrue(attributes.containsKey("key"));
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testDeduplicate() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        attributes.put("key1", "newValue"); // duplicate key
        assertEquals(2, attributes.deduplicate());
    }

    @Test
    public void testEquals() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes otherAttributes = new Attributes();
        otherAttributes.put("key", "value");
        assertTrue(attributes.equals(otherAttributes));
    }

    @Test
    public void testNotEquals() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes otherAttributes = new Attributes();
        otherAttributes.put("KEY", "value"); // different key case
        assertFalse(attributes.equals(otherAttributes));
    }
}

public class ParseSettings {
    private boolean preserveAttributeCase;

    public ParseSettings() {
        this.preserveAttributeCase = true;
    }

    public int deduplicate(Attributes attributes) {
        return attributes.deduplicate();
    }
}

public class Attributes {
    private java.util.Map<String, String> map = new java.util.HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(((String) key).toLowerCase());
    }

    @Override
    public Object get(Object key) {
        String k = ((String) key).toLowerCase();
        for (String s : map.keySet()) {
            if (s.equalsIgnoreCase(k)) return s;
        }
        return null;
    }

    public int deduplicate() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        for (String entry : map.values()) {
            set.add(entry);
        }
        return set.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Attributes attributes = (Attributes) obj;

        if (!map.keySet().equals(attributes.map.keySet()))
            return false;

        return !map.values().containsAny(attributes.map.values());
    }

}