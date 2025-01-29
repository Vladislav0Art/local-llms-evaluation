package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        // Arrange
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey.getEncoded());

        // Act
        boolean canSign = keyPair.canSign();

        // Assert
        Preconditions.checkNotNull(canSign, "keyPair should not be null");
    }

}