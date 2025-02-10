package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestNotValidProtocol {

    @Test
    public void testNotValidProtocol() {
        // Given
        Element el = new Element("a", "href", "#");

        // When
        boolean result1 = ProtocolType.testValidProtocol(el, null);
        boolean result2 = ProtocolType.testValidProtocol(new Element("b", "href", "#"), null);

        // Then
        System.out.println(result1);  // false
        System.out.println(result2);  // true
    }

}