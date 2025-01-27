package org.stellar.sdk;

public class GeneratedTestXdrKeyPairToRawPublicKey {

    @Test
    public void testXdrKeyPairToRawPublicKey() throws Exception {
        // Arrange
        XdrKeyPair xdrKeyPair = new XdrKeyPair("your_xdr_key_pair_string");
        PublicKey publicKey = null;

        // Act
        publicKey = KeyPair.fromXdrKeyPair(xdrKeyPair).getPublic();

        // Assert
        assertNotNull(publicKey);
    }

}