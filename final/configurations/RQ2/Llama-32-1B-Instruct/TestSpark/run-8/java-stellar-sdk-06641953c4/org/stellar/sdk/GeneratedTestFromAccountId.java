package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey1 = Keypair.fromPublicKey(secretSeed.getBytes());
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Assert
        Preconditions.checkArgument(keyPair != null, "KeyPair should be created from an account ID");
    }

}