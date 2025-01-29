package org.stellar.sdk;

public class GeneratedTestGetSignerKey {

    @Test
    public void testGetSignerKey() {
        // Arrange
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey.getEncoded());

        // Act
        SignerKey getXdrSignerKey = keyPair.getXdrSignerKey();

        // Assert
        Preconditions.checkNotNull(getXdrSignerKey, "keyPair should not be null");
    }

}