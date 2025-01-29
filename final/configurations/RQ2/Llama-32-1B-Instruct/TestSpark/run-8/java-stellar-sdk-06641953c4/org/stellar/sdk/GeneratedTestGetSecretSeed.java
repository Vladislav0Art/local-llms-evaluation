package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        char[] secretSeedArray = publicKey.getSecretSeed();

        // Assert
        Preconditions.checkArgument(secretSeedArray != null, "KeyPair should have a secret seed");
    }

}