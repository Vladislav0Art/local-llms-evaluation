package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        // Arrange
        EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(new byte[]{4, 5, 6});

        // Act
        KeyPair keyPair = KeyPair.fromXdrSignerKey(privateKeySpec);

        // Assert
        Preconditions.checkThat(keyPair.getXdrPublicKey(), isNotNull());
    }

}