package org.stellar.sdk;

public class GeneratedTestGetSignatureHint {

    private EdDSAPublicKey publicKey;

    @Test
    public void testGetSignatureHint() {
        // Arrange
        String accountId = "some_account_id";

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));

        // Assert
        assertNotNull(keyPair.getSignatureHint());
    }

}