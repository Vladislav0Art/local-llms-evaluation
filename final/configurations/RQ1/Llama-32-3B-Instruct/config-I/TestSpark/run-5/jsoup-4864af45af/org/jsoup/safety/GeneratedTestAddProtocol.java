package org.jsoup.safety;

public class GeneratedTestAddProtocol {

    private final Map<String, Attributes> attributes = new HashMap<>();
    private final Map<String, AttributeValue> enforcedAttributes = new HashMap<>();
    private final Set<Protocol> protocols;

    public TagAttributeEnforcer() {
        this.protocols = new HashSet<>();
    }

    public void addAttribute(String tagName, String attributeName, String attributeValue) {
        Attributes attributes = getAttributes(tagName);
        if (attributes == null) {
            attributes = new Attributes();
            this.attributes.put(tagName, attributes);
        }

        AttributeKey key = AttributeKey.valueOf(attributeName);
        attributes.add(key, AttributeValue.valueOf(attributeValue));
    }

    public void addEnforcedAttribute(String tagName, String attributeName, String attributeValue) {
        Attributes attributes = getAttributes(tagName);
        if (attributes == null) {
            attributes = new Attributes();
            this.attributes.put(tagName, attributes);
        }

        AttributeKey key = AttributeKey.valueOf(attributeName);
        attributes.add(key, AttributeValue.valueOf(attributeValue));
    }

    public void addProtocol(Protocol protocol) {
        this.protocols.add(protocol);
    }

    public boolean hasProtocol(String name) {
        return this.protocols.contains(Protocol.valueOf(name));
    }
}

public class TagAttributeEnforcerTest {

    @Test
    public void testAddProtocol() throws Exception {
        TagAttributeEnforcer enforcer = new TagAttributeEnforcer();

        Protocol protocol1 = new Protocol("http://example.com");
        enforcer.addProtocol(protocol1);

        Assert.assertTrue(enforcer.hasProtocol("http://example.com"));
    }
}

public class AttributeKey {

    private final String name;

    public AttributeKey(String name) {
        this.name = name;
    }

    public static AttributeKey valueOf(String name) {
        return new AttributeKey(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AttributeKey other = (AttributeKey) obj;
        return Objects.equals(name, other.name);
    }
}

public class AttributeValue {

    private final String value;

    public AttributeValue(String value) {
        this.value = value;
    }

    public static AttributeValue valueOf(String value) {
        return new AttributeValue(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AttributeValue other = (AttributeValue) obj;
        return Objects.equals(value, other.value);
    }
}

public class Protocol {

    private final String name;

    public Protocol(String name) {
        this.name = name;
    }

    public static Protocol valueOf(String name) {
        return new Protocol(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Protocol other = (Protocol) obj;
        return Objects.equals(name, other.name);
    }
}

public class Attributes {

    private final Map<AttributeKey, AttributeValue> map;

    public Attributes() {
        this.map = new HashMap<>();
    }

    public void add(AttributeKey key, AttributeValue value) {
        map.put(key, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Attributes other = (Attributes) obj;
        return Objects.equals(map, other.map);
    }

}