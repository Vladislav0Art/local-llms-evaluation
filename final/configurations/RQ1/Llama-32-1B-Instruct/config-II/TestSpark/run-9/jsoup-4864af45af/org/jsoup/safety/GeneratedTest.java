package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testEnforcedAttributes() {
        // Given
        Element element = new Element("test");

        // When
        Attributes attrs = new Attributes();

        // Then
        assert attrs.containsKey(tagName);
        String expectedValue = "test_value";
        Assert.assertEquals(expectedValue, attrs.getValue(tagName));

        AttrValue attrValue = new AttributeValue("expected_value");
        attrs.put(tagName, attrValue);
        assert attrs.containsKey(tagName);
        Assert.assertEquals(attrValue.toString(), attrs.getValue(tagName));
    }

    @Test
    public void testEnforceAttribute() {
        // Given
        Element element = new Element("test");
        AttrValue attribute = new AttributeValue("expected_value");

        // When
        Attributes enforcedAttributes = new Attributes();
        enforcedAttributes.putAll(new HashMap<AttributeKey, AttributeValue>() {{
            put(tagName, attribute);
        }});
        enforceAttribute(element, attribute);

        // Then
        Assert.assertTrue(enforcedAttributes.containsKey(tagName));
        String expectedValue = "expected_value";
        Assert.assertEquals(expectedValue, enforcedAttributes.getValue(tagName));
    }

    @Test
    public void testEnforceTag() {
        // Given
        Element element = new Element("test");
        AttrValue attribute = new AttributeValue("expected_value");

        // When
        Attributes enforcedAttributes = new Attributes();
        enforcedAttributes.putAll(new HashMap<AttributeKey, AttributeValue>() {{
            put(tagName, attribute);
        }});

        enforceTag(element, attribute);

        // Then
        Assert.assertTrue(enforcedAttributes.containsKey(tagName));
        String expectedValue = "expected_value";
        Assert.assertEquals(expectedValue, enforcedAttributes.getValue(tagName));
    }

    @Test
    public void testValidProtocol() {
        // Given
        Element element = new Element("test");
        AttrValue attribute = new AttributeValue("expected_value");

        // When
        enforceAttribute(element, attribute);

        // Then
        Assert.assertTrue(isValidAnchor(attribute.getValue()));
    }

}