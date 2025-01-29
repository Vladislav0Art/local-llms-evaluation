package org.stellar.sdk;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        // Arrange
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey.getEncoded());

        // Act
        SignatureHint getSignatureHint = keyPair.getSignatureHint();

        // Assert
        Preconditions.checkNotNull(getSignatureHint, "keyPair should not be null");
    }

}