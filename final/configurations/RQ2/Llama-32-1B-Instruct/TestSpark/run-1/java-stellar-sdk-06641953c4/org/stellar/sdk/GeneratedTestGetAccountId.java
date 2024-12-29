package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    private EdDSAPublicKey publicKey;

    @Test
    public void testGetAccountId() {
        // Arrange
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));

        // Assert
        assertEquals(accountId, keyPair.getAccountId());
    }

}