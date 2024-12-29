package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    private EdDSAPublicKey publicKey;

    @Test
    public void testFromXdrSignerKey() {
        // Arrange
        byte[] signerPayload = new byte[]{1, 2, 3, 4, 5};

        // Act
        KeyPair keyPair = KeyPair.fromXdrSignerKey(new SignerKey(signerPayload));

        // Assert
        assertNotNull(keyPair);
    }

}