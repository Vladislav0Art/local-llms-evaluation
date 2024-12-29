package org.stellar.sdk;

public class GeneratedTestSignDecorated {

    private EdDSAPublicKey publicKey;

    @Test
    public void testSignDecorated() {
        // Arrange
        String accountId = "some_account_id";
        byte[] data = new byte[]{1, 2, 3};

        // Act
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));
        DecoratedSignature signature = keyPair.signDecorated(data);

        // Assert
        assertNotNull(signature);
    }

}