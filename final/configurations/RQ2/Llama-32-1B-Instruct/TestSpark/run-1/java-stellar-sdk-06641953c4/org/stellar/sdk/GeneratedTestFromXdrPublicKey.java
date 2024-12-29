package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    private EdDSAPublicKey publicKey;

    @Test
    public void testFromXdrPublicKey() {
        // Arrange
        PublicKey key = new PublicKey();

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);

        // Assert
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
    }

}