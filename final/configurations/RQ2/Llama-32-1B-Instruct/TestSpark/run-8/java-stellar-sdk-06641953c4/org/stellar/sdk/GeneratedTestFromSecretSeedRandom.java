package org.stellar.sdk;

public class GeneratedTestFromSecretSeedRandom {

    @Test
    public void testFromSecretSeedRandom() {
        // Arrange
        byte[] secretSeedArray = new byte[]{1, 2};
        KeyPair keyPair = Keypair.fromSecretSeed(secretSeedArray);

        // Act
        String publicKeyBytes = Arrays.toString(keyPair.getPublicKey());

        // Assert
        Preconditions.checkArgument(publicKeyBytes != null, "KeyPair should have a public key");
    }

}