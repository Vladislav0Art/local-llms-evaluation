package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        // Arrange
        PublicKey publicKey = new XdrPublicKeys.XdrPublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);

        // Act
        String expectedValue = "some-xdr-public-key";

        // Assert
        assertEquals(expectedValue, keyPair.getXdrPublicKey().toString());
    }

}