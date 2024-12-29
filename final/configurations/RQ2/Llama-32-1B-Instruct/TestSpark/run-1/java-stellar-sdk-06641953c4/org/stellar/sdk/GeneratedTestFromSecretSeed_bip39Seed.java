package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_bip39Seed {

    private EdDSAPublicKey publicKey;

    @Test
    public void testFromSecretSeed_bip39Seed() {
        // Arrange
        char[] seed = "some_seed".getBytes();
        String accountId = "some_account_id";
        byte[] bip39Seed = "some_bip39_seed".getBytes();

        // Act
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);

        // Assert
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}