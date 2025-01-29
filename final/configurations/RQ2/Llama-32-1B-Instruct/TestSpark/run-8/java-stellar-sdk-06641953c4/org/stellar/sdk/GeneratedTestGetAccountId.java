package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        String accountId = publicKey.getAccountId();

        // Assert
        Preconditions.checkArgument(accountId != null, "KeyPair should have an account ID");
    }

}