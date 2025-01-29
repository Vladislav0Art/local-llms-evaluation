package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        byte[] publicKeyBytes = publicKey.getPublicKey();

        // Assert
        Preconditions.checkArgument(publicKeyBytes != null, "KeyPair should have a public key");
    }

}