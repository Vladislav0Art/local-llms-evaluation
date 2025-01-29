package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        // Arrange
        PublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);

        // Act
        EdDSAPublicKey getXdrPublicKey = keyPair.getXdrPublicKey();

        // Assert
        Preconditions.checkNotNull(getXdrPublicKey, "keyPair should not be null");
    }

}