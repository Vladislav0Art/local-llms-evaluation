package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        // Arrange
        String accountId = "account id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Act
        byte[] publicKey = keyPair.getPublicKey();

        // Assert
        Preconditions.checkNotNull(publicKey, "keyPair should not be null");
    }

}