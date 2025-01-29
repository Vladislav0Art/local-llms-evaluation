package org.stellar.sdk;

public class GeneratedTestCanSign_WithValidKey {

    @Test
    public void testCanSign_WithValidKey() {
        // Arrange
        EdDSAPublicKey publicKey = KeyPair.fromPublicKey("valid-privkey");
        boolean result = KeyPair.canSign();
        String expectedMessage = "true";

        // Act
        assertTrue(result, expectedMessage);

        // Assert
        assertEquals(expectedMessage, KeyPair.canSign().toString());
    }

}