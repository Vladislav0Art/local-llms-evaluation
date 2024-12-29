package org.stellar.sdk;

public class GeneratedTestSignPayloadDecorated {

    private EdDSAPublicKey publicKey;

    @Test
    public void testSignPayloadDecorated() {
        // Arrange
        String accountId = "some_account_id";
        byte[] signerPayload = new byte[]{1, 2, 3};

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));
        Signature signature = keyPair.signDecorated(signerPayload);

        // Assert
        assertNotNull(signature);
    }

}