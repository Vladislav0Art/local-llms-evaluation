package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        // Arrange
        byte[] publicKey = new byte[]{1, 2, 3};

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);

        // Assert
        Preconditions.checkThat(keyPair.getXdrSignerKey(), isNotNull());
    }

}