package org.stellar.sdk;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey1 = Keypair.fromPublicKey(secretSeed.getBytes());
        EdDSAPublicKey publicKey2 = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        boolean equals = publicKey1.equals(publicKey2);

        // Assert
        Preconditions.checkArgument(equals, "KeyPair should be equal");
    }

}