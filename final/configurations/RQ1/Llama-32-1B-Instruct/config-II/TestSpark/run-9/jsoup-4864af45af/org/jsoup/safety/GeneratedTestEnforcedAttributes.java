package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestEnforcedAttributes {

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

}