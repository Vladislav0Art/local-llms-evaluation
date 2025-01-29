package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        // Arrange
        byte[] seed = {'c', 'd'};

        // Act
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Assert
        Preconditions.checkThat(keyPair.getAccountId(), isStringWithLength(2));
        Preconditions.checkThat(keyPair.getSecretSeed(), checkArrayIsEqual('c', 'd'));
    }

}