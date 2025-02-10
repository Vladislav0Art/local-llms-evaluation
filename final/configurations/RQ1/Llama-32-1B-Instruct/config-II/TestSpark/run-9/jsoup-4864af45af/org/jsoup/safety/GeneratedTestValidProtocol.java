package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestValidProtocol {

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