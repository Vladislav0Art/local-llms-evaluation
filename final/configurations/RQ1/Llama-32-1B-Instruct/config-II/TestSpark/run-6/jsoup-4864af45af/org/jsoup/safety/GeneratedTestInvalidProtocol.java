package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestInvalidProtocol {

    private Protocol protocol = new Protocol("http://example.com");

    @Test
    public void testInvalidProtocol() {
        // Arrange
        String value = "https://example.net";
        Set<Protocol> protocols = new HashSet<>();
        protocols.add(protocol);
        protocol.setValue(value);

        // Act
        boolean isValid = testValidProtocol(All, null, value, protocols);

        // Assert
        assertFalse(isValid);
    }

}