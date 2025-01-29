package org.stellar.sdk;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() {
        // Arrange
        byte[] publicKey = new byte[]{1, 2, 3};

        // Act
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);

        // Assert
        Preconditions.checkThat(keyPair.getAccountId(), isNull());
        Preconditions.checkThat(keyPair.getSecretSeed(), checkArrayIsEqual('a', 'b'));
    }

}