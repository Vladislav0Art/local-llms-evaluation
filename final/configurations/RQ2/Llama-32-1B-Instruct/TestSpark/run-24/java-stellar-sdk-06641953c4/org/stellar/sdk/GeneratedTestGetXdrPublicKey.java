package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey {

    @Test
    public void testGetXdrPublicKey() {
        // Arrange
        byte[] publicKey = "some-public-key";
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);

        // Act
        PublicKey expectedValue = keyPair.getXdrPublicKey();

        // Assert
        assertEquals(expectedValue, keyPair.getXdrPublicKey());
    }

}