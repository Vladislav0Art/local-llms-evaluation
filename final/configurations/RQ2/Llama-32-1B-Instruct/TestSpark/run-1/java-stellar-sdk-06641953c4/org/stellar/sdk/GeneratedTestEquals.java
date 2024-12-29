package org.stellar.sdk;

public class GeneratedTestEquals {

    private EdDSAPublicKey publicKey;

    @Test
    public void testEquals() {
        // Arrange
        String accountId1 = "some_account_id";
        String accountId2 = "some_other_account_id";

        // Act
        KeyPair keyPair1 = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));
        KeyPair keyPair2 = new KeyPair(EdDSAPublicKey.fromEncodedBytes(new byte[]{'s', 'o', 'm', 'e', ' ', 't'}));

        // Assert
        assertTrue(keyPair1.equals(keyPair2));
    }

}