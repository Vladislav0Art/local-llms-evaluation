package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        // Arrange
        String bip39Seed = "bip39 seed";
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);

        // Act
        EdDSAPublicKey publicKey = keyPair.getPublicKey();

        // Assert
        Preconditions.checkNotNull(publicKey, "keyPair should not be null");
    }

}