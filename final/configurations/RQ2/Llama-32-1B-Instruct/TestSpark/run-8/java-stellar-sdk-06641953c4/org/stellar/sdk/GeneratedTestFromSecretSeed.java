package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        // Arrange
        char[] secretSeedArray = 'a'.getBytes();
        KeyPair keyPair = Keypair.fromSecretSeed(secretSeedArray);

        // Act
        String publicKeyBytes = Arrays.toString(keyPair.getPublicKey());

        // Assert
        Preconditions.checkArgument(publicKeyBytes != null, "KeyPair should have a public key");
    }

}