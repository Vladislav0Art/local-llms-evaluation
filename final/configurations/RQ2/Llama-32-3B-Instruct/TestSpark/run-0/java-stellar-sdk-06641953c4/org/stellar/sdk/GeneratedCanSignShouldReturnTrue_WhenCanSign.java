package org.stellar.sdk;

public class GeneratedCanSignShouldReturnTrue_WhenCanSign {

    @Test
    public void canSignShouldReturnTrue_WhenCanSign() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.generateRandom();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}