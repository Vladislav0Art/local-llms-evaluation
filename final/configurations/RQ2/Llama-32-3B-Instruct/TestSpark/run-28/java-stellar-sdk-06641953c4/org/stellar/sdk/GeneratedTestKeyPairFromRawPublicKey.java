package org.stellar.sdk;

public class GeneratedTestKeyPairFromRawPublicKey {

    @Test
    public void testKeyPairFromRawPublicKey() throws Exception {
        // Arrange
        byte[] publicKeyBytes = "your_public_key_bytes".getBytes();
        PublicKey publicKey = new PublicKey(publicKeyBytes);

        // Act
        KeyPair keyPair = KeyPair.fromRawPublicKey(publicKey);

        // Assert
        assertNotNull(keyPair);
    }

}