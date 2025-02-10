package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestValidProtocol {

    @Test
    public void testValidProtocol() {
        // Given
        Element el = new Element("a", "href", "#");
        Attribute attr = new Attribute("value", "#anchor");

        // When
        boolean result1 = ProtocolType.testValidProtocol(el, attr);
        boolean result2 = ProtocolType.testValidProtocol(new Element("b", "href", "#"), attr);

        // Then
        System.out.println(result1);  // true
        System.out.println(result2);  // false
    }

}