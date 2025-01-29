package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        // Arrange
        KeyPair keyPair = KeyPair.random();

        // Act
        EdDSAPublicKey publicKey = keyPair.getPublicKey();

        // Assert
        Preconditions.checkNotNull(publicKey, "keyPair should not be null");
    }

}