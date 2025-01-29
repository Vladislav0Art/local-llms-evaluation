package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        // Arrange
        SignerKey signerKey = new SignerKey();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);

        // Act
        EdDSAPublicKey getXdrSignerKey = keyPair.getXdrSignerKey();

        // Assert
        Preconditions.checkNotNull(getXdrSignerKey, "keyPair should not be null");
    }

}