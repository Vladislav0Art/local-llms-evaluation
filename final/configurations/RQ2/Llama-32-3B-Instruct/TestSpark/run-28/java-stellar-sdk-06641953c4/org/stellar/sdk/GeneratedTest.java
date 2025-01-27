package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testKeyPairFromXdrPublicKey() throws Exception {
        // Arrange
        byte[] publicKeyBytes = "your_public_key_bytes".getBytes();
        XdrPublicKey xdrPublicKey = new XdrPublicKey(publicKeyBytes);

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);

        // Assert
        assertNotNull(keyPair);
    }

    @Test
    public void testKeyPairFromRawPublicKey() throws Exception {
        // Arrange
        byte[] publicKeyBytes = "your_public_key_bytes".getBytes();
        PublicKey publicKey = new PublicKey(publicKeyBytes);

        // Act
        KeyPair keyPair = KeyPair.fromRawPublicKey(publicKey);

        // Assert
        assertNotNull(keyPair);
    }

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

    @Test
    public void testRawKeyPairToXdrKeyPair() throws Exception {
        // Arrange
        KeyPair keyPair = new KeyPair("your_key_pair_string");
        XdrKeyPair xdrKeyPair = null;

        // Act
        xdrKeyPair = KeyPair.toXdrKeyPair(keyPair);

        // Assert
        assertNotNull(xdrKeyPair);
    }

}