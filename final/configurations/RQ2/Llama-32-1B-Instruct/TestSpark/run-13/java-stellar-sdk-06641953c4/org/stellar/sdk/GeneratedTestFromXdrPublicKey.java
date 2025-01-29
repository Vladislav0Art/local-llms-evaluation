package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        // Arrange
        PublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);

        // Assert
        Preconditions.checkThat(keyPair.getXdrSignerKey(), isNotNull());
    }

}