package org.jsoup.safety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Thunk;

public class GeneratedTestAttributesWithoutNullKey {

    @Test
    public void testAttributesWithoutNullKey() {
        Element element = new Element();
        Assertions.assertThrows(NullPointerException.class, () -> element.getAttributeValue(null));
    }
}

public class Element {
    private Attributes attributes;

    public Element() {
        this.attributes = new Attributes();
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public String absUrl(AttributeKey key) {
        return attributes.absUrl(key);
    }
}

public class Attributes {

    private Map<String, AttributeValue> values;

    public Attributes() {
        this.values = new HashMap<>();
    }

    public void put(String key, String value) {
        values.put(key, new AttributeValue(value));
    }

    @Override
    public boolean containsKeyIgnoreCase(String key) {
        // implementation omitted for brevity
        return false;
    }

    public String absUrl(AttributeKey key) {
        return values.get(key).getValue();
    }
}

public class Attribute {
    private String value;

    public Attribute(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }
}

public class AttributeKey implements Comparable<AttributeKey> {
    private static final Set<String> SAFE_ATTRIBUTES = new HashSet<>(Arrays.asList("src", "href"));

    private String key;

    public AttributeKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeKey attributeKey = (AttributeKey) o;
        return Objects.equals(key, attributeKey.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return "AttributeKey{" +
                "key='" + key + '\'' +
                '}';
    }

}