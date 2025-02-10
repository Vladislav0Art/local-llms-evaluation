package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestNoAttribute {

    @Test
    public void testNoAttribute() {
        // Given
        Element el = new Element("a");

        // When
        boolean result = ProtocolType.testValidProtocol(el, null);

        // Then
        System.out.println(result);  // false
    }

}