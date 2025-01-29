package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        // Arrange
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);

        // Act
        byte[] getPublicKey = keyPair.getPublicKey();

        // Assert
        Preconditions.checkNotNull(getPublicKey, "keyPair should not be null");
    }

}