package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        boolean canSign = publicKey.canSign();

        // Assert
        Preconditions.checkArgument(canSign, "KeyPair should be able to sign");
    }

}