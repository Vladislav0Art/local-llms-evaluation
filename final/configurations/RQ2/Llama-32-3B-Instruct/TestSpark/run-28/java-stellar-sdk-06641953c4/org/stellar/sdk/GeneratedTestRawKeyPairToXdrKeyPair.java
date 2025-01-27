package org.stellar.sdk;

public class GeneratedTestRawKeyPairToXdrKeyPair {

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