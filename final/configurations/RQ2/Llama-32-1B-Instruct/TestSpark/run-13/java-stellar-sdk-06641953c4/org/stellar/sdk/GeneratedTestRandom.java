package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        // Arrange
        int seed = 42;

        // Act
        KeyPair keyPair = KeyPair.random();

        // Assert
        Preconditions.checkThat(keyPair.getAccountId(), isNull());
        Preconditions.checkThat(keyPair.getSecretSeed(), checkArrayIsEqual('x', 'y'));
    }

}