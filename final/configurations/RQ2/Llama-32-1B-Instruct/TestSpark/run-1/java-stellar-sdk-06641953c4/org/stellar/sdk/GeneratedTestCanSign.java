package org.stellar.sdk;

public class GeneratedTestCanSign {

    private EdDSAPublicKey publicKey;

    @Test
    public void testCanSign() {
        // Arrange
        char[] seed = "some_seed".getBytes();
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Assert
        assertTrue(keyPair.canSign());
    }

}