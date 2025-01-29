package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey {

    @Test
    public void testGetXdrPublicKey() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        PublicKey xdrPublicKey = KeyPair.toXdrPublicKey(publicKey);

        // Assert
        Preconditions.checkArgument(xdrPublicKey != null, "KeyPair should have an XDR public key");
    }

}