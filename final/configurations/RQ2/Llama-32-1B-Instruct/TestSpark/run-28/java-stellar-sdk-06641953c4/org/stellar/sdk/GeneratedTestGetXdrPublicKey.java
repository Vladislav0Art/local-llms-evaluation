package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey {

    @Test
    public void testGetXdrPublicKey() {
        // Arrange
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);

        // Act
        PublicKey getXdrPublicKey = keyPair.getXdrPublicKey();

        // Assert
        Preconditions.checkNotNull(getXdrPublicKey, "keyPair should not be null");
    }

}