package org.stellar.sdk;

public class GeneratedTestNoCanSign {

    @Test
    public void testNoCanSign() {
        // Arrange
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{'a', 'b'}));

        // Act
        boolean canSign = KeyPair.canSign(publicKey);

        // Assert
        Preconditions.checkThat(canSign, isFalse);
    }

}