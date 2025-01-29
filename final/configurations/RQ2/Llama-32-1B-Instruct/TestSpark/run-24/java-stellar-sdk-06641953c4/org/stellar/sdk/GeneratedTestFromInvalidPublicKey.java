package org.stellar.sdk;

public class GeneratedTestFromInvalidPublicKey {

    @Test
    public void testFromInvalidPublicKey() {
        // Arrange
        EdDSAPublicKey invalidPublicKey = new EdDSAPublicKey("invalid-privkey");

        // Act
        boolean result = KeyPair.fromInvalidPublicKey(invalidPublicKey.toString());

        // Assert
        assertTrue(result, "Expected false");
    }

}