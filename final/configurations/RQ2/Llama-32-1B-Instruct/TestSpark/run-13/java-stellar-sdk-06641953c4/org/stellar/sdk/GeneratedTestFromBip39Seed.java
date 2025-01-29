package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        // Arrange
        byte[] seed = {'x', 'y'};

        // Act
        KeyPair keyPair = KeyPair.fromBip39Seed(seed);

        // Assert
        Preconditions.checkThat(keyPair.getAccountId(), isStringWithLength(2));
    }

}