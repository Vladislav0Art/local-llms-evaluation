package org.stellar.sdk;

public class GeneratedTestSign {

    private EdDSAPublicKey publicKey;

    @Test
    public void testSign() {
        // Arrange
        String accountId = "some_account_id";
        byte[] data = new byte[]{1, 2, 3};

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));
        Signature signature = keyPair.sign(data);

        // Assert
        assertNotNull(signature);
    }

}