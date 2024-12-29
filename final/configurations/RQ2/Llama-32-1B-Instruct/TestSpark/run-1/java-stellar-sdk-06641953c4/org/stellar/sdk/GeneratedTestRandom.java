package org.stellar.sdk;

public class GeneratedTestRandom {

    private EdDSAPublicKey publicKey;

    @Test
    public void testRandom() {
        // Arrange
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'s', 'o', 'm', 'e', ' ', 't'});

        // Assert
        assertNotNull(keyPair);
    }

}