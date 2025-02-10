package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestRelativeProtocol {

    private Protocol protocol = new Protocol("http://example.com");

    @Test
    public void testRelativeProtocol() {
        // Arrange
        String value = "https://example.com/path";
        Set<Protocol> protocols = new HashSet<>();
        protocols.add(protocol);
        protocol.setValue(value);

        // Act
        boolean isValid = testValidProtocol(All, null, value, protocols);

        // Assert
        assertTrue(isValid);
    }

}