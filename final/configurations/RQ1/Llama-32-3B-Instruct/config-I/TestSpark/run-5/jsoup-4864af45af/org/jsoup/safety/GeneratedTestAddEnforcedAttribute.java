package org.jsoup.safety;

public class GeneratedTestAddEnforcedAttribute {

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
    public void testAddEnforcedAttribute() throws Exception {
        TagAttributeEnforcer enforcer = new TagAttributeEnforcer();

        String tagName = "div";
        String attributeName = "href";
        String attributeValue = "#anchor";

        enforcer.addEnforcedAttribute(tagName, attributeName, attributeValue);

        Assert.assertTrue(enforcer.getAttributes().get(tagName).containsKey(AttributeKey.valueOf(attributeName)));
    }

}