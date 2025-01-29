package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        // Arrange
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{'a', 'b', 'c'}));

        // Act
        boolean canSign = KeyPair.canSign(publicKey);

        // Assert
        Preconditions.checkThat(canSign, isTrue);
    }

}