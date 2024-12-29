package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    private EdDSAPublicKey publicKey;

    @Test
    public void testFromSecretSeed() {
        // Arrange
        char[] seed = "some_seed".getBytes();
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Assert
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}