package org.stellar.sdk;

public class GeneratedTestKeyPairCreation {

    @Test
    public void testKeyPairCreation() {
        //Arrange
        KeyPair keyPair = new KeyPair();

        //Act
        assertNotNull(keyPair);

        //Assert
        assertTrue(keyPair.getPrivateKey() != null);
        assertTrue(keyPair.getPublicKey() != null);
    }

}