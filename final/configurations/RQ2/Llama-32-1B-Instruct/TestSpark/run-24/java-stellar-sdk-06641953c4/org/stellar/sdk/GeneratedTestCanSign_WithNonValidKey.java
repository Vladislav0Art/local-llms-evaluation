package org.stellar.sdk;

public class GeneratedTestCanSign_WithNonValidKey {

    @Test
    public void testCanSign_WithNonValidKey() {
        // Arrange
        EdDSAPublicKey invalidPublicKey = KeyPair.fromInvalidPublicKey("invalid-privkey");
        boolean result = KeyPair.canSign();
        String expectedMessage = "false";

        // Act
        assertFalse(result, expectedMessage);

        // Assert
        assertEquals(expectedMessage, KeyPair.canSign().toString());
    }

}