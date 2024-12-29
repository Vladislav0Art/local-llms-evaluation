package org.stellar.sdk;

public class GeneratedTestSignature {

    @Test
    public void testSignature() {
        // Arrange
        Keypair keyPair = new Keypair(KeypairType.RSASEED, KeypairType.SECRETKEY);

        // Act and Assert
        assertTrue(keyPair.canSign());
    }

}