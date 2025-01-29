package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        // Arrange
        byte[] publicKey = new byte[]{1, 2, 3};

        // Act
        PublicKey keyPair = KeyPair.fromPublicKey(publicKey);

        // Assert
        Preconditions.checkThat(keyPair.getXdrPublicKey(), isNotNull());
    }

}