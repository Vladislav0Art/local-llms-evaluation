package org.stellar.sdk;

public class GeneratedTestKeyPairFromXdrPublicKey {

    @Test
    public void testKeyPairFromXdrPublicKey() throws Exception {
        // Arrange
        byte[] publicKeyBytes = "your_public_key_bytes".getBytes();
        XdrPublicKey xdrPublicKey = new XdrPublicKey(publicKeyBytes);

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);

        // Assert
        assertNotNull(keyPair);
    }

}