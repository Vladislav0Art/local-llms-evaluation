package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey {

    private EdDSAPublicKey publicKey;

    @Test
    public void testGetXdrPublicKey() {
        // Arrange
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));

        // Assert
        assertNotNull(keyPair.getXdrPublicKey());
    }

}