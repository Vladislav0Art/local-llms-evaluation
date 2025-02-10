package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestEnforceTag {

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

}