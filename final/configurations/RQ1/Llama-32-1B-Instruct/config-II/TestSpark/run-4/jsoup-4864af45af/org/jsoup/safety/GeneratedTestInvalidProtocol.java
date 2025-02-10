package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestInvalidProtocol {

    @Test
    public void testInvalidProtocol() {
        // Given
        Element el = new Element("a", "href", "#");
        Attribute attr = new Attribute("value", "");

        // When
        boolean result1 = ProtocolType.testValidProtocol(el, attr);
        boolean result2 = ProtocolType.testValidProtocol(new Element("b", "href", "#"), attr);

        // Then
        System.out.println(result1);  // false
        System.out.println(result2);  // true
    }

}