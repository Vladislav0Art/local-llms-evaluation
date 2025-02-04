package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTest {

    private Attributes attributes;

    public Element(String namespaceURI, String localName) {
        // implementation
    }

    public Attribute absUrl(String attrKey) {
        return new Attribute(attrKey);
    }
}

// Attribute.java
public class Attribute extends TypedValue {
    public Attribute(String value) {
        super(value);
    }

    public String toString() {
        return value;
    }
}

// Attributes.java
public class Attributes {
    private Map<String, String> attributes = new HashMap<>();

    public void put(String key, String value) {
        attributes.put(key, value);
    }

    public boolean hasKeyIgnoreCase(String key) {
        // implementation
    }

    public Optional<String> getIgnoreCase(String key) {
        return Optional.ofNullable(attributes.get(key));
    }
}

// TypedValue.java
public abstract class TypedValue {
    protected String value;

    public TypedValue(String value) {
        Validate.notNull(value);
        this.value = value;
    }

    @Override
    public int hashCode() {
        // implementation
    }

    @Override
    public boolean equals(Object obj) {
        // implementation
    }
}

// All.java
public class All extends TagName {
    public All(String value) {
        super(value);
    }
}

// EnforcedAttributes.java
public class EnforcedAttributes {
    private Map<TagName, Attributes> enforced = new HashMap<>();

    public void put(TagName tag, Attributes attrs) {
        enforced.put(tag, attrs);
    }

    public Optional<Attributes> get(TagName tag) {
        return Optional.ofNullable(enforced.get(tag));
    }
}

// EnforcedAttribute.java
public class EnforcedAttribute extends TypedValue {
    private String key;
    private String value;

    public EnforcedAttribute(String key, String value) {
        super(value);
        this.key = key;
    }

    public EnforcedAttribute(EnforcedAttribute other) {
        this(key, other.value);
    }
}

// AttributeKey.java
public class AttributeKey extends TypedValue {
    public AttributeKey(String value) {
        super(value);
    }
}

// TagName.java
public class TagName extends TypedValue {
    public TagName(String value) {
        super(value);
    }

    public static TagName valueOf(String value) {
        return new TagName(value);
    }
}

// AllTest.java
import org.junit.Test;

public class AllTest {

    @Test
    public void testAll() {
        All all = new All("All");
        // implementation
    }

}