package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestEnforcedAttribute {

    private Protocol protocol = new Protocol("http://example.com");

    @Test
    public void testEnforcedAttribute() {
        // Arrange
        String tagName = All;
        Set<AttributeKey> enforcedSet = new HashSet<>();
        enforcedSet.add(AttributeKey.of("example", "http://example.com"));
        List<AttributeValue> values = new ArrayList<>(Collections.singletonList(AttributeValue.of("value", "https://example.net")));
        AttributeValue attr = new AttributeValue(valueOf(tagName, tagName, values));
        Map<AttributeKey, AttributeValue> keyVals = new HashMap<>();
        keyVals.put(AttributeKey.of("example", "http://example.com"), attr);
        enforcedAttributes.put(tagName, keyVals);

        // Act
        boolean isValid = isSafeAttribute(tagName, null, attr);

        // Assert
        assertTrue(isValid);
    }

    private boolean testValidProtocol(Element el, Attribute attr) {
        return !preserveRelativeLinks && testValidProtocol(All, el, attr, new HashSet<>());
    }

}